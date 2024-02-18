package org.developmentaid.challenge.service

import com.google.gson.Gson
import org.developmentaid.challenge.config.ApplicationProps
import org.developmentaid.challenge.exception.GeneralException
import org.developmentaid.challenge.model.RootResponseDto
import org.developmentaid.challenge.model.UserDto
import org.developmentaid.challenge.network.StackExchangeApi
import org.springframework.stereotype.Service
import retrofit2.HttpException
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.io.IOException

@Service
class FetchingServiceImpl(
        props: ApplicationProps
) : FetchingService {

    private val useMockData: Boolean = props.useMockData

    private val mockDataUrl: String = props.mockDataUrl

    private val retrofit = Retrofit.Builder()
            .baseUrl(props.baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    private val stackExchangeApi = retrofit.create(StackExchangeApi::class.java)

    override suspend fun getUsers(): List<UserDto> {
        try {
            val responseBody = if (useMockData) {
                getUsersFromJsonFile(mockDataUrl)
            } else {
                val response = stackExchangeApi.getUsers()
                if (response.isSuccessful) {
                    response.body()?.items ?: emptyList()
                } else {
                    throw GeneralException("Failed to fetch users from Stack Overflow API: ${response.message()}")
                }
            }
            return responseBody.filter { user ->
                isUserQualified(user)
            }
        } catch (e: IOException) {
            throw GeneralException("Network error occurred", e)
        } catch (e: HttpException) {
            throw GeneralException("HTTP error occurred: ${e.code()}", e)
        }
    }

    suspend fun getUsersFromJsonFile(jsonFilePath: String): List<UserDto> {
        val fileContent = File(jsonFilePath).readText()
        return Gson().fromJson(fileContent, RootResponseDto::class.java).items
    }

    private fun isUserQualified(user: UserDto): Boolean {
        return (user.location == "Romania" || user.location == "Moldova")
                && user.reputation >= 223
                && user.answerCount >= 1
                && user.collectives?.any { collectiveMembership ->
            collectiveMembership.collective.tags.any { tag ->
                tag in listOf("java", ".net", "docker", "C#")
            }
        } ?: false
    }

}
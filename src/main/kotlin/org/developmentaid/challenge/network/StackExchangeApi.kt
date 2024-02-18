package org.developmentaid.challenge.network

import org.developmentaid.challenge.model.RootResponseDto
import retrofit2.Response
import retrofit2.http.GET

interface StackExchangeApi {
    @GET("/2.3/users?pagesize=100&order=asc&min=223&sort=reputation&site=stackoverflow")
    suspend fun getUsers(): Response<RootResponseDto>
}
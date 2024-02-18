package org.developmentaid.challenge.service

import org.developmentaid.challenge.model.UserDto

interface FetchingService {
    suspend fun getUsers(): List<UserDto>
}
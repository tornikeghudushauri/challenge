package org.developmentaid.challenge.model

import com.google.gson.annotations.SerializedName

data class RootResponseDto(
    @SerializedName("items")
    val items: List<UserDto>
)

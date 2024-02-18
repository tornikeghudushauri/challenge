package org.developmentaid.challenge.model

import kotlinx.serialization.Serializable

@Serializable
data class BadgeCountsDto(
        val bronze: Int,
        val silver: Int,
        val gold: Int
)
package org.developmentaid.challenge.model

import kotlinx.serialization.Serializable

@Serializable
data class CollectiveMembershipDto(
        val collective: CollectiveDto,
        val role: String
)
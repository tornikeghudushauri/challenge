package org.developmentaid.challenge.model

import kotlinx.serialization.Serializable

@Serializable
data class CollectiveExternalLinkDto(
        val type: String,
        val link: String
)
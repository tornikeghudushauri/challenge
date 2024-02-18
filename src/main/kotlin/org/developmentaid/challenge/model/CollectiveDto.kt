package org.developmentaid.challenge.model

import kotlinx.serialization.Serializable

@Serializable
data class CollectiveDto(
        val tags: List<String>,
        val externalLinks: List<CollectiveExternalLinkDto>,
        val description: String,
        val link: String,
        val name: String,
        val slug: String
)
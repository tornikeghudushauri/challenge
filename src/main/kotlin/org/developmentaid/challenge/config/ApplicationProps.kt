package org.developmentaid.challenge.config

import org.springframework.context.annotation.Configuration

@Configuration
class ApplicationProps {
    val baseUrl: String = "https://api.stackexchange.com"

    val mockDataUrl: String = "users.json"

    val useMockData: Boolean = false
}
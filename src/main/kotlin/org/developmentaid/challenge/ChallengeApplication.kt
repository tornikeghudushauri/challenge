package org.developmentaid.challenge

import org.developmentaid.challenge.config.ApplicationProps
import org.developmentaid.challenge.service.FetchingServiceImpl
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChallengeApplication

suspend fun main(args: Array<String>) {
    runApplication<ChallengeApplication>(*args)
    val props = ApplicationProps()
    val fetchingService = FetchingServiceImpl(props)
    val users = fetchingService.getUsers()
    println(users)
}

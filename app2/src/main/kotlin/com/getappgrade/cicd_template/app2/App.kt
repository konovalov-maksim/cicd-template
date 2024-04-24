package com.getappgrade.cicd_template.app1

import jakarta.annotation.PostConstruct
import mu.KotlinLogging
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Component

@SpringBootApplication
class App

private val log = KotlinLogging.logger { }

fun main(args: Array<String>) {
    runApplication<App>(*args)
}

@Component
class Template(
    private val appContext: ApplicationContext
) {

    @PostConstruct
    fun init() {
        log.info { "Active profiles: ${appContext.environment.activeProfiles.joinToString()}" }
    }

}
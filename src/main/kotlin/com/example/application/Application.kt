package com.example.application

import com.vaadin.flow.component.page.AppShellConfigurator
import com.vaadin.flow.server.PWA
import com.vaadin.flow.theme.Theme
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

/**
 * The entry point of the Spring Boot application.
 *
 * Use the @PWA annotation make the application installable on phones, tablets
 * and some desktop browsers.
 *
 */
@SpringBootApplication
@Theme(value = "hilla-kotlin")
@PWA(name = "hilla-kotlin", shortName = "hilla-kotlin", offlineResources = [])
open class Application : SpringBootServletInitializer(), AppShellConfigurator {
    fun main(args: Array<String>) {
        runApplication<Application>(*args)
    }
}
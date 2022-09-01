package com.example.application.endpoints.helloworld

import com.vaadin.flow.server.auth.AnonymousAllowed
import dev.hilla.Endpoint
import dev.hilla.Nonnull

@Endpoint
@AnonymousAllowed
class HelloWorldEndpoint {
    fun sayHello(name: String): String {
        return if (name.isEmpty()) {
            "Hello stranger"
        } else {
            "Hello $name"
        }
    }
}
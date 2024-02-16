package com.truongdq.ktor.plugins

import com.truongdq.ktor.routes.applicationRouting
import com.truongdq.ktor.routes.customerRouting
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        applicationRouting()
        customerRouting()
    }
}

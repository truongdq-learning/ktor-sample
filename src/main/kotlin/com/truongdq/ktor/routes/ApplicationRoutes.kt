package com.truongdq.ktor.routes

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.applicationRouting() {
    route("/"){
        get {
            call.respondText("Hello world!")
        }
    }
}
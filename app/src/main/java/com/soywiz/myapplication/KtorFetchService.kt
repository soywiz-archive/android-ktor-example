package com.soywiz.myapplication

import android.app.*
import android.content.*
import android.os.*
import android.util.*
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

class KtorFetchService : Service() {
    override fun onBind(intent: Intent?): IBinder {
        Log.e("KtorFetchService", "onBind")
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private val HTTP_PORT = 7070
    override fun onCreate() {
        Log.e("KtorFetchService", "onCreate")
        embeddedServer(Netty, HTTP_PORT) {
            routing {
                get("/") {
                    call.respondText("My Example Fetch", ContentType.Text.Html)
                }
            }
        //}.start(wait = true)
        }.start(wait = false)
        super.onCreate()
    }
}
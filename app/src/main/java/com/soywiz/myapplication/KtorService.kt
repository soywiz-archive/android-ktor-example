package com.soywiz.myapplication

import android.app.*
import android.content.*
import android.widget.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

/*
class KtorService : IntentService("KTOR") {
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Toast.makeText(this, "onStartCommand", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId)
    }

    protected override fun onHandleIntent(workIntent: Intent) {
        // Gets data from the incoming Intent
        val dataString = workIntent.dataString
        Toast.makeText(this, "onHandleIntent", Toast.LENGTH_SHORT).show();

        embeddedServer(Netty, host = "0.0.0.0", port = 8080) {
            routing {
                get("/") {
                    call.respondText("HELLO WORLD!")
                }
            }
        }.start(wait = false)

    }// Do work here, based on the contents of dataString
}
*/

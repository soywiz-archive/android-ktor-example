package com.soywiz.myapplication

import android.content.*
import android.os.*
import android.support.v7.app.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //startService(Intent(this@MainActivity, KtorService::class.java))
    }
}

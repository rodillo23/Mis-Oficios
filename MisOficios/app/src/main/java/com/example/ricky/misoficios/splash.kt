package com.example.ricky.misoficios

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class splash : AppCompatActivity() {
    val DURACION = 1000;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val background = object : Thread() {
            override fun run() {
                try {
                    Thread.sleep(1000)

                    val intent = Intent(baseContext, login::class.java)
                    startActivity(intent)

                }catch (e: Exception)
                {
                    e.printStackTrace()
                }
            }

        }
        background.start()
    }

}

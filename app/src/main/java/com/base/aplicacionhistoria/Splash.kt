package com.base.aplicacionhistoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_splash.*

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val videoPath="android.resource://$packageName/raw/rectangle"
        video_view.setVideoPath(videoPath)
        video_view.setOnCompletionListener {
            val r = object:Runnable {
                override fun run() {

                    startActivity(Intent(this@Splash,MainActivity::class.java))
                    finish()
                }
            }
            Handler().postDelayed(r, 3000)
        }
        video_view.start()
    }
}
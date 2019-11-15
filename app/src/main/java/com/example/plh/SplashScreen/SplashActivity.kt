package com.example.plh.SplashScreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.plh.Login.LoginActivity
import com.example.plh.MainActivity
import com.example.plh.R


/**
 * Created by Arsyal Raka on 15,Nov,2019
 * ScCrativeIndo
 * saigusa231@gmail.com
 */
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
        }, 2000)

    }
}
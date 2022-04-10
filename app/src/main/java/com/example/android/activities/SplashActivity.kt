package com.example.android.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import com.example.android.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        loadData()
    }
    private fun loadData() {
        val tag = null
        Log.d(tag: "SplashActivity", msg: "Load data star")

        Handler().postDelayed(
            {
                Log.d(tag: "SplashActivity", msg: "Load data end")
                val packageContext = null
                val intent = Intent (packageContext : this,
                MainActivity ::class.java)

                val inten = null
                startActivity(inten
            },
            300)

        }
    }
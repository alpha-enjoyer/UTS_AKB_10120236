package com.example.uts_akb_10120236

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler

//tgl pengerjaan    : 11 Juni 2023
//nim               : 10120236
//nama              : Zulfikar Azizan
//kelas             : IF-6

class SplashScreen : AppCompatActivity() {

    private val splashTimeOut: Long = 2500 // durasi tampilan splashscreen dalam milidetik
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            //tindakan setelah durasi splashscreen habis
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, splashTimeOut)
    }
}
package com.exless.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.exless.R

class SplassScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splass_screen)
        supportActionBar?.hide()
        val handler= Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent = Intent(this,onbonding1::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}
package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class onboard1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard1)

        val viewNextPage = findViewById<Button>(R.id.button4)
        viewNextPage.setOnClickListener {
            val Intent = Intent(this,onboard2::class.java)
            startActivity(Intent)
        }
    }
}
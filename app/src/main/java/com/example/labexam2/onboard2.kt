package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class onboard2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard2)

        val viewNextPage = findViewById<Button>(R.id.button5)
        viewNextPage.setOnClickListener {
            val Intent = Intent(this,onboard3::class.java)
            startActivity(Intent)
        }

        val viewPreviousPage = findViewById<ImageButton>(R.id.imageButton13)
        viewPreviousPage.setOnClickListener {
            val Intent = Intent(this,onboard1::class.java)
            startActivity(Intent)
        }
    }
}
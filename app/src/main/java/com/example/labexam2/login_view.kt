package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class login_view : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_view)

        val viewNextPage = findViewById<Button>(R.id.button)
        viewNextPage.setOnClickListener {
            val Intent = Intent(this,MainActivity::class.java)
            startActivity(Intent)
        }

        val viewPreviousPage = findViewById<ImageButton>(R.id.imageButton9)
        viewPreviousPage.setOnClickListener {
            val Intent = Intent(this,onboard3::class.java)
            startActivity(Intent)
        }

    }
}
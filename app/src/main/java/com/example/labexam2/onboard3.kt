package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class onboard3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard3)

        val viewNextPage = findViewById<Button>(R.id.button6)
        viewNextPage.setOnClickListener {
            val Intent = Intent(this,login_view::class.java)
            startActivity(Intent)
        }

        val viewPreviousPage = findViewById<ImageButton>(R.id.imageButton11)
        viewPreviousPage.setOnClickListener {
            val Intent = Intent(this,onboard2::class.java)
            startActivity(Intent)
        }
    }
}
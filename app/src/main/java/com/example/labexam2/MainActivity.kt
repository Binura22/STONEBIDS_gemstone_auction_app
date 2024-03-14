package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewNewsPage = findViewById<ImageButton>(R.id.imageButton14)
        viewNewsPage.setOnClickListener {
            val Intent = Intent(this,news_view::class.java)
            startActivity(Intent)
        }

        val viewProfile = findViewById<ImageButton>(R.id.imageButton15)
        viewProfile.setOnClickListener {
            val Intent = Intent(this,profile_view::class.java)
            startActivity(Intent)
        }

        val viewAuction = findViewById<ImageButton>(R.id.imageButton12)
        viewAuction.setOnClickListener {
            val Intent = Intent(this,auction_view2::class.java)
            startActivity(Intent)
        }

    }
}
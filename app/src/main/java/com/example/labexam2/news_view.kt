package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class news_view : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_view)

        val viewHome = findViewById<ImageButton>(R.id.imageButton10)
        viewHome.setOnClickListener {
            val Intent = Intent(this,MainActivity::class.java)
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
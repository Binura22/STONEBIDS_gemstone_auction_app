package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class auction_view2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auction_view2)

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

        val viewNewsPage = findViewById<ImageButton>(R.id.imageButton14)
        viewNewsPage.setOnClickListener {
            val Intent = Intent(this,news_view::class.java)
            startActivity(Intent)
        }

        val viewDetailedAuction= findViewById<Button>(R.id.button7)
        viewDetailedAuction.setOnClickListener {
            val Intent = Intent(this,detailed_auction_view::class.java)
            startActivity(Intent)
        }
    }
}
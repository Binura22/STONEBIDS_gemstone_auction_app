package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class profile_view : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_view)

        val viewNewsPage = findViewById<ImageButton>(R.id.imageButton14)
        viewNewsPage.setOnClickListener {
            val Intent = Intent(this,news_view::class.java)
            startActivity(Intent)
        }

        val viewHome = findViewById<ImageButton>(R.id.imageButton10)
        viewHome.setOnClickListener {
            val Intent = Intent(this,MainActivity::class.java)
            startActivity(Intent)
        }

        val viewAuction = findViewById<ImageButton>(R.id.imageButton12)
        viewAuction.setOnClickListener {
            val Intent = Intent(this,auction_view2::class.java)
            startActivity(Intent)
        }
    }
}
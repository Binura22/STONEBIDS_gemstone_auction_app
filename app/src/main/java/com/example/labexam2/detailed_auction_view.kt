package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class detailed_auction_view : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_auction_view)

        val viewPreviousPage = findViewById<ImageButton>(R.id.imageButton11)
        viewPreviousPage.setOnClickListener {
            val Intent = Intent(this,auction_view2::class.java)
            startActivity(Intent)
        }
    }
}
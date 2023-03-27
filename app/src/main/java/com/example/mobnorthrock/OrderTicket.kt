package com.example.mobnorthrock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class OrderTicket : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_ticket)
        init()
    }
    fun init()
    {
        var day1 = findViewById<TextView>(R.id.day_one)
        var day2 = findViewById<TextView>(R.id.day_two)
        var twMainPage = findViewById<TextView>(R.id.main)

        day1.setOnClickListener()
        {
            startActivity(Intent(this, FirstDay::class.java))
        }
        day2.setOnClickListener()
        {
            startActivity(Intent(this, SecondDay::class.java))
        }
        twMainPage.setOnClickListener()
        {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }
}
package com.example.mobnorthrock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    fun init()
    {
        var day1 = findViewById<TextView>(R.id.day_one)
        var day2 = findViewById<TextView>(R.id.day_two)

        day1.setTextColor(this@MainActivity.getColor(R.color.white))
        day2.setTextColor(this@MainActivity.getColor(R.color.white))

        day1.setOnClickListener()
        {
            startActivity(Intent(this, FirstDay::class.java))
        }
    }
}
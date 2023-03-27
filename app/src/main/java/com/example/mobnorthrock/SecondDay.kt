package com.example.mobnorthrock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondDay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_day)
        Init()
    }
    fun Init()
    {
        var day1 = findViewById<TextView>(R.id.day_one)
        var day2 = findViewById<TextView>(R.id.day_two)
        var twMainPage = findViewById<TextView>(R.id.main)

        day2.setTextColor(this@SecondDay.getColor(R.color.pink))

        twMainPage.setOnClickListener()
        {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
        day1.setOnClickListener()
        {
            startActivity(Intent(this, FirstDay::class.java))
        }
    }
}
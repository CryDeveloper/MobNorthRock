package com.example.mobnorthrock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FirstDay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_day)
        Init()
    }
    fun Init()
    {
        var day1 = findViewById<TextView>(R.id.day_one)
        var twMainPage = findViewById<TextView>(R.id.main)

        day1.setTextColor(this@FirstDay.getColor(R.color.pink))

        twMainPage.setOnClickListener()
        {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }


    }
}
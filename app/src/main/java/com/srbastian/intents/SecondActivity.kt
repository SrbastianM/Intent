package com.srbastian.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var showTextView : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showTextView = findViewById(R.id.textView)

        var userName : String = intent.getStringExtra("username").toString()
        var userLikes : String = intent.getStringExtra("userlikes").toString()
        showTextView.text = "Your name is ${userName} and here are your likes ${userLikes}"
    }
}
package com.srbastian.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var name : EditText
    lateinit var like : EditText
    lateinit var send : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Here I have a problem, the id doesn't change after trying to change it so for now I'm going to put the name of
        // each one later as a comment
        name = findViewById(R.id.editTextText)
        // EditName Text
        like = findViewById(R.id.editTextText2)
        // EditLike Text
        send = findViewById(R.id.button)

        send.setOnClickListener {

            var userName : String = name.text.toString()
            var userLikes : String = like.text.toString()

            var intent = Intent(this@MainActivity, SecondActivity:: class.java)
            intent.putExtra("username", userName)
            intent.putExtra("userlikes", userLikes)

            startActivity(intent)
        }
    }
}
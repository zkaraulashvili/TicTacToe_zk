package com.example.tictactoe_zk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var StartGameButton : Button
    private lateinit var GameNameEditText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        listeners()
    }

    private fun listeners(){
        StartGameButton.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

    private fun init(){
        StartGameButton = findViewById(R.id.GameStartbuttonId)
        GameNameEditText = findViewById(R.id.TextVId)
    }
}
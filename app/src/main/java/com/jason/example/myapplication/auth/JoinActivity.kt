package com.jason.example.myapplication.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.jason.example.myapplication.R

class JoinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)

        val joinBtn = findViewById<Button>(R.id.joinBtn)
        joinBtn.setOnClickListener{
            val email = findViewById<TextInputEditText>(R.id.emailArea).text.toString()
            val pw = findViewById<TextInputEditText>(R.id.pwArea).text.toString()

        }
    }
}
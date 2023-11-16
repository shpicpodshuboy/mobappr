package com.example.mobapp


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        fun rand(start: Int, end: Int): Int {
            require(start <= end) { "Illegal Argument" }
            return (start..end).random()
        }
        val start = 10000
        val end = 0

        val editTextusername = findViewById<EditText>(R.id.editTextTextEmailAddress2)
        val username = editTextusername.text.toString()
        val editTextpassword = findViewById<EditText>(R.id.editTextTextPassword2)
        val password = editTextpassword.text.toString()

        val button: Button = findViewById(R.id.button5)
        button.setOnClickListener {
            User("1", username, password, "admin")

        }
    }

}
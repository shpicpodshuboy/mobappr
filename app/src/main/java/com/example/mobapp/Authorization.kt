package com.example.mobapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText



class AuthorizationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.authorization)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, Registration::class.java)
            startActivity(intent)
        }

        val editTextusername = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val username = editTextusername.text.toString()
        val editTextpassword = findViewById<EditText>(R.id.editTextTextPassword)
        val password = editTextpassword.text.toString()

        val button1: Button = findViewById(R.id.button6)
        button1.setOnClickListener {
            if (username == User("", username, "", "").username) {
                val intent = Intent(this, MainMenu::class.java)
                startActivity(intent)
            }
        }
    }

}
/*5655555*/
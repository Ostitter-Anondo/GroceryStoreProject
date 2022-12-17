package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editTextTextEmailAddress = findViewById<EditText>(R.id.editTextTextEmailAddress)
        var editTextTextPassword = findViewById<EditText>(R.id.editTextTextPassword)
        var button4 = findViewById<Button>(R.id.button4)
        var button = findViewById<Button>(R.id.button)
        var button2 = findViewById<Button>(R.id.button2)

        button.setOnClickListener {
            val user_name = editTextTextEmailAddress.text;
            val password = editTextTextPassword.text;
            Toast.makeText(this@MainActivity, "oh nyo", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, Homepage::class.java))
        }
        button2.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "I will not implement this feature, I refuse.",
                Toast.LENGTH_LONG
            ).show()
        }
        button4.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "Let's Go",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}
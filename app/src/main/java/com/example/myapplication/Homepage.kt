package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        Toast.makeText(this@Homepage, "oh hi", Toast.LENGTH_SHORT).show()
        var imageButton = findViewById<ImageButton>(R.id.imageButton)
        var imageButton2 = findViewById<ImageButton>(R.id.imageButton2)
        var button3 = findViewById<Button>(R.id.button3)
        var button5 = findViewById<Button>(R.id.button5)
        imageButton.setOnClickListener {
            startActivity(Intent(this, Layoutmap::class.java))
            Toast.makeText(
                this@Homepage,
                "I'm The Map",
                Toast.LENGTH_SHORT
            ).show()
        }
        imageButton2.setOnClickListener {
            startActivity(Intent(this, GroceryList::class.java))
        }
        button3.setOnClickListener {
            Toast.makeText(
                this@Homepage,
                "hehe crash korse hehe",
                Toast.LENGTH_SHORT
            ).show()
            startActivity(Intent(this, GroceryStock::class.java))
        }
        button5.setOnClickListener {
            Toast.makeText(
            this@Homepage,
            "HELP IS ON THE WAY!!",
            Toast.LENGTH_SHORT
        ).show()
        }
    }

}
package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Layoutmap : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layoutmap)

        var button6 = findViewById<Button>(R.id.button6)

        button6.setOnClickListener {
            Toast.makeText(
                this@Layoutmap,
                "GENERAL KENOBI",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
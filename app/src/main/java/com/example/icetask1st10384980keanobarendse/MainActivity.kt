package com.example.icetask1st10384980keanobarendse

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.ButtonPress)
        val editText = findViewById<EditText>(R.id.EnterText)
        val resultTextView = findViewById<TextView>(R.id.ResultTextView)

        button.setOnClickListener {
            val input = editText.text.toString()
            //Check if the input is empty

            if (input.isEmpty()) {
                resultTextView.text = "Please enter number"
                return@setOnClickListener
            }
//Convert the input to an integer
            val number = input.toInt()
            if (number > 10) {
                resultTextView.text = "The number is greater than 10"
            } else
                resultTextView.text = "The number is NOT greater than 10"
        }
    }
}
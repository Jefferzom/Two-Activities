package com.example.twoactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText

const val EXTRA_MESSAGE = "com.example.twoactivities.MESSAGE";

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun launchSecondActivity(view: View) {
        val editText = findViewById<EditText>(R.id.editText_main)
        var message = editText.text.toString()
        val otherMessage = "Você não enviou nada!"
        val intent = Intent(this, SecondActivity::class.java).apply {
            if(message.isEmpty()) {
                message = otherMessage
                putExtra(EXTRA_MESSAGE, message)
            }
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}
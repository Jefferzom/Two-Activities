package com.example.twoactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

const val EXTRA_MESSAGE = "com.example.twoactivities.MESSAGE";

const val TEXT_REQUEST = 1;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mReplayHeadTextView = findViewById<TextView>(R.id.text_header_replay)
        var mReplayTextView = findViewById<TextView>(R.id.text_message_replay)
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
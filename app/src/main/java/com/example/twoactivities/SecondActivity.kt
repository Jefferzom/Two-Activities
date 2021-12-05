package com.example.twoactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

const val EXTRA_REPLAY = "com.example.twoactivities.REPLAY";

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val message = intent.getStringExtra(EXTRA_MESSAGE)

        val textView = findViewById<TextView>(R.id.text_header).apply {
            text = message
        }

        val mReplay = findViewById<EditText>(R.id.editText_second);

        fun returnReplay(view: View) {
            val replay: String = mReplay.text.toString();
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra(EXTRA_REPLAY, replay)
            }
            setResult(RESULT_OK, intent)
            finish();
        }
    }
}
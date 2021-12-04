package com.example.twoactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
//     val LOG_TAG = MainActivity.getSimpleName();
    val clicked: String = "Valeu"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun launchSecondActivity(view: View) {
//        Log.d(clicked,"Button Clicked!");
        Log.d(clicked,"Button Clicked!");
    }
}
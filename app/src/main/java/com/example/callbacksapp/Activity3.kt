package com.example.callbacksapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

    }

    override fun onStart() {
        super.onStart()
        Log.d("InActivity3", "onStart ")
        Toast.makeText(this,"onStart Activity2", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("InActivity3", "onResume ")
        Toast.makeText(this,"onResume Activity2", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        Log.d("InActivity3", "onPause ")
        Toast.makeText(this,"onPause Activity2", Toast.LENGTH_SHORT).show()
        super.onPause()
    }

    override fun onStop() {
        Log.d("InActivity3", "onStop ")
        Toast.makeText(this,"onStop Activity2", Toast.LENGTH_SHORT).show()
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("InActivity3", "onDestroy ")
        Toast.makeText(this,"onDestroy Activity2", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }

    override fun onRestart() {
        Log.d("InActivity3", "onRestart ")

        Toast.makeText(this,"onRestart Activity2", Toast.LENGTH_SHORT).show()
        super.onRestart()
    }
}
package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val button=findViewById<Button>(R.id.button2)
        button.setOnClickListener(object :  View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@Activity2,Activity3::class.java)
                startActivity(intent)
            }
        })
    }

    override fun onStart() {
        super.onStart()
        Log.d("InActivity2", "onStart ")
        Toast.makeText(this,"onStart Activity2", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("InActivity2", "onResume ")
        Toast.makeText(this,"onResume Activity2", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        Log.d("Activity2", "onPause ")
        Toast.makeText(this,"onPause Activity2", Toast.LENGTH_SHORT).show()
        super.onPause()
    }

    override fun onStop() {
        Log.d("InActivity2", "onStop ")
        Toast.makeText(this,"onStop Activity2", Toast.LENGTH_SHORT).show()
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("InActivity2", "onDestroy ")
        Toast.makeText(this,"onDestroy Activity2", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }

    override fun onRestart() {
        Log.d("InActivity2", "onRestart ")

        Toast.makeText(this,"onRestart Activity2", Toast.LENGTH_SHORT).show()
        super.onRestart()
    }
}
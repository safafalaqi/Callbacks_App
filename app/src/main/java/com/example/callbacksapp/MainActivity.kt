package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button=findViewById<Button>(R.id.button)
         //setup callback method
        button.setOnClickListener(this)
    }

    // Implement the OnClickListener callback
    override fun onClick(v: View?) {
        val intent = Intent(this, Activity2::class.java)
        startActivity(intent)
    }


    override fun onStart() {
        super.onStart()
        Log.d("InMainActivity", "onStart ")
        Toast.makeText(this,"onStart main activity",Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("InMainActivity", "onResume ")
        Toast.makeText(this,"onResume main activity",Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        Toast.makeText(this,"onPause main activity",Toast.LENGTH_SHORT).show()
        super.onPause()
    }

    override fun onStop() {
        Log.d("InMainActivity", "onStop ")
        Toast.makeText(this,"onStop main activity",Toast.LENGTH_SHORT).show()
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("InMainActivity", "onDestroy ")
        Toast.makeText(this,"onDestroy main activity",Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }

    override fun onRestart() {
        Log.d("InMainActivity", "onRestart ")
        Toast.makeText(this,"onRestart main activity",Toast.LENGTH_SHORT).show()
        super.onRestart()
    }

}
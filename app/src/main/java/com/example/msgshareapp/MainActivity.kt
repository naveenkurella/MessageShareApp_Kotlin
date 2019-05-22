package com.example.msgshareapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnShowMsg.setOnClickListener{

            Toast.makeText(this , "Button clicked", Toast.LENGTH_LONG).show();

        }
    }
}

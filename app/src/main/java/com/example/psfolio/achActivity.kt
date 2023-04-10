package com.example.psfolio

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView

class achActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ach)
        val txt= findViewById<TextView>(R.id.leetcode); //txt is object of TextView
        txt.movementMethod=LinkMovementMethod.getInstance();

        val lin=findViewById<TextView>(R.id.linkedin);
        lin.movementMethod=LinkMovementMethod.getInstance();
    }
}
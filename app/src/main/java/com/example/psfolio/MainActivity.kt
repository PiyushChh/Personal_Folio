package com.example.psfolio

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sk=findViewById<Button>(R.id.button)
        sk.setOnClickListener{
            intent= Intent(this,SkillsActivity::class.java)
            startActivity(intent)

        }

        val edu=findViewById<Button>(R.id.button2)
        edu.setOnClickListener {
            intent=Intent(this,EduActivity::class.java)
            startActivity(intent)
        }

        val exp=findViewById<Button>(R.id.button3)
        exp.setOnClickListener {
            intent=Intent(this,expActivity::class.java)
            startActivity(intent)
        }

        val ach=findViewById<Button>(R.id.button4)
        ach.setOnClickListener {
            intent=Intent(this,achActivity::class.java)
            startActivity(intent)

        }
    }
}
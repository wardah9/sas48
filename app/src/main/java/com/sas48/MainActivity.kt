package com.sas48

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.CardView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val parant = findViewById<CardView>(R.id.parant)
        val kid = findViewById<CardView>(R.id.kid)
        val teacher = findViewById<CardView>(R.id.teacher)
        val admin = findViewById<CardView>(R.id.admin)

        kid.setOnClickListener { startActivity(Intent(this, MainActivity::class.java)) }
        teacher.setOnClickListener { startActivity(Intent(this, MainActivity::class.java)) }
        parant.setOnClickListener { startActivity(Intent(this, MainActivity::class.java)) }
        admin.setOnClickListener { startActivity(Intent(this, MainActivity::class.java)) }

    }
}

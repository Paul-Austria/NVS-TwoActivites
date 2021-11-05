package com.example.twoactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)



        val TextOB = findViewById<TextView>(R.id.DataFromParent);

        TextOB.text = "Text from Main Screen : " +intent.getSerializableExtra("data");

        val btnSwitchAcitivty = findViewById<Button>(R.id.btnStartAnotherActivity);
        btnSwitchAcitivty.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}
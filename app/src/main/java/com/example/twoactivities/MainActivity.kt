package com.example.twoactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnSwitchAcitivty = findViewById<Button>(R.id.btnStartAnotherActivity);
        btnSwitchAcitivty.setOnClickListener {

            val b = Bundle()
            b.putSerializable("data","Data from screen 1")


            val intent = Intent(this, Activity2::class.java)
            intent.putExtras(b);
            // start your next activity
            startActivity(intent)
        }

    }
}

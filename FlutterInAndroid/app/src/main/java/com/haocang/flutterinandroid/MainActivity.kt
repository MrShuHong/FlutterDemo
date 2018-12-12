package com.haocang.flutterinandroid

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var btn_equipment = findViewById<Button>(R.id.btn_equipment)
        btn_equipment.setOnClickListener { view ->
            goToFragment("equipment")
        }

        var btn_patrol = findViewById<Button>(R.id.btn_patrol)
        btn_patrol.setOnClickListener { view ->
            goToFragment("patrol")
        }
    }

    private fun goToFragment(url: String) {
        var intent = Intent(this@MainActivity,FlutterActivity::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }


}

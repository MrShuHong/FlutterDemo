package com.haocang.flutterinandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.flutter.facade.Flutter

class FlutterActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flutter)

        var url = intent.getStringExtra("url")
        val flutterPage = Flutter.createFragment("home")
        supportFragmentManager.beginTransaction()
            .add(R.id.content_layout, flutterPage)
            .commit()
    }
}

package com.belajarandroid.belajarkotlindasar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHelloWorld: Button = findViewById(R.id.btnHelloWorld)




        btnHelloWorld.setOnClickListener {
            val intent = Intent(this, HelloWorldActivity::class.java)
            startActivity(intent)


        }
    }
}
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
            val i = Intent (this,ScrollingActivity::class.java)
            startActivity(i)
        }


//        btnHelloWorld.setOnClickListener {
//            val intent = Intent(this, HelloWorldFragment::class.java)
//            startActivity(intent)
//
//            val fragmentid = HelloWorldFragment()
//            val fragment =
//                supportFragmentManager.findFragmentByTag(HelloWorldFragment::class.java.simpleName)
//
//
//            if (fragment !is HelloWorldFragment) {
//                supportFragmentManager.beginTransaction()
//                    .add(
//                        com.google.android.material.R.id.container,
//                        fragmentid,
//                        HelloWorldFragment::class.java.simpleName
//                    )
//                    .commit()
//            }
//        }
    }
}
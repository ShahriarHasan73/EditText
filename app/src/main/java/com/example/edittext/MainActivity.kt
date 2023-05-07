package com.example.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tv1:TextView
    lateinit var tv2:TextView
    lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv1=findViewById(R.id.text1)
        tv2=findViewById(R.id.text2)
        btn=findViewById(R.id.btnCng)

        tv1.setOnClickListener {
            tv1.text="Hello Rajshahi"
        }
        tv2.setOnClickListener {
            tv2.text="Welcome to Rajshahi"
        }
        btn.setOnClickListener {
            tv1.text="Hello Bangladesh."
            tv2.text="Welcome to Bangladesh."
        }
    }
}
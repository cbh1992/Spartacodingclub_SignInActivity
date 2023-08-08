package com.android.signinactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {



    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        if(intent.hasExtra("id")){
            val tossid=intent.getStringExtra("id")
            val textView = findViewById<TextView>(R.id.idtext)
            textView.text = "이름: $tossid"
        }

    }
    fun exit(){
        val btn = findViewById<Button>(R.id.button4)
        btn.setOnClickListener{
            finish()}
    }
}
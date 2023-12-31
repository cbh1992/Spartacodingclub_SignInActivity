package com.android.signinactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(intent.hasExtra("ID")){
            val ID=intent.getStringExtra("ID")
            val textView = findViewById<TextView>(R.id.idtext)
            textView.text = "$ID"
        }

        if(intent.hasExtra("pw")){
            val pw=intent.getStringExtra("pw")
            val textView = findViewById<TextView>(R.id.pwtext)
            textView.text = "$pw"
        }


    }

    fun loginButtonClicked(v: View) {
        var inputID = findViewById<EditText>(R.id.idtext)
        var id = inputID.text.toString()
        var inputPW = findViewById<EditText>(R.id.pwtext)
        var pw = inputPW.text.toString()
        val btn = findViewById<Button>(R.id.button)

        if (id.isEmpty()) {
            Toast.makeText(this, "아이디 누락", Toast.LENGTH_SHORT).show()
        } else if (pw.isEmpty()) {
            Toast.makeText(this, "비밀번호 누락", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "로그인 성공", Toast.LENGTH_SHORT).show()
            btn.setOnClickListener{
                val intent = Intent(this,HomeActivity::class.java)
                intent.putExtra("id",id)
//              intent.putExtra("pw", pwtext.text.toString())
                startActivity(intent)
            }

        }
    }
        fun newButtonClicked(view: View) {
            val btn = findViewById<Button>(R.id.button3)
            btn.setOnClickListener{
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }
        }

}
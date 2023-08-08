package com.android.signinactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
    fun button2clicked(v: View) {
        var inputName = findViewById<EditText>(R.id.inputName)
        var Name = inputName.text.toString()
        var inputId = findViewById<EditText>(R.id.inputId)
        var ID = inputId.text.toString()
        var inputPw = findViewById<EditText>(R.id.inputPw)
        var pw = inputPw.text.toString()
        val btn = findViewById<Button>(R.id.button2)
        var inputPw2 = findViewById<EditText>(R.id.inputPw2)
        var pw2 = inputPw2.text.toString()
        
        if (Name.isEmpty()) {
            Toast.makeText(this, "이름 누락", Toast.LENGTH_SHORT).show()
        } else if (ID.isEmpty()) {
            Toast.makeText(this, "아이디 누락", Toast.LENGTH_SHORT).show()
        } else if (pw.isEmpty()){
            Toast.makeText(this, "비밀번호 누락", Toast.LENGTH_SHORT).show()
        }
        else if(pw!=pw2){
            Toast.makeText(this, "비밀번호를 다시 확인해 주세요", Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(this, "회원가입 완료", Toast.LENGTH_SHORT).show()
            btn.setOnClickListener{

                var intent = Intent(this,SignInActivity::class.java)
                intent.putExtra("ID",ID)
                intent.putExtra("pw",pw)

                finish()}
        }
    }
}
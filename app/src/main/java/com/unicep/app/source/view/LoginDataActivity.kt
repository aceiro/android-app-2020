package com.unicep.app.source.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.unicep.app.source.MainActivity
import com.unicep.app.source.R

class LoginDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_login_data)
    }

    fun onClickButtonBack(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun onClickShowDetails(view: View){
        val appUserName = intent.getStringExtra("app.user")
        val textView4 = findViewById<TextView>(R.id.textView4)
        textView4.text = appUserName

        val appEmail = intent.getStringExtra("app.cpf")
        val textView5 = findViewById<TextView>(R.id.textView5)
        textView5.text = appEmail


        val appCpf = intent.getStringExtra("app.email")
        val textView6 = findViewById<TextView>(R.id.textView6)
        textView6.text = appCpf

    }
}
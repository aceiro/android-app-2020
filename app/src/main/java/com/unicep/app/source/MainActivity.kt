package com.unicep.app.source

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.unicep.app.source.view.LoginDataActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_login)
    }

    fun onClickButtonLogin(view: View){
        val editTextTextEmailAddress = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val emailOrCpf = editTextTextEmailAddress.text
        var email = "--"
        var cpf   = "--"

        if(emailOrCpf.contains("@")){   /*email*/
            email = emailOrCpf.toString()
        } else { /*cpf*/
            cpf = emailOrCpf.toString()
        }

        val intent = Intent(this, LoginDataActivity::class.java).apply {
            putExtra("app.user", "Eva")
            putExtra("app.password", "43212")
            putExtra("app.name", "Eva Soares")
            putExtra("app.cpf", cpf)
            putExtra("app.email", email)
        }
        startActivity(intent)
    }


}
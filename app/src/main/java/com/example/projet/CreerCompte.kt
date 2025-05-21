package com.example.projet

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class CreerCompte :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.creer_compte)

        var signin :TextView = findViewById(R.id.conn)
        var btnCreer :Button = findViewById(R.id.btnCreer)

        signin.setOnClickListener{
            var intent = Intent(this,Connexion::class.java)
            startActivity(intent)
        }

        btnCreer.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
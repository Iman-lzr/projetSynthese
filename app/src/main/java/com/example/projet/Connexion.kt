package com.example.projet

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Connexion :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.connexion)

        var signup :TextView = findViewById(R.id.signup)
        var seConneceter :Button = findViewById(R.id.btnConnecter)

        signup.setOnClickListener{
            var intent = Intent(this,CreerCompte::class.java)
            startActivity(intent)
        }
        seConneceter.setOnClickListener{
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}
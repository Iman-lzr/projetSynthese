package com.example.projet

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class OnboardingActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.all_onboarding)

        val btnStarted: Button = findViewById(R.id.seConnecter)
        val viewPager: ViewPager2 = findViewById(R.id.viewpager)
        val creer: TextView = findViewById(R.id.creer)

        creer.setOnClickListener{
            var intent = Intent(this,CreerCompte::class.java)
            startActivity(intent)
        }

        val onbord = listOf(
            Data(R.drawable.donut, getString(R.string.on_titre)),
            Data(R.drawable.jus, getString(R.string.on2_titre))
        )

        viewPager.adapter = OnboardingAdapter(onbord)
        btnStarted.setOnClickListener {
            val intent = Intent(this, Connexion::class.java)
            startActivity(intent)
            finish()
        }
    }
}

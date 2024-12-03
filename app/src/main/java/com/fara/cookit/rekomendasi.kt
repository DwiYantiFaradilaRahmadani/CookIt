package com.fara.cookit

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class rekomendasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rekomendasi)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val imageBurger = findViewById<ImageView>(R.id.imageView5)
// Set OnClickListener untuk berpindah ke Burger Screen
        imageBurger.setOnClickListener {
            val intentBurger = Intent(
                this@rekomendasi,
                burger::class.java)
            startActivity(intentBurger)
        }

        val imageMakanan = findViewById<ImageView>(R.id.imageView2)
// Set OnClickListener untuk berpindah ke Makanan Screen
        imageMakanan.setOnClickListener {
            val intentMakanan = Intent(
                this@rekomendasi,
                makanan::class.java)
            startActivity(intentMakanan)
        }

        val imageMinuman = findViewById<ImageView>(R.id.imageView3)
// Set OnClickListener untuk berpindah ke Minuman Screen
        imageMinuman.setOnClickListener {
            val intentMinuman = Intent(
                this@rekomendasi,
                minuman::class.java)
            startActivity(intentMinuman)
        }

        val imageProfil = findViewById<ImageView>(R.id.imageView61)
// Set OnClickListener untuk berpindah ke Profil Screen
        imageProfil.setOnClickListener {
            val intentProfil = Intent(
                this@rekomendasi,
                profil::class.java)
            startActivity(intentProfil)
        }




    }

        }



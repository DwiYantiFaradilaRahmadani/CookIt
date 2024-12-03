package com.fara.cookit

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class churros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_churros)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val imageRekomendasi = findViewById<ImageView>(R.id.imageView58)
// Set OnClickListener untuk berpindah ke Rekomendasi Screen
        imageRekomendasi.setOnClickListener {
            val intent = Intent(
                this@churros,
                rekomendasi::class.java)
            startActivity(intent)
        }

        val imageProfil = findViewById<ImageView>(R.id.imageView59)
// Set OnClickListener untuk berpindah ke Profil Screen
        imageProfil.setOnClickListener {
            val pindah = Intent(
                this@churros,
                profil::class.java)
            startActivity(pindah)
        }

        val imageSaveMakanan = findViewById<ImageView>(R.id.imageView41)
// Set OnClickListener untuk berpindah ke SaveMakanan Screen
        imageSaveMakanan.setOnClickListener {
            val pindah1 = Intent(
                this@churros,
                savemakanan::class.java)
            startActivity(pindah1)
        }

    }
            }

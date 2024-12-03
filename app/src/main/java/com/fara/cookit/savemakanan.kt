package com.fara.cookit

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class savemakanan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_savemakanan)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Tombol untuk pindah ke Rekomendasi Screen
        val imageRekomendasi = findViewById<ImageView>(R.id.imageView62)
        imageRekomendasi.setOnClickListener {
            val intentRekomendasi = Intent(
                this@savemakanan,
                rekomendasi::class.java)
            startActivity(intentRekomendasi)
        }

// Tombol untuk pindah ke Profil Screen
        val imageProfil = findViewById<ImageView>(R.id.imageView63)
        imageProfil.setOnClickListener {
            val intentProfil = Intent(
                this@savemakanan,
                profil::class.java)
            startActivity(intentProfil)
        }

// Tombol untuk pindah ke Save Minuman Screen
        val imageSaveMinuman = findViewById<ImageView>(R.id.imageView81)
        imageSaveMinuman.setOnClickListener {
            val intentSaveMinuman = Intent(
                this@savemakanan,
                saveminuman::class.java)
            startActivity(intentSaveMinuman)
        }

// Tombol untuk pindah ke Burger Screen
        val imageBurger = findViewById<ImageView>(R.id.imageView77)
        imageBurger.setOnClickListener {
            val intentBurger = Intent(
                this@savemakanan,
                burger::class.java)
            startActivity(intentBurger)
        }

// Tombol untuk pindah ke Churros Screen
        val imageChurros = findViewById<ImageView>(R.id.imageView78)
        imageChurros.setOnClickListener {
            val intentChurros = Intent(
                this@savemakanan,
                churros::class.java)
            startActivity(intentChurros)
        }

        val imageprofil = findViewById<ImageView>(R.id.imageView63)
        imageprofil.setOnClickListener {
            val intentprofil = Intent(
                this@savemakanan,
                profil::class.java)
            startActivity(intentprofil)
        }

    }
                }

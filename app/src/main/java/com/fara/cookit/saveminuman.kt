package com.fara.cookit

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class saveminuman : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_saveminuman)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Tombol untuk berpindah ke Profil Screen
        val imageProfil = findViewById<ImageView>(R.id.imageView69)
        imageProfil.setOnClickListener {
            val intentProfil = Intent(
                this@saveminuman,
                profil::class.java)
            startActivity(intentProfil)
        }

        val imagerekomendasi = findViewById<ImageView>(R.id.imageView68)
        imagerekomendasi.setOnClickListener {
            val intentrekomendasi = Intent(
                this@saveminuman,
                rekomendasi::class.java)
            startActivity(intentrekomendasi)
        }

// Tombol untuk berpindah ke Strawberry Screen
        val imageStrawberry = findViewById<ImageView>(R.id.imageView74)
        imageStrawberry.setOnClickListener {
            val intentStrawberry = Intent(
                this@saveminuman,
                strawberry::class.java)
            startActivity(intentStrawberry)
        }

// Tombol untuk berpindah ke Minuman Screen
        val imageMinuman = findViewById<ImageView>(R.id.imageView72)
        imageMinuman.setOnClickListener {
            val intentMinuman = Intent(
                this@saveminuman,
                saveminuman::class.java)
            startActivity(intentMinuman)
        }

// Tombol untuk berpindah ke Save Makanan Screen
        val imageSaveMakanan = findViewById<ImageView>(R.id.imageView73)
        imageSaveMakanan.setOnClickListener {
            val intentSaveMakanan = Intent(
                this@saveminuman,
                savemakanan::class.java)
            startActivity(intentSaveMakanan)
        }



    }
            }

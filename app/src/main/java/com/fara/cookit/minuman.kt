package com.fara.cookit

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class minuman : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_minuman)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val imagestraw = findViewById<ImageView>(R.id.imageView26)
// Set OnClickListener untuk berpindah ke Churros Screen
        imagestraw.setOnClickListener {
            val intentChurros = Intent(
                this@minuman,
                strawberry::class.java)
            startActivity(intentChurros)
        }
        val imageRekomendasi = findViewById<ImageView>(R.id.imageView21)
// Set OnClickListener untuk berpindah ke Rekomendasi Screen
        imageRekomendasi.setOnClickListener {
            val intent = Intent(
                this@minuman,
                rekomendasi::class.java)
            startActivity(intent)
        }

        val imageProfil = findViewById<ImageView>(R.id.imageView22)
// Set OnClickListener untuk berpindah ke Profil Screen
        imageProfil.setOnClickListener {
            val pindah = Intent(
                this@minuman,
                profil::class.java)
            startActivity(pindah)
        }
        val imagemakanan = findViewById<ImageView>(R.id.imageView25)
        imagemakanan.setOnClickListener {
            val makanan= Intent(
                this@minuman,
                makanan::class.java)
            startActivity(makanan)
        }
        }
    }

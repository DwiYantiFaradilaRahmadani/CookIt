package com.fara.cookit

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class burger : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_burger)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val imageRegister = findViewById<ImageView>(R.id.imageView57)
// Set OnClickListener untuk berpindah ke Register Screen
        imageRegister.setOnClickListener {
            val intent = Intent(
                this@burger,
                profil::class.java)
            startActivity(intent)
        }

        val imagemakanan = findViewById<ImageView>(R.id.imageView56)
// Set OnClickListener untuk berpindah ke Makanan Screen
        imagemakanan.setOnClickListener {
            val pindah = Intent(
                this@burger,
                makanan::class.java)
            startActivity(pindah)
        }

        val imagesavemakanan = findViewById<ImageView>(R.id.imageView37)
// Set OnClickListener untuk berpindah ke SaveMakanan Screen
        imagesavemakanan.setOnClickListener {
            val pindah1 = Intent(
                this@burger,
                savemakanan::class.java)
            startActivity(pindah1)
        }

    }
        }

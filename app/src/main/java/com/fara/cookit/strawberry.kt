package com.fara.cookit

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class strawberry : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_strawberry)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        // Tombol untuk berpindah ke Strawberry Screen
        val imageprofil = findViewById<ImageView>(R.id.imageView65)
        imageprofil.setOnClickListener {
            val intentprofil = Intent(
                this@strawberry,
                profil::class.java
            )
            startActivity(intentprofil)
        }

// Tombol untuk berpindah ke Minuman Screen
        val imagerekomendasi = findViewById<ImageView>(R.id.imageView64)
        imagerekomendasi.setOnClickListener {
            val intentrekomendasi = Intent(
                this@strawberry,
                rekomendasi::class.java
            )
            startActivity(intentrekomendasi)
        }

// Tombol untuk berpindah ke Save Makanan Screen
        val imageSvstrawberry = findViewById<ImageView>(R.id.imageView43)
        imageSvstrawberry.setOnClickListener {
            val intentSaveMakanan = Intent(
                this@strawberry,
                saveminuman::class.java
            )
            startActivity(intentSaveMakanan)
        }

    }
}
package com.fara.cookit

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class makanan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_makanan)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val imageRekomendasi = findViewById<ImageView>(R.id.imageView10)
// Set OnClickListener untuk berpindah ke Rekomendasi Screen
        imageRekomendasi.setOnClickListener {
            val intentRekomendasi = Intent(
                this@makanan,
                rekomendasi::class.java)
            startActivity(intentRekomendasi)
        }

        val imageProfil = findViewById<ImageView>(R.id.imageView9)
// Set OnClickListener untuk berpindah ke Profil Screen
        imageProfil.setOnClickListener {
            val intentProfil = Intent(
                this@makanan,
                profil::class.java)
            startActivity(intentProfil)
        }

        val imageMinuman = findViewById<ImageView>(R.id.imageView13)
// Set OnClickListener untuk berpindah ke Minuman Screen
        imageMinuman.setOnClickListener {
            val intentMinuman = Intent(
                this@makanan,
                minuman::class.java)
            startActivity(intentMinuman)
        }

        val imageChurros = findViewById<ImageView>(R.id.imageView14)
// Set OnClickListener untuk berpindah ke Churros Screen
        imageChurros.setOnClickListener {
            val intentChurros = Intent(
                this@makanan,
                churros::class.java)
            startActivity(intentChurros)
        }

    }
                }

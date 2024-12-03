package com.fara.cookit

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class profil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profil)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

            val imageRekomendasi = findViewById<ImageView>(R.id.imageView76)
// Set OnClickListener untuk berpindah ke Rekomendasi Screen
            imageRekomendasi.setOnClickListener {
                val intentRekomendasi =
                    Intent(this@profil,
                    rekomendasi::class.java)
                startActivity(intentRekomendasi)
            }

        val imagesave = findViewById<ImageView>(R.id.imageView48)
// Set OnClickListener untuk berpindah ke Rekomendasi Screen
        imagesave.setOnClickListener {
            val intentsave =
                Intent(this@profil,
                    savemakanan::class.java)
            startActivity(intentsave)
        }


        }
    }

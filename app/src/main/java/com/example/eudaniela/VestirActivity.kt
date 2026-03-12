package com.example.eudaniela

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class VestirActivity : AppCompatActivity() {

    private lateinit var danielaPreview: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vestir)

        danielaPreview = findViewById(R.id.daniela_preview)
        val btnVoltar = findViewById<Button>(R.id.btn_voltar)

        val itemDressPink = findViewById<ImageButton>(R.id.item_dress_pink)
        val itemDressPurple = findViewById<ImageButton>(R.id.item_dress_purple)
        val itemShoesRed = findViewById<ImageButton>(R.id.item_shoes_red)
        val itemHairAfro = findViewById<ImageButton>(R.id.item_hair_afro)

        itemDressPink.setOnClickListener {
            Toast.makeText(this, "Vestido Rosa selecionado!", Toast.LENGTH_SHORT).show()
            // Lógica para trocar a imagem da Daniela ou sobrepor o vestido
        }

        itemDressPurple.setOnClickListener {
            Toast.makeText(this, "Vestido Roxo selecionado!", Toast.LENGTH_SHORT).show()
        }

        itemShoesRed.setOnClickListener {
            Toast.makeText(this, "Sapatos Vermelhos selecionados!", Toast.LENGTH_SHORT).show()
        }

        itemHairAfro.setOnClickListener {
            Toast.makeText(this, "Penteado Afro selecionado!", Toast.LENGTH_SHORT).show()
        }

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}

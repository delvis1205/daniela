package com.example.eudaniela

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LojaActivity : AppCompatActivity() {

    private var moedas = 100
    private lateinit var tvMoedas: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loja)

        tvMoedas = findViewById(R.id.tv_loja_moedas)
        val btnVoltar = findViewById<Button>(R.id.btn_voltar_loja)
        val buyBed = findViewById<Button>(R.id.buy_bed)
        val buyToy = findViewById<Button>(R.id.buy_toy)
        val buyPoster = findViewById<Button>(R.id.buy_poster)

        buyBed.setOnClickListener {
            if (moedas >= 50) {
                moedas -= 50
                atualizarMoedas()
                Toast.makeText(this, "Cama Rosa comprada!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Moedas insuficientes!", Toast.LENGTH_SHORT).show()
            }
        }

        buyToy.setOnClickListener {
            if (moedas >= 30) {
                moedas -= 30
                atualizarMoedas()
                Toast.makeText(this, "Ursinho comprado!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Moedas insuficientes!", Toast.LENGTH_SHORT).show()
            }
        }

        buyPoster.setOnClickListener {
            if (moedas >= 20) {
                moedas -= 20
                atualizarMoedas()
                Toast.makeText(this, "Poster comprado!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Moedas insuficientes!", Toast.LENGTH_SHORT).show()
            }
        }

        btnVoltar.setOnClickListener {
            finish()
        }
    }

    private fun atualizarMoedas() {
        tvMoedas.text = "Suas Moedas: $moedas"
    }
}

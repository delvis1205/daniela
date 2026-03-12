package com.example.eudaniela

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var moedas = 100
    private lateinit var tvMoedas: TextView
    private lateinit var danielaAvatar: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMoedas = findViewById(R.id.tv_moedas)
        danielaAvatar = findViewById(R.id.daniela_avatar)

        val btnVestir = findViewById<Button>(R.id.btn_vestir)
        val btnCozinhar = findViewById<Button>(R.id.btn_cozinhar)
        val btnJogos = findViewById<Button>(R.id.btn_jogos)
        val btnLoja = findViewById<Button>(R.id.btn_loja)

        danielaAvatar.setOnClickListener {
            Toast.makeText(this, "Olá! Eu sou a Daniela!", Toast.LENGTH_SHORT).show()
            danielaAvatar.animate().scaleX(1.1f).scaleY(1.1f).setDuration(200).withEndAction {
                danielaAvatar.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200).start()
            }.start()
        }

        btnVestir.setOnClickListener {
            val intent = android.content.Intent(this, VestirActivity::class.java)
            startActivity(intent)
        }

        btnCozinhar.setOnClickListener {
            val intent = android.content.Intent(this, CozinharActivity::class.java)
            startActivity(intent)
        }

        btnJogos.setOnClickListener {
            val intent = android.content.Intent(this, JogosActivity::class.java)
            startActivity(intent)
        }

        btnLoja.setOnClickListener {
            val intent = android.content.Intent(this, LojaActivity::class.java)
            startActivity(intent)
        }
    }

    fun adicionarMoedas(quantidade: Int) {
        moedas += quantidade
        tvMoedas.text = "Moedas: $moedas"
    }
}

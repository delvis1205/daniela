package com.example.eudaniela

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class JogosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogos)

        val btnVoltar = findViewById<Button>(R.id.btn_voltar_jogos)
        val btnMemoria = findViewById<Button>(R.id.btn_jogo_memoria)
        val btnEstrelas = findViewById<Button>(R.id.btn_jogo_estrelas)
        val btnPuzzle = findViewById<Button>(R.id.btn_jogo_puzzle)
        val btnRapido = findViewById<Button>(R.id.btn_jogo_rapido)

        btnMemoria.setOnClickListener {
            Toast.makeText(this, "Iniciando Jogo da Memória...", Toast.LENGTH_SHORT).show()
        }

        btnEstrelas.setOnClickListener {
            Toast.makeText(this, "Iniciando Pegar Estrelas...", Toast.LENGTH_SHORT).show()
        }

        btnPuzzle.setOnClickListener {
            Toast.makeText(this, "Iniciando Puzzle Infantil...", Toast.LENGTH_SHORT).show()
        }

        btnRapido.setOnClickListener {
            Toast.makeText(this, "Iniciando Cozinha Rápida...", Toast.LENGTH_SHORT).show()
        }

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}

package com.example.eudaniela

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CozinharActivity : AppCompatActivity() {

    private lateinit var foodDisplay: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cozinhar)

        foodDisplay = findViewById(R.id.food_display)
        val btnVoltar = findViewById<Button>(R.id.btn_voltar_cozinha)

        val btnMakeCake = findViewById<ImageButton>(R.id.btn_make_cake)
        val btnMakeBurger = findViewById<ImageButton>(R.id.btn_make_burger)
        val btnMakeJuice = findViewById<ImageButton>(R.id.btn_make_juice)

        btnMakeCake.setOnClickListener {
            foodDisplay.setImageResource(R.drawable.cake)
            Toast.makeText(this, "Bolo pronto!", Toast.LENGTH_SHORT).show()
        }

        btnMakeBurger.setOnClickListener {
            foodDisplay.setImageResource(R.drawable.hamburger)
            Toast.makeText(this, "Hambúrguer pronto!", Toast.LENGTH_SHORT).show()
        }

        btnMakeJuice.setOnClickListener {
            foodDisplay.setImageResource(R.drawable.juice)
            Toast.makeText(this, "Suco pronto!", Toast.LENGTH_SHORT).show()
        }

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}

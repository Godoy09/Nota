package com.example.nota

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val textResultado = findViewById<TextView>(R.id.textResultado)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        val resultado = intent.getStringExtra("RESULTADO")
        textResultado.text = "Situação: $resultado"

        btnVoltar.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}

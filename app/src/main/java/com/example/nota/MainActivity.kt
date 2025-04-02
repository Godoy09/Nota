package com.example.nota

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editNota = findViewById<EditText>(R.id.editNota)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val btnIntegrantes = findViewById<Button>(R.id.btnIntegrantes)

        btnCalcular.setOnClickListener {
            val nota = editNota.text.toString().toDoubleOrNull() ?: 0.0
            val resultado = when {
                nota < 4 -> "Reprovado"
                nota in 4.0..5.9 -> "Prova Substitutiva"
                else -> "Aprovado"
            }

            val intent = Intent(this, ResultadoActivity::class.java)
            intent.putExtra("RESULTADO", resultado)
            startActivity(intent)
        }

        btnIntegrantes.setOnClickListener {
            startActivity(Intent(this, IntegrantesActivity::class.java))
        }
    }
}

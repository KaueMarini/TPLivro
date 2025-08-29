package com.example.tplivro.View

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tplivro.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DetalhesLivroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_livro)

        val txvTituloLivro = findViewById<TextView>(R.id.txv_titulo_livro)
        val txvAutorLivro = findViewById<TextView>(R.id.txv_autor_livro)
        val fabVolta = findViewById<FloatingActionButton>(R.id.fab_volta)

        val titulo = intent.getStringExtra("tituloLivro")
        val autor = intent.getStringExtra("autorLivro")

        txvTituloLivro.text = "Título: $titulo"
        txvAutorLivro.text = "Autor: $autor"

        fabVolta.setOnClickListener {
            finish()
        }
    }
}
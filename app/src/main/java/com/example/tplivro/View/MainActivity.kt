package com.example.tplivro.View

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.tplivro.R
import com.example.tplivro.Model.Livro
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtTituloLivro = findViewById<TextInputEditText>(R.id.edt_titulo_livro)
        val edtAutorLivro = findViewById<TextInputEditText>(R.id.edt_autor_livro)
        val btnCadastrar = findViewById<Button>(R.id.btn_cadastrar)

        btnCadastrar.setOnClickListener {
            val titulo = edtTituloLivro.text.toString()
            val autor = edtAutorLivro.text.toString()

            if (titulo.isNotEmpty() && autor.isNotEmpty()) {
                val livro = Livro(titulo, autor)
                abrirDetalhesLivro(livro)
            } else {
                alertaCamposVazios()
            }
        }
    }

    private fun abrirDetalhesLivro(livro: Livro) {
        val intent = Intent(this, DetalhesLivroActivity::class.java).apply {
            putExtra("tituloLivro", livro.titulo)
            putExtra("autorLivro", livro.autor)
        }
        startActivity(intent)
    }

    private fun alertaCamposVazios() {
        AlertDialog.Builder(this)
            .setTitle("Atenção")
            .setMessage("Por favor, preencha todos os campos.")
            .setPositiveButton("OK", null)
            .show()
    }
}
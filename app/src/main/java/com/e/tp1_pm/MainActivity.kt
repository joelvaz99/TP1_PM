package com.e.tp1_pm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
const val enviar_nome = "nome1"
const val enviar_idade = "idade"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun button(view: View) {
        var nome = findViewById<TextInputEditText>(R.id.name);
        var idade = findViewById<TextInputEditText>(R.id.age);
        Toast.makeText(this, nome.text, Toast.LENGTH_SHORT).show() //Mostra o valor inserido
         // findViewById<TextView>(R.id.ver).setText(nome.text)
        val intent = Intent(this, MainActivity2::class.java).apply {
           putExtra(enviar_nome,nome.text.toString())
            putExtra(enviar_idade,idade.text.toString())

        }
        startActivity(intent)
        

    }
}
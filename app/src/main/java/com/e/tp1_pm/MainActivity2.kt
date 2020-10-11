package com.e.tp1_pm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val message = intent.getStringExtra(enviar_nome)
        val message1 = intent.getStringExtra(enviar_idade)

        val textView = findViewById<TextView>(R.id.view1).apply {
            text = message
        }

        val textView1 = findViewById<TextView>(R.id.view2).apply {
            text = message1
        }
    }
}
package com.example.clinicaveterinaria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var tiniBtnSair:Button

class TelaInicialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)
        tiniBtnSair = findViewById(R.id.tini_btn_sair)

        tiniBtnSair.setOnClickListener {
            finish()
        }

    }

}
package com.example.clinicaveterinaria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var tuserBtnSair:Button

class TelaUsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_usuario)

        tuserBtnSair = findViewById(R.id.tuser_btn_sair)

        tuserBtnSair.setOnClickListener {
            finish()
        }


    }
}
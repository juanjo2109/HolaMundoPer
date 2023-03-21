package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Activity_Segundo: AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segundo)
        mostrarNombre();
    val bottonVolver:Button=findViewById(R.id.buttonFinalizar)
        bottonVolver.setOnClickListener { onBackPressed()}  }
    private fun mostrarNombre(){
        val mibudle=intent.extras
        val nombre=mibudle?.getString("Saludo")
        val tvsaludoPer=findViewById<TextView>(R.id.tvSaludo)
        tvsaludoPer.text="Bienvenido  "+nombre.toString()
    }

}
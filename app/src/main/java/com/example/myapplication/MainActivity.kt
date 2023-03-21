package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.myapplication.Activity_Segundo
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val btnSiguiente: Button=findViewById<Button>(R.id.btnSiguiente)
        btnSiguiente.setOnClickListener{chequear()}
    }
    fun chequear(){
        val etNombre:EditText = findViewById<EditText>(R.id.etNombre)
        if (etNombre.text.isNotEmpty()){
            val enviar=Intent(this, Activity_Segundo::class.java)
            enviar.putExtra("Saludo",etNombre.text.toString())
            startActivity(enviar)
        }
        else{
            mostrarerrornbre()
        }

    }
    private fun mostrarerrornbre(){
        Toast.makeText(this,"El nombre del usuario no esta completado",Toast.LENGTH_SHORT).show()
    }
}
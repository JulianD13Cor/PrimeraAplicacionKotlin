package com.example.primeraaplicacionkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


/*
        val btnCambiar2= findViewById<Button>(R.id.btnCambiar2)

        var entradaNumero1= findViewById<EditText>(R.id.entradaResta1)
        var entradaNumero2= findViewById<EditText>(R.id.entradaResta1)

        btnCambiar2.setOnClickListener{
            var n1= entradaNumero1.text.toString().toInt()
            var n2= entradaNumero2.text.toString().toInt()
            finish()
        }*/
        splash()
    }
    fun splash(){
        object : CountDownTimer(5000,1000) {
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                val intento=Intent(applicationContext,MainActivity3::class.java).apply {  }
                startActivity(intento)
                finish()
            }

        }.start()
    }
    fun cambiar(){
        val intent = Intent(this,MainActivity3::class.java);
        startActivity(intent)
    }
}
package com.example.primeraaplicacionkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        /*val btn1= findViewById<Button>(R.id.btn1)

        var entradaNumero1= findViewById<EditText>(R.id.entradaNumero1)
        var entradaNumero2= findViewById<EditText>(R.id.entradaNumero2)

        btn1.setOnClickListener{
            var n1= entradaNumero1.text.toString().toInt()
            var n2= entradaNumero2.text.toString().toInt()
            Toast.makeText(this,"La suma es: ${sumar(n1,n2)}",Toast.LENGTH_LONG).show()

        }*/

        val btnCambiar= findViewById<Button>(R.id.btnCambiar)
        btnCambiar.setOnClickListener{
            cambiar()
            finish()
        }
    }
    fun cambiar(){
        val intent = Intent(this,MainActivity2::class.java);
        startActivity(intent)
    }
    fun sumar(num1:Int, num2:Int):Int{
        return num1+num2
    }
}
package com.example.primeraaplicacionkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Spinner
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    /*
        var entradaNumero1= findViewById<EditText>(R.id.entradaNumero1)
        var entradaNumero2= findViewById<EditText>(R.id.entradaNumero2)

        btn1.setOnClickListener{
            var n1= entradaNumero1.text.toString().toInt()
            var n2= entradaNumero2.text.toString().toInt()
            Toast.makeText(this,"La suma es: ${sumar(n1,n2)}",Toast.LENGTH_LONG).show()

        }*/
        val radio1 = findViewById<RadioButton>(R.id.radio1)
        /*radio1.setOnClickListener{
            Toast.makeText(this,"presiono radio1",Toast.LENGTH_LONG).show()
        }*/
        val radio2 = findViewById<RadioButton>(R.id.radio2)

        val btnCambiar= findViewById<Button>(R.id.btnCambiar)
        btnCambiar.setOnClickListener{
            cambiar()
            finish()
        }
        val btn1= findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener{
            if(radio1.isChecked){
                Toast.makeText(this,"presiono radio1",Toast.LENGTH_LONG).show()
            }else if(radio2.isChecked){
                Toast.makeText(this,"presiono radio2",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"nada",Toast.LENGTH_LONG).show()
            }
        }
        val spinner =findViewById<Spinner>(R.id.spinner)
        var opciones = arrayListOf<String>("JAVA","KOTLIN","C#")
        val adaptador =ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, opciones)
        spinner.adapter=adaptador
        val btnSpinner= findViewById<Button>(R.id.btnSpinner)
        btnSpinner.setOnClickListener {
            when(spinner.selectedItem.toString()){
                "JAVA"-> Toast.makeText(this,"JAVA",Toast.LENGTH_LONG).show()
                "KOTLIN"-> Toast.makeText(this,"KOTLIN",Toast.LENGTH_LONG).show()
                "C#"-> Toast.makeText(this,"C#",Toast.LENGTH_LONG).show()
            }
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
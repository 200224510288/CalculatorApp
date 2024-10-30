package com.example.kotlinapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() , View.OnClickListener
{

    lateinit var btn_add : Button
    lateinit var btn_subtraction : Button
    lateinit var btn_mutiplication : Button
    lateinit var btn_division : Button
    lateinit var etA : EditText
    lateinit var etB : EditText
    lateinit var result_tv : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btn_add = findViewById(R.id.btn_add)
        btn_subtraction = findViewById(R.id.btn_subtraction)
        btn_mutiplication = findViewById(R.id.btn_mutiplication)
        btn_division = findViewById(R.id.btn_division)
        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        result_tv = findViewById(R.id.result_tv)

        btn_add.setOnClickListener(this)
        btn_subtraction.setOnClickListener(this)
        btn_mutiplication.setOnClickListener(this)
        btn_division.setOnClickListener(this)



    }

    override fun onClick(v: View?) {

        var a = etA.text.toString().toDouble()
        var b = etB.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
              R.id.btn_add ->{
                  result=a+b
              }
              R.id.btn_subtraction ->{
                  result=a-b
              }
              R.id.btn_mutiplication ->{
                  result=a*b
              }
              R.id.btn_division ->{
                  result=a/b
              }
        }
        result_tv.text = "Results is $result"
        }
}
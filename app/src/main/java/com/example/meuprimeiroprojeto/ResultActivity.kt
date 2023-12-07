package com.example.meuprimeiroprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvResult = findViewById<TextView>(R.id.textview_result)
        val tvClassificacao = findViewById<TextView>(R.id.textview_classificacao)

        val result = intent.getFloatExtra("EXTRA_RESULT", 0.1f)

        tvResult.text = result.toString()

        val classificacao = if(result < 18.5){
            "ABAIXO DO PESO"
        }else if(result in 18.5f..24.9f){
            "NORMAL"
        }else if(result in 25f..29.9f){
            "SOBREPESO I"
        }else if(result in 30f..39.9f){
            "OBESIDADE II"
        }else if(result >= 40f){
            "OBESIDADE GRAVE III"
        } else {

        }

        tvClassificacao.text = getString(R.string.message_classificacao, classificacao)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}
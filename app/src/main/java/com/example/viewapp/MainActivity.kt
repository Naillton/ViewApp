package com.example.viewapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // instanciando um textView e setando um novo texto ao ser criado pelo metodo onCreate
        val textview : TextView = findViewById(R.id.textView);
        textview.text = "XXAAABBBLLAAAUUUU"
    }

}
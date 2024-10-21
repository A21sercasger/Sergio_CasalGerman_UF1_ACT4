package com.example.sergio_casalgerman_uf1_act4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logCatButton = findViewById<Button>(R.id.buttonLogcat);

        logCatButton.setOnClickListener{
            Log.d("Missatge","Boto apretat");
        }


        val toastButton = findViewById<Button>(R.id.buttonToast);

        toastButton.setOnClickListener{
            Toast.makeText(this, "Boto apretat", Toast.LENGTH_SHORT).show();
        }
    }
}
package com.example.evaluacion2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main) // Asegúrate de que el layout sea el correcto

        // Configuración de insets de la ventana
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Inicializa el botón para el menú
        val botonaMenu = findViewById<Button>(R.id.BotonaMenu) // Asegúrate de que el ID sea correcto
        botonaMenu.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

        // Inicializa el botón para las clases
        val buttonClases = findViewById<Button>(R.id.buttonClases) // Asegúrate de que el ID sea correcto
        buttonClases.setOnClickListener {
            val intent = Intent(this, ClasesActivity::class.java)
            startActivity(intent)
        }
    }
}
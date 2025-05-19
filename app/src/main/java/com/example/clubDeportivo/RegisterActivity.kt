package com.example.clubDeportivo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.clubDeportivo.R

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnVolver = findViewById<ImageButton>(R.id.btnVolver)
        val btnSocios = findViewById<Button>(R.id.btnSocios)
        val btnNoSocios = findViewById<Button>(R.id.btnNoSocios)

        //// Navegar a MenuActivity
        btnVolver.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java) //crea un intent para cambiar de activity
            startActivity(intent)
            finish() // Cierra MenuActivity
        }

        btnSocios.setOnClickListener {
            val intent =
                Intent(this, ActivityActivity::class.java) //crea un intent para cambiar de activity
            startActivity(intent)
            finish()
        }

        btnNoSocios.setOnClickListener {
            val intent =
                Intent(this, DailyPaymentActivity::class.java) //crea un intent para cambiar de activity
            startActivity(intent)
            finish()
        }
    }
}
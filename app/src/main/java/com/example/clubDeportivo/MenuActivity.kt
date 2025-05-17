package com.example.clubDeportivo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnExit = findViewById<Button>(R.id.btnExit) //declaramos el valor del btn
        val btnSocios = findViewById<Button>(R.id.btnSocios)
        val btnNoSocios = findViewById<Button>(R.id.btnNoSocios)
        val btnCuotas = findViewById<Button>(R.id.btnCuotas)
        val btnActividades = findViewById<Button>(R.id.btnActividades)
        val btnCobroDiario = findViewById<Button>(R.id.btnCobroDiario)
        val btnVtos = findViewById<Button>(R.id.btnVtos)

        btnExit.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java) //crea un intent para cambiar de activity
            startActivity(intent)
            finish() // Cierra MenuActivity
        }

        // Navegar a ActivityRegister
        btnSocios.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnNoSocios.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnCuotas.setOnClickListener {
            val intent = Intent(this, PaymentActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnActividades.setOnClickListener {
            val intent = Intent(this, ActivityActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnCobroDiario.setOnClickListener {
            val intent = Intent(this, DailyPaymentActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnVtos.setOnClickListener {
            val intent = Intent(this, DueReportActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
package com.example.clubDeportivo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DailyPaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_daily_payment)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnVolver = findViewById<ImageButton>(R.id.btnVolver)
        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)
        val btnCarnet = findViewById<Button>(R.id.btnCarnet)

        //// Navegar a MenuActivity
        btnVolver.setOnClickListener {
            val intent =
                Intent(this, MenuActivity::class.java) //crea un intent para cambiar de activity
            startActivity(intent)
            finish()
        }

        btnRegistrar.setOnClickListener {
            val intent = Intent(this, VoucherActivity::class.java) //crea un intent para cambiar de activity
            startActivity(intent)
            finish()
        }

        btnCarnet.setOnClickListener {
            val intent = Intent(this, LicenseActivity::class.java) //crea un intent para cambiar de activity
            startActivity(intent)
            finish()
        }
    }
}
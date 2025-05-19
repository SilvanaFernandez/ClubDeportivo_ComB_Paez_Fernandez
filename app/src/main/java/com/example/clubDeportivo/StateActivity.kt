package com.example.clubDeportivo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_state)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnVolver = findViewById<ImageButton>(R.id.btnVolver)
        val btnCobroCta = findViewById<Button>(R.id.btnCobroCta)

        btnVolver.setOnClickListener {
            val intent = Intent(this, PaymentActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnCobroCta.setOnClickListener {
            val intent = Intent(this, PaymentActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
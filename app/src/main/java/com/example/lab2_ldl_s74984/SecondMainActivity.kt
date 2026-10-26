
package com.example.lab2_ldl_s74984

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_second_main)

        ViewCompat.setOnApplyWindowInsetsListener(
            findViewById(R.id.main)
        ) { v, insets ->
            val systemBars =
                insets.getInsets(WindowInsetsCompat.Type.systemBars())

            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )

            insets
        }

        val txtName: TextView = findViewById(R.id.txtDisplayName)

        val txtAge: TextView = findViewById(R.id.txtDisplayAge)

        val dataName = intent.getStringExtra("EXTRA_NAME") ?: "No name input"

        val dataAge = intent.getStringExtra("EXTRA_AGE") ?: "No age input"

        txtName.text = "Name: $dataName"
        txtAge.text = "Age: $dataAge"
    }
}

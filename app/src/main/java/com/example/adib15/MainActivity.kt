package com.example.adib15

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Aplikasi berjalan", Toast.LENGTH_SHORT).show()

        val tombol = findViewById<Button>(R.id.Nama)

        tombol.setOnClickListener {
            Toast.makeText(this, "ADIB MUZAKKI", Toast.LENGTH_SHORT).show()

            val tombol = findViewById<Button>(R.id.Kelas)

            tombol.setOnClickListener {
                Toast.makeText(this, "XI PPLG 1", Toast.LENGTH_SHORT).show()

                val tombol = findViewById<Button>(R.id.NIS)

                tombol.setOnClickListener {
                    Toast.makeText(this, "2233243", Toast.LENGTH_SHORT).show()


                }
            }
        }
    }
}
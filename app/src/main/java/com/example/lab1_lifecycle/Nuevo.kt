package com.example.lab1_lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Nuevo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nuevo)
    }
}
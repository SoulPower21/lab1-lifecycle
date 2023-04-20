package com.example.lab1_lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val tag: String="INF-STATE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(tag,"MainActivity-->OnCreate")
    }

    override fun onStart(){
        super.onStart()
        Log.i(tag,"MainActivity-->OnStart")
    }

    override fun onResume(){
        super.onResume()
        Log.i(tag,"MainActivity-->OnResume")
    }

    override fun onPause(){
        super.onPause()
        Log.i(tag,"MainActivity-->OnPause")
    }

    override fun onStop(){
        super.onStop()
        Log.i(tag,"MainActivity-->OnStop")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.i(tag,"MainActivity-->OnDestroy")
    }
}
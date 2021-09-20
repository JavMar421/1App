package com.example.a1app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Log Import Required
        Log.v("MainActivity", "Se ha creado correctamente")
        //Type de LOG
        // v valid d debug i important
        // w warning e error
        Toast.makeText(this, getString(R.string.hello), Toast.LENGTH_LONG).show()
    }
}

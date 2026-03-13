package com.example.cardview2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencia al RecyclerView del XML
        val cakeList: RecyclerView = findViewById(R.id.recycler)

        // Asignamos cómo se ordenarán los elementos (lista vertical)
        cakeList.layoutManager = LinearLayoutManager(this)

        // Instanciamos el adapter
        val cakeAdapter = CakeAdapter()

        // Unimos el adapter al RecyclerView y le pasamos los datos
        cakeList.adapter = cakeAdapter
        cakeAdapter.cakes = Cake.data
    }
}
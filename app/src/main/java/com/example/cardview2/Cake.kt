package com.example.cardview2

import com.example.cardview2.R

data class Cake(
    val cakeImage: Int,
    val title: String,
    val description: String
) {
    companion object {
        val data = listOf(
            Cake(R.drawable.donut, "Donut", "Description donut"),
            Cake(R.drawable.eclair, "Eclair", "Description eclair"),
            Cake(R.drawable.muffin, "Muffin", "Description muffin"),
            Cake(R.drawable.pudding, "Pudding", "Description pudding"),
            Cake(R.drawable.cupcake, "Cupcake", "Description cupcake"),
            Cake(R.drawable.donuts, "Donuts", "Description donuts")
        )
    }
}
package com.example.cardview2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CakeAdapter : RecyclerView.Adapter<CakeAdapter.CakeViewHolder>() {

    var cakes = listOf<Cake>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    class CakeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ckimage: ImageView = view.findViewById(R.id.cakeimage)
        val cktitle: TextView = view.findViewById(R.id.caketitle)
        val ckdescrip: TextView = view.findViewById(R.id.cakedescrip)

        fun bind(cake: Cake) {
            ckimage.setImageResource(cake.cakeImage)
            cktitle.text = cake.title
            ckdescrip.text = cake.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CakeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cake_item, parent, false)
        return CakeViewHolder(view)
    }

    override fun onBindViewHolder(holder: CakeViewHolder, position: Int) {
        val cake = cakes[position]
        holder.bind(cake)
    }

    override fun getItemCount(): Int {
        return cakes.size
    }
}
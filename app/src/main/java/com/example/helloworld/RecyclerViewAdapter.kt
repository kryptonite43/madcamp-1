package com.example.helloworld

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    var datalist = mutableListOf<phoneData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.listview_item,parent,false)
        return ViewHolder(view)
    }
    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private val nametxt : TextView = itemView.findViewById(R.id.name)
        private val phonetxt: TextView = itemView.findViewById(R.id.phone)

        fun bind(item: phoneData) {
            nametxt.text = item.name
            phonetxt.text = item.phone
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind((datalist[position]))
    }

    override fun getItemCount(): Int = datalist.size
}
package com.lihan.practiceproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PracticeListAdapter(var practices : ArrayList<String>) : RecyclerView.Adapter<PracticeListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PracticeListViewHolder {
        return PracticeListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_practicelist,parent,false))
    }

    override fun getItemCount() = practices.size

    override fun onBindViewHolder(holder: PracticeListViewHolder, position: Int) {
        val practiceName= practices[position]
        holder.bindTo(practiceName)
    }
}
package com.lihan.practiceproject

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PracticeListViewHolder(itemView : View)  : RecyclerView.ViewHolder(itemView){
    private val nameTextView  = itemView.findViewById<TextView>(R.id.pracitcenameTextView)
    fun bindTo(name : String){
        nameTextView.text = name
    }
}
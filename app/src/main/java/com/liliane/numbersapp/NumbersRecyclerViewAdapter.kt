package com.liliane.numbersapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumbersRecyclerViewAdapter(var fibonaciList: List<Int>): RecyclerView.Adapter<NumbersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        var itemView=
            LayoutInflater.from(parent.context).inflate(R.layout.numbers_list_item,parent,false)
        return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvNumber.text= fibonaciList.get(position).toString()
    }

    override fun getItemCount(): Int {
        return fibonaciList.size
    }
}

    class NumbersViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvNumber=itemView.findViewById<TextView>(R.id.tvNumber)

}
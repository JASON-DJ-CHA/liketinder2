package com.jason.example.myapplication.cardslider

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jason.example.myapplication.R

class CardStackAdapter(val context : Context, val items : List<String>) : RecyclerView.Adapter<CardStackAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardStackAdapter.ViewHolder {
        // itemview 적용
        val inflater = LayoutInflater.from(parent.context)
        val view : View = inflater.inflate(R.layout.item_card,parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardStackAdapter.ViewHolder, position: Int) {
        // 데이터를 받아서 item에 넣어주는 코드
        holder.binding(items[position])
    }

    override fun getItemCount(): Int {
        //아이템들의 갯수
        return items.size
    }

    inner class ViewHolder(itemView : View) :RecyclerView.ViewHolder(itemView){

        fun binding(data : String){

        }

    }
}
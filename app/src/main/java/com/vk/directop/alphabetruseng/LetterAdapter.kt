package com.vk.directop.alphabetruseng

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LetterAdapter(letterViews: List<Letter>) : RecyclerView.Adapter<LetterAdapter.LetterViewHolder>() {

    private val list = letterViews

    inner class LetterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LetterViewHolder {
        return LetterViewHolder(
            LayoutInflater.from(parent.context)
            .inflate(R.layout.letter_item, parent, false))
    }

    override fun onBindViewHolder(holder: LetterViewHolder, position: Int) {
        val currentView = list[position]
        val ivImage : ImageView = holder.itemView.findViewById(R.id.iv_image)
        val tvDescription : TextView = holder.itemView.findViewById(R.id.tv_description)

        ivImage.setImageResource(currentView.imageId)
        tvDescription.text = currentView.name
    }

    override fun getItemCount(): Int {
        return list.size
    }


}
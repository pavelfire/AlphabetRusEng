package com.vk.directop.alphabetruseng

import android.media.MediaPlayer
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class LetterAdapter(letterViews: List<Letter>) :
    RecyclerView.Adapter<LetterAdapter.LetterViewHolder>() {

    private val list = letterViews

    inner class LetterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(letter: Letter) {
            val tvDescription: TextView = itemView.findViewById(R.id.tv_description)
            tvDescription.setOnClickListener {
                Toast.makeText(
                    itemView.context,
                    //" ${name.text} : ${aNumber.text}",
                    "Element pressed",
                    Toast.LENGTH_LONG
                ).show()

                Log.d("MyTag", "Pressed ")

                var mediaPlayer = MediaPlayer.create(itemView.context, letter.soundId)
                mediaPlayer.start()


            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LetterViewHolder {
        return LetterViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.letter_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: LetterViewHolder, position: Int) {
        val currentView = list[position]
        val ivImage: ImageView = holder.itemView.findViewById(R.id.iv_image)
        val tvDescription: TextView = holder.itemView.findViewById(R.id.tv_description)

        holder.bind(currentView)


        ivImage.setImageResource(currentView.imageId)
        tvDescription.text = currentView.name
    }

    override fun getItemCount(): Int {
        return list.size
    }


}
package com.vk.directop.alphabetruseng

import android.graphics.Color
import android.media.MediaPlayer
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView

class ListAdapter (letterViews: List<Letter>) :
    RecyclerView.Adapter<ListAdapter.LetterViewHolder>() {

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
                .inflate(R.layout.recycler_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: LetterViewHolder, position: Int) {
        val currentView = list[position]
        val ivImage: ImageView = holder.itemView.findViewById(R.id.iv_image)
        val tvDescription: TextView = holder.itemView.findViewById(R.id.tv_description)
        val linLayItem : LinearLayout = holder.itemView.findViewById(R.id.lin_lay_item)
        val relLayItem : RelativeLayout = holder.itemView.findViewById(R.id.rel_lay_item)

        //linLayItem.setBackgroundColor(Color.parseColor("#00aaff"))"#00aaff", "#709a54", "#f0aa88"


        val colorsBack = listOf(R.color.color1, R.color.color2, R.color.color3, R.color.color4)

//        relLayItem.setBackgroundColor(Color.parseColor(colorsBack.random().toString()))
        //relLayItem.background = Color.parseColor(R.color.color4)//colorsBack.random())

        holder.bind(currentView)

//        if(position == selected_item) {
//            holder.view.setBackgroundColor(Color.parseColor("#70aaff"));
//        } else {
//            holder.view.setBackgroundColor(Color.parseColor("#00000")); //actually you should set to the normal text color
//        }

        ivImage.setImageResource(currentView.imageId)
        tvDescription.text = currentView.name
    }

    override fun getItemCount(): Int {
        return list.size
    }

}
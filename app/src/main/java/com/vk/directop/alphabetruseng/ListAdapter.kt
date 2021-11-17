package com.vk.directop.alphabetruseng

import android.graphics.Color
import android.media.MediaPlayer
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(letterViews: List<Letter>) :
    RecyclerView.Adapter<ListAdapter.LetterViewHolder>() {

    private val list = letterViews

    inner class LetterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(letter: Letter) {
            val tvDescription: TextView = itemView.findViewById(R.id.tv_description)
            tvDescription.setOnClickListener {
//                Toast.makeText(
//                    itemView.context,
//                    //" ${name.text} : ${aNumber.text}",
//                    "Element pressed",
//                    Toast.LENGTH_LONG
//                ).show()
//
//                Log.d("MyTag", "Pressed ")

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
        val linLayItem: LinearLayout = holder.itemView.findViewById(R.id.lin_lay_item)
        val relLayItem: RelativeLayout = holder.itemView.findViewById(R.id.rel_lay_item)

        //.setBackgroundColor(ContextCompat.getColor(applicationContext, R.color.colorAccent))

        //val colorsBack = listOf(R.color.color1, R.color.color2, R.color.color3, R.color.color4)
//        val colorsBackground = listOf(
//            "#5EE35E", "#E3A75E", "#5EC4E3", "#E35E88", "#5EE3C4",
//            "#E3695E", "#E38D5E", "#5E74E3", "#9CE35E", "#CB5EE3", "#E35E5E"
//        )
        val colorsBackground = listOf(
            "#B2D3B2", "#D3B2B2", "#D3BEB2", "#D2D3B2", "#C6D3B2",
            "#B2D3CF", "#B2D3B2", "#B2B5D3", "#CEB2D3", "#B7B2D3", "#D3B2B6"
        )

        relLayItem.setBackgroundColor(Color.parseColor(colorsBackground.random().toString()))

        holder.bind(currentView)

        ivImage.setImageResource(currentView.imageId)
        tvDescription.text = currentView.name
    }

    override fun getItemCount(): Int {
        return list.size
    }

}
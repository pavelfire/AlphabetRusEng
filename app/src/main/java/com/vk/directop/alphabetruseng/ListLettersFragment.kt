package com.vk.directop.alphabetruseng

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class ListLettersFragment : Fragment() {

    lateinit var letterViews: MutableList<Letter>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list_letters, container, false)

        letterViews = addToLetterViews()

        val itemsRecyclerView: RecyclerView = view.findViewById(R.id.items_recycler_view)
        itemsRecyclerView.layoutManager =
            LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL, false)

        itemsRecyclerView.addItemDecoration(
            DividerItemDecoration(
                view.context,
                DividerItemDecoration.VERTICAL
            )
        )
        itemsRecyclerView.adapter = ListAdapter(letterViews)

        return view
    }

//    private fun addToLetterViews() {
//
//        letterViews = mutableListOf<Letter>(
//            //Letter("Welcome!", R.drawable.ic_info),
//            //Letter("This is the second page", R.drawable.ic_eng),
//            //Letter("This is the final page", R.drawable.ic_info)
//        )
//
//        var letter: Char = 'а'
//        //var letters = mutableListOf<Char>()
//        while (letter <= 'я') {
//            //letters.add(letter)
//            letterViews.add(
//                Letter(
//                    letter.toString().uppercase(Locale.getDefault()),
//                    R.drawable.ic_info,
//                    R.raw.a
//                )
//            )
//            ++letter
//        }
//    }

}
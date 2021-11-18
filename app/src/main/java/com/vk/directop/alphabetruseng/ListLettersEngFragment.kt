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

class ListLettersEngFragment : Fragment() {

    lateinit var letterViews: MutableList<Letter>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list_letters, container, false)

        letterViews = addToEngLetterViews()

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
//        letterViews = mutableListOf()
//
//        var letter: Char = 'a'
//        //var letters = mutableListOf<Char>()
//        while (letter <= 'z') {
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
package com.vk.directop.alphabetruseng

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import me.relex.circleindicator.CircleIndicator3
import java.util.*


class RusFragment : Fragment() {

    lateinit var letterViews : MutableList<Letter>

    lateinit var viewPager2: ViewPager2
    lateinit var circleIndicator : CircleIndicator3


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_rus, container, false)

        viewPager2 = view.findViewById(R.id.viewPager2)
        circleIndicator = view.findViewById(R.id.circleIndicator)

        addToLetterViews()

        viewPager2.adapter = LetterAdapter(letterViews)
        viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        circleIndicator.setViewPager(viewPager2)

        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                if (position == 2){
                    //some action on last page
                }

                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
            }
        })

        return view
    }



    private fun addToLetterViews(){

        letterViews = mutableListOf<Letter>(
            //Letter("Welcome!", R.drawable.ic_info),
            //Letter("This is the second page", R.drawable.ic_eng),
            //Letter("This is the final page", R.drawable.ic_info)
        )

        var letter: Char = 'а'
        //var letters = mutableListOf<Char>()
        while(letter <= 'я') {
            //letters.add(letter)
            letterViews.add(Letter(letter.toString().uppercase(Locale.getDefault()), R.drawable.ic_info))
            ++letter
        }


    }

}
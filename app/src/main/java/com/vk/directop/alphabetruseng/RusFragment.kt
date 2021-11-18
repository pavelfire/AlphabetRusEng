package com.vk.directop.alphabetruseng

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2

class RusFragment : Fragment() {

    lateinit var letterViews: MutableList<Letter>

    lateinit var viewPager2: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_rus, container, false)

        viewPager2 = view.findViewById(R.id.viewPager2)

        letterViews = addToLetterViews()

        viewPager2.adapter = LetterAdapter(letterViews)
        viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                if (position == 2) {
                }

                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
            }
        })

        return view
    }


}
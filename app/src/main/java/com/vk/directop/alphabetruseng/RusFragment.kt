package com.vk.directop.alphabetruseng

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Switch
import androidx.viewpager2.widget.ViewPager2
import me.relex.circleindicator.CircleIndicator3
import java.util.*


class RusFragment : Fragment() {

    lateinit var letterViews: MutableList<Letter>

    lateinit var viewPager2: ViewPager2
    lateinit var circleIndicator: CircleIndicator3
    lateinit var btnStart: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_rus, container, false)

        viewPager2 = view.findViewById(R.id.viewPager2)
        circleIndicator = view.findViewById(R.id.circleIndicator)
        btnStart = view.findViewById(R.id.btn_start)

        letterViews = addToLetterViews()

        viewPager2.adapter = LetterAdapter(letterViews)
        viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        circleIndicator.setViewPager(viewPager2)

        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                if (position == 2) {
                    //some action on last page
                }

                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
            }
        })

        return view
    }




}
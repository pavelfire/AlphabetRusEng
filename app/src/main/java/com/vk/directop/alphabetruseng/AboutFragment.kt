package com.vk.directop.alphabetruseng

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class AboutFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_about, container, false)

        val btnShare : Button = view.findViewById(R.id.btn_share)

        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, getString(R.string.share ))
        val chooser = Intent.createChooser(intent, "Поделиться!")
        btnShare.setOnClickListener {
            startActivity(chooser)
        }

        return view
    }


}
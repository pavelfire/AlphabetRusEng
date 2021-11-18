package com.vk.directop.alphabetruseng

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Switch
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val LAST_SELECTED_MENU = "LAST_SELECTED_MENU"

class MainActivity : AppCompatActivity() {

    private lateinit var bottomMenu: BottomNavigationView
    private lateinit var switch: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switch = findViewById(R.id.switch1)
        bottomMenu = findViewById(R.id.bottom_nav)

        switch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked && bottomMenu.selectedItemId == R.id.rus_alphabet) {
                //Toast.makeText(this, "Switch on true", Toast.LENGTH_SHORT).show()
                val rusFragment = RusFragment()
                replaceFragment(rusFragment)

            } else if (isChecked && bottomMenu.selectedItemId != R.id.rus_alphabet) {
                //Toast.makeText(this, "Switch on false", Toast.LENGTH_SHORT).show()
                val engFragment = ListLettersEngFragment()
                replaceFragment(engFragment)
            } else if (!isChecked && bottomMenu.selectedItemId == R.id.rus_alphabet) {

                //Toast.makeText(this, "Switch off true", Toast.LENGTH_SHORT).show()
                val rusFragment = ListLettersFragment()
                replaceFragment(rusFragment)

            } else if (!isChecked && bottomMenu.selectedItemId != R.id.rus_alphabet) {
                //Toast.makeText(this, "Switch off false", Toast.LENGTH_SHORT).show()
                val engFragment = EngFragment()
                replaceFragment(engFragment)
            }

        }

        bottomMenu.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.rus_alphabet -> {

//                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.muz_sound)
//                    mediaPlayer.start()
                    switch.isChecked = false
                    val rusFragment = ListLettersFragment()
                    replaceFragment(rusFragment)
                    switch.visibility = View.VISIBLE

                }
                R.id.eng_alphabet -> {

//                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.muz_sound)
//                    mediaPlayer.start()
                    switch.isChecked = false
                    val engFragment = EngFragment()
                    replaceFragment(engFragment)
                    switch.visibility = View.VISIBLE

                }
                R.id.about -> {

//                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.muz_sound)
//                    mediaPlayer.start()

                    val aboutFragment = AboutFragment()
                    replaceFragment(aboutFragment)
                    switch.visibility = View.GONE
                }
            }
            true
        }
        val itemsFragment = RusFragment()
        supportFragmentManager // обращаемся к fm
            .beginTransaction() //начать транзакцию
            .add(R.id.fragment_container, itemsFragment) // действие
            .commit() // закончить транзакцию

        // восстанавливаем выбранный пункт меню при пересоздании активити
        bottomMenu.selectedItemId =
            savedInstanceState?.getInt(LAST_SELECTED_MENU) ?: R.id.rus_alphabet
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager // обращаемся к fm
            .beginTransaction() //начать транзакцию
            .replace(R.id.fragment_container, fragment) // действие
            .commit() // закончить транзакцию
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(LAST_SELECTED_MENU, bottomMenu.selectedItemId)
        super.onSaveInstanceState(outState)
    }
}
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

    private lateinit var bottomMenu : BottomNavigationView
    private lateinit var switch : Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switch = findViewById(R.id.switch1)
        bottomMenu = findViewById(R.id.bottom_nav)

//        if(switch.isActivated){
//            Toast.makeText(this, "Switch on", Toast.LENGTH_SHORT).show()
//        }else {
//            Toast.makeText(this, "Switch off", Toast.LENGTH_SHORT).show()
//        }
        switch.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                Toast.makeText(this, "Switch on", Toast.LENGTH_SHORT).show()
            }else {
                Toast.makeText(this, "Switch off", Toast.LENGTH_SHORT).show()
            }
        }



        bottomMenu.setOnItemSelectedListener {
            when(it.itemId){
                R.id.rus_alphabet -> {
                    val menuFragment = RusFragment()
                    replaceFragment(menuFragment)
                    switch.visibility = View.VISIBLE
                }
                R.id.eng_alphabet -> {

                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.c)
                    mediaPlayer.start()

                    val favoriteFragment = ListLettersFragment()
                    replaceFragment(favoriteFragment)
                    switch.visibility = View.VISIBLE
                }
                R.id.about -> {

                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.b)
                    mediaPlayer.start()

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
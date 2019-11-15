package com.example.plh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.plh.Navigation.HomeFragment
import com.example.plh.Navigation.InformationFragment
import com.example.plh.Navigation.ProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var homeFragment : HomeFragment
    lateinit var information  : InformationFragment
    lateinit var profile      : ProfileFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation : BottomNavigationView = findViewById(R.id.bottom_nav)

        bottomNavigation.setOnNavigationItemSelectedListener {item ->
            when (item.itemId){
                R.id.home -> {
                    homeFragment = HomeFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame, homeFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.info -> {
                    information = InformationFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame, information)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()

                }
                R.id.profile -> {
                    profile = ProfileFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame, profile)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
            }

            true

        }


    }
}

package com.example.android.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.android.R
import com.example.android.fragments.MainGridFragment
import com.example.android.fragments.MainGridFragment.Companion.newInstance
import com.example.android.fragments.MainListFragment
import com.example.android.models.Friends
import com.example.android.repositories.FriendRepository
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class MainActivity : FragmentActivity() {


    private lateinit var bottomNavigationView: BottomNavigationItemView



    /*************** Lifecycle **********/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configureView()
        configureViewListeners()

        openListFragment()


        }

    /*************** Configure **********/

    private fun configureView() {
        bottomNavigationView = findViewById(R.id.mainBottomNavigation)

    }


    private fun configureViewListeners() {
        bottomNavigationView.setOnItemSelectedListener {

            val it = null
            when (it.itemId) {
                R.id.menuGrid -> {
                    openGridFragment()
                    true

                }

                R.id.menuList -> {
                    openListFragment()
                    true

                }

                else -> false

            }
        }
    }

    private fun openListFragment() {

        supportFragmentManager.beginTransaction().replace(com.google.android.material.R.id.container,
        MainListFragment.newInstance()).commit()


    }

    private fun openGridFragment() {
        supportFragmentManager.beginTransaction().replace(
            com.google.android.material.R.id.container,
            MainGridFragment.newInstance()).commit()


    }

}
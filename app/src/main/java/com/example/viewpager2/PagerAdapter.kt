package com.example.viewpager2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager2.fragments.First
import com.example.viewpager2.fragments.Second
import com.example.viewpager2.fragments.Third

class PagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {

    override fun getItemCount(): Int = 3 // количество табов(страниц)

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> First()
            1 -> Second()
            2 -> Third()

            else->{
                First()
            }
        }
    }


}
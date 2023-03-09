package com.example.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager2.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewPager.setPageTransformer(PagerTransformer())

        binding.viewPager.adapter = PagerAdapter(this)

        val tabLayoutMediator = TabLayoutMediator(tabs,viewPager,true){
            tab , position ->
            tab.text = getItemTitle(position)
        }

        tabLayoutMediator.attach()

    }

    val nameOfTabs = arrayOf("Товары", "Цены", "Долги")

    fun getItemTitle(position: Int): String{
        return when(position){
                0 -> nameOfTabs[0]
                1 -> nameOfTabs[1]
                2 -> nameOfTabs[2]
            else -> { nameOfTabs[0]}
        }
    }
}
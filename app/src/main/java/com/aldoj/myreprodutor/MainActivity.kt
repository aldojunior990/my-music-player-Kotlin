package com.aldoj.myreprodutor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private  lateinit var fragmentTablayout: TabLayout
    private  lateinit var fragmentViewPager: ViewPager2
    private  lateinit var viewPagerAdapter: ViewPagerAdapter
    private lateinit var arrayAdapter : ArrayAdapter<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val FragmentsTitle = listOf<String>(
            "MOODS",
            "MUSICAS",
            "PLAYLISTS"
        )

        val contents = listOf<Fragment>(
            MoodFragment(),
            MoodFragment(),
            MoodFragment(),
        )
        fragmentViewPager = findViewById(R.id.viewpager)
        fragmentTablayout = findViewById(R.id.tab_layout)
        viewPagerAdapter = ViewPagerAdapter(this, contents)

        fragmentViewPager.adapter = viewPagerAdapter


        TabLayoutMediator(fragmentTablayout, fragmentViewPager) { tab, position ->
            tab.text = FragmentsTitle[position]
        }.attach()

    }


}
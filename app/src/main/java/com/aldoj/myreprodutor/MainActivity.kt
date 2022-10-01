package com.aldoj.myreprodutor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val moodFragment = MoodFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, moodFragment)
            commit()
        }


        val btn_moods: Button = findViewById(R.id.btn_moods_fragment)
        val btn_music: Button = findViewById(R.id.btn_music_fragment)
        val btn_playlists: Button = findViewById(R.id.btn_playlist_fragment)

        btn_moods.setOnClickListener {
            btn_moods.setTextColor(resources.getColor(R.color.second_black))
            btn_music.setTextColor(resources.getColor(R.color.gray))
            btn_playlists.setTextColor(resources.getColor(R.color.gray))

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container, moodFragment)
                commit()
            }
        }

        btn_music.setOnClickListener {
            btn_music.setTextColor(resources.getColor(R.color.second_black))
            btn_moods.setTextColor(resources.getColor(R.color.gray))
            btn_playlists.setTextColor(resources.getColor(R.color.gray))
        }

        btn_playlists.setOnClickListener {
            btn_playlists.setTextColor(resources.getColor(R.color.second_black))
            btn_moods.setTextColor(resources.getColor(R.color.gray))
            btn_music.setTextColor(resources.getColor(R.color.gray))
        }
    }
}
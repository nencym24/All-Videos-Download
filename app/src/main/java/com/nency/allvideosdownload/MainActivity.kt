package com.nency.allvideosdownload

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.nency.allvideosdownload.Fragments.StatusSaverFragment
import com.nency.allvideosdownload.Fragments.VideoDownloaderFragment
import com.nency.allvideosdownload.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.background = null
        binding.bottomNavigationView.menu.getItem(0).isEnabled = true

        val iconColorStates = ColorStateList(
            arrayOf(
                intArrayOf(android.R.attr.state_checked),
                intArrayOf(android.R.attr.state_checked)
            ), intArrayOf(
                Color.parseColor("#000000"),
                Color.parseColor("#f61300")
            )
        )
        binding.bottomNavigationView.itemIconTintList = null
        binding.bottomNavigationView.itemTextColor = iconColorStates
        var Type = arrayOf("Status Saver", "Video Downloader")
        var Fragments = arrayOf(StatusSaverFragment(), VideoDownloaderFragment())
        loadFragment(StatusSaverFragment())

        binding.bottomNavigationView.setOnNavigationItemSelectedListener(object :
            BottomNavigationView.OnNavigationItemSelectedListener {
            override fun onNavigationItemSelected(item: MenuItem): Boolean {

                when (item.itemId) {
                        R.id.statusSaver -> {
                        loadFragment(StatusSaverFragment())
                    }
                }
                when (item.itemId) {
                    R.id.videoPlayer -> {
                        loadFragment(VideoDownloaderFragment())
                    }
                }
                return true
            }
        })
    }
    private fun loadFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame,fragment)
            .commit()
    }
}
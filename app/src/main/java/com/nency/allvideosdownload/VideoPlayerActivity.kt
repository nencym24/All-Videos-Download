package com.nency.allvideosdownload

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.nency.allvideosdownload.Fragments.GallaryFragment
import com.nency.allvideosdownload.Fragments.MusicFragment
import com.nency.allvideosdownload.Fragments.Video2Fragment
import com.nency.allvideosdownload.databinding.ActivityVideoPlayerBinding

class VideoPlayerActivity : AppCompatActivity() {

    lateinit var  binding : ActivityVideoPlayerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.background = null
        binding.bottomNavigationView.menu.getItem(0).isEnabled = true

        val iconColorStates = ColorStateList(
            arrayOf(
                intArrayOf(-android.R.attr.state_checked),
                intArrayOf(android.R.attr.state_checked)
            ), intArrayOf(
                Color.parseColor("#000000"),
                Color.parseColor("#f61300")
            )
        )
        binding.bottomNavigationView.itemIconTintList = null
        binding.bottomNavigationView.itemTextColor = iconColorStates

        var Type = arrayOf("Video", "Music", "Gallary")
        var Fragments = arrayOf(Video2Fragment(), MusicFragment(), GallaryFragment())
        loadFragment(Video2Fragment())
        binding.bottomNavigationView.setOnNavigationItemSelectedListener(object :
            BottomNavigationView.OnNavigationItemSelectedListener {
            override fun onNavigationItemSelected(item: MenuItem): Boolean {

                when (item.itemId) {
                    R.id.itemVideo -> {
                        loadFragment(Video2Fragment())
                    }
                }
                when (item.itemId) {
                    R.id.itemMusic -> {
                        loadFragment(MusicFragment())
                    }
                }
                when (item.itemId) {
                    R.id.itemGallary -> {
                        loadFragment(GallaryFragment())
                    }
                }
                return true
            }
        })
    }
    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame, fragment)
            .commit()
    }

}
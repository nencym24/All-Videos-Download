package com.nency.allvideosdownload

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.nency.allvideosdownload.Adapters.FragmentPageAdapter
import com.nency.allvideosdownload.Fragments.ImageFragment
import com.nency.allvideosdownload.Fragments.SavedFragment
import com.nency.allvideosdownload.Fragments.VideoFragment
import com.nency.allvideosdownload.databinding.ActivitySaveStatusBinding

class SaveStatusActivity : AppCompatActivity() {

    lateinit var binding: ActivitySaveStatusBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_save_status)

        binding.imgBackArrow.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val Tabs = arrayOf("Images", "Videos", "Saved")
        val Fragments = arrayOf(ImageFragment(), VideoFragment(), SavedFragment())

        binding.ViewPager.adapter = FragmentPageAdapter(supportFragmentManager, Tabs, Fragments)
        binding.tabLayout.setupWithViewPager(binding.ViewPager)

    }
}
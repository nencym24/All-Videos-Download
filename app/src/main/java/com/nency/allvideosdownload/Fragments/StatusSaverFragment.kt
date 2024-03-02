package com.nency.allvideosdownload.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nency.allvideosdownload.PermissionActivity
import com.nency.allvideosdownload.R
import com.nency.allvideosdownload.SaveStatusActivity
import com.nency.allvideosdownload.VideoDownloadActivity
import com.nency.allvideosdownload.VideoPlayerActivity
import com.nency.allvideosdownload.databinding.FragmentStatusSaverBinding


class StatusSaverFragment : Fragment() {

    lateinit var binding: FragmentStatusSaverBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentStatusSaverBinding.inflate(layoutInflater)

        binding.imgSaveStatus.setOnClickListener {
            var intent = Intent(context, SaveStatusActivity::class.java)
            startActivity(intent)
        }
        binding.imgVideoPlayer.setOnClickListener {
            var intent = Intent(context, VideoPlayerActivity::class.java)
            startActivity(intent)
        }
        binding.imgVideoDownloader.setOnClickListener {
            var intent = Intent(context, VideoDownloadActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }

}
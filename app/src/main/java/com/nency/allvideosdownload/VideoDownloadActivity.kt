package com.nency.allvideosdownload

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nency.allvideosdownload.databinding.ActivityVideoDownloadBinding

class VideoDownloadActivity : AppCompatActivity() {

    lateinit var binding : ActivityVideoDownloadBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoDownloadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgSnackVideo.setOnClickListener {
            var intent = Intent(this,SnackVideoActivity::class.java)
            startActivity(intent)
        }
        binding.imgShareChat.setOnClickListener {
            var intent = Intent(this,ShareChatActivity::class.java)
            startActivity(intent)
        }
        binding.imgRoposo.setOnClickListener {
            var intent = Intent(this,RoposoActivity::class.java)
            startActivity(intent)
        }
        binding.imgLikee.setOnClickListener {
            var intent = Intent(this,LikeeActivity::class.java)
            startActivity(intent)
        }
        binding.imgTwitter.setOnClickListener {
            var intent = Intent(this,TwitterActivity::class.java)
            startActivity(intent)
        }
        binding.imgTikTok.setOnClickListener {
            var intent = Intent(this,TikTokActivity::class.java)
            startActivity(intent)
        }
        binding.imgFaceBook.setOnClickListener {
            var intent = Intent(this,FacebookActivity::class.java)
            startActivity(intent)
        }
        binding.imgInstagram.setOnClickListener {
            var intent = Intent(this,InstagramActivity::class.java)
            startActivity(intent)
        }
    }
}
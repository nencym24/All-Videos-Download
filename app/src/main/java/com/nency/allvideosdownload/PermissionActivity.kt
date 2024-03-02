package com.nency.allvideosdownload

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nency.allvideosdownload.databinding.ActivityPermissionBinding
import com.nency.allvideosdownload.databinding.ActivityPrivacyPolicyBinding

class PermissionActivity : AppCompatActivity() {

    lateinit var  binding: ActivityPermissionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPermissionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAllow.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
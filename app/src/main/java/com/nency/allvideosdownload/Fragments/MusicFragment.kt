package com.nency.allvideosdownload.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.nency.allvideosdownload.Adapters.imageAdapter
import com.nency.allvideosdownload.Adapters.musicAdapter
import com.nency.allvideosdownload.Models.imageModel
import com.nency.allvideosdownload.Models.musicModel
import com.nency.allvideosdownload.R
import com.nency.allvideosdownload.databinding.FragmentGallaryBinding
import com.nency.allvideosdownload.databinding.FragmentMusicBinding


class MusicFragment : Fragment() {

    lateinit var binding : FragmentMusicBinding

    var song = arrayOf("Happy-Birthday-To-You-Happy","Ek Hazaaron Mein Meri Behna Hai...", "Teri Meri.mp3","Saudebaazi.mp3","AUD-20220811-WA0001.mp3","Tum Mile.mp3","AUD-20220811-WA0002.mp3","Hum Sath Sath Hai.mp3","Happy-Birthday-To-You-Happy","Ek Hazaaron Mein Meri Behna Hai...", "Teri Meri.mp3","Saudebaazi.mp3","AUD-20220811-WA0001.mp3","Tum Mile.mp3","AUD-20220811-WA0002.mp3","Hum Sath Sath Hai.mp3","Happy-Birthday-To-You-Happy","Ek Hazaaron Mein Meri Behna Hai...", "Teri Meri.mp3","Saudebaazi.mp3","AUD-20220811-WA0001.mp3","Tum Mile.mp3","AUD-20220811-WA0002.mp3","Hum Sath Sath Hai.mp3")
    var singer = arrayOf("Download Wishes Plus","Ek hazaaro mein meri bahena hai Song <unknown>","Bodyguard Himesh Reshammaiya, Shreya Ghoshal, Ra..","Download <Unknown>","Whatsapp Audio <Unknown>","Download <Unknown>","Whatsapp Audio <Unknown>","Download <Unknown>","Download Wishes Plus","Ek hazaaro mein meri bahena hai Song <unknown>","Bodyguard Himesh Reshammaiya, Shreya Ghoshal, Ra..","Download <Unknown>","Whatsapp Audio <Unknown>","Download <Unknown>","Whatsapp Audio <Unknown>","Download <Unknown>","Download Wishes Plus","Ek hazaaro mein meri bahena hai Song <unknown>","Bodyguard Himesh Reshammaiya, Shreya Ghoshal, Ra..","Download <Unknown>","Whatsapp Audio <Unknown>","Download <Unknown>","Whatsapp Audio <Unknown>","Download <Unknown>")

    var list = ArrayList<musicModel>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMusicBinding.inflate(layoutInflater)
        for (i in 0..song.size - 1) {

            var model = musicModel(song[i],singer[i])
            list.add(model)
        }

        binding.rcvMusic.layoutManager = LinearLayoutManager(context)
        binding.rcvMusic.adapter = musicAdapter(list)

        return binding.root

    }

}
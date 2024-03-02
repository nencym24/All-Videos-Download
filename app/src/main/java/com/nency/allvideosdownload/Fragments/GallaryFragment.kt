package com.nency.allvideosdownload.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.nency.allvideosdownload.Adapters.imageAdapter
import com.nency.allvideosdownload.Models.imageModel
import com.nency.allvideosdownload.R
import com.nency.allvideosdownload.R.drawable.*
import com.nency.allvideosdownload.databinding.FragmentGallaryBinding

class GallaryFragment : Fragment() {

    lateinit var binding : FragmentGallaryBinding

    var iamges = arrayOf(image1, image2, image3, image4, image5, image6, image7, image8, image9, image10, image11, image12, image1, image2, image3, image4, image5, image6, image7, image8, image9, image10, image11, image12)
    var folder = arrayOf("WhatApp Imag...","WallPaper", "Pictures","Instagram","Camera","Facebook","Download","Snapchat","Telegram","Food","Nature","Friends","WhatApp Imag...","WallPaper", "Pictures","Instagram","Camera","Facebook","Download","Snapchat","Telegram","Food","Nature","Friends")
    var storage = arrayOf("342 Media","101 Media","45 Media","52 Media","50 Media","5 Media","13 Media","1 Media","3 Media","9 Media","7 Media","12 Media","342 Media","101 Media","45 Media","52 Media","50 Media","5 Media","13 Media","1 Media","3 Media","9 Media","7 Media","12 Media")

    var list = ArrayList<imageModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentGallaryBinding.inflate(layoutInflater)

        for (i in 0..folder.size - 1) {

            var model = imageModel(folder[i], storage[i],iamges[i])
            list.add(model)
        }

        binding.rcvImages.layoutManager = GridLayoutManager(context,3,
            GridLayoutManager.VERTICAL,false)
        binding.rcvImages.adapter = imageAdapter(list)

        return binding.root
    }

}
package com.nency.allvideosdownload.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nency.allvideosdownload.R
import com.nency.allvideosdownload.databinding.FragmentImageBinding


class ImageFragment : Fragment() {

    lateinit var binding : FragmentImageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentImageBinding.inflate(layoutInflater)

        return binding.root
    }

}
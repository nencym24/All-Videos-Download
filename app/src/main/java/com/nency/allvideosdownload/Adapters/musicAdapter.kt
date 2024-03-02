package com.nency.allvideosdownload.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nency.allvideosdownload.Models.imageModel
import com.nency.allvideosdownload.Models.musicModel
import com.nency.allvideosdownload.R

class musicAdapter(list1: ArrayList<musicModel>) : RecyclerView.Adapter<musicAdapter.musicHolder>() {

    private var list = list1
    lateinit var context: Context

    class musicHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var textSong: TextView = itemView.findViewById(R.id.txtSong)
        var textSinger: TextView = itemView.findViewById(R.id.txtSinger)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): musicHolder {
        context = parent.context
        val view = LayoutInflater.from(parent.context).inflate(R.layout.music_item, parent, false)
        return musicHolder(view)
    }

    override fun onBindViewHolder(holder: musicHolder, position: Int) {
        holder.textSong.text = list[position].song
        holder.textSinger.text = list[position].singer
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
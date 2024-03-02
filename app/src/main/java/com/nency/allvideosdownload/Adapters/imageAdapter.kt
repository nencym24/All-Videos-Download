package com.nency.allvideosdownload.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.nency.allvideosdownload.Models.imageModel
import com.nency.allvideosdownload.R

class imageAdapter(list1: ArrayList<imageModel>) : RecyclerView.Adapter<imageAdapter.imageHolder>() {

    private var list = list1
    lateinit var context: Context

    class imageHolder(itemView: View) : ViewHolder(itemView){
        var textFolder: TextView = itemView.findViewById(R.id.txtFolder)
        var textStorage: TextView = itemView.findViewById(R.id.txtStorage)
        var imageImg: ImageView = itemView.findViewById(R.id.imgImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): imageHolder {
        context = parent.context
        val view = LayoutInflater.from(parent.context).inflate(R.layout.image_item, parent, false)
        return imageHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: imageHolder, position: Int) {
        holder.textStorage.text = list[position].storage
        holder.textFolder.text = list[position].folder
        Glide.with(context).load(list[position].image).into(holder.imageImg)
    }
}
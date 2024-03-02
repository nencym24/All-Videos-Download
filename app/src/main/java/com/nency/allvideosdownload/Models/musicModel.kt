package com.nency.allvideosdownload.Models

class musicModel {

    lateinit var song:String
    lateinit var singer : String

    constructor(song: String, singer: String) {
        this.song = song
        this.singer = singer
    }
}
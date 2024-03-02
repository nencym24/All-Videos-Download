package com.nency.allvideosdownload.Models

class imageModel {

    lateinit var folder:String
    lateinit var storage : String
     var image : Int

    constructor(folder: String, storage: String, image: Int) {
        this.folder = folder
        this.storage = storage
        this.image = image
    }
}
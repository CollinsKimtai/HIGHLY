package com.olive.homly.model

import android.media.Image
import androidx.compose.ui.graphics.painter.Painter


class Product{
    var name:String=""
    var description:String=""
    var price:String=""
    var imageUrl:String=""

    constructor(name:String,description:String,price:String,imageUrl:String){
        this.name=name
        this.description=description
        this.price=price
        this.imageUrl=imageUrl

    }
    constructor()
}
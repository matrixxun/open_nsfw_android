package com.example.open_nsfw_android

import android.graphics.Bitmap
import com.zwy.nsfw.api.NsfwBean

data class MyNsfwBean(var sfw: Float,var nsfw: Float, val path: String,val bitmap:Bitmap) {

}
package com.example.android.models

import android.os.Parcelable

typealias Friends = ArrayList<Friend>

@Parcelize

data class Friend(
    var name: String,
    var lastname: String,
    var image: String,
    var score: Float = 0,0f

) :Parcelable



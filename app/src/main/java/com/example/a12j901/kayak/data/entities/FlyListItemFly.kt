package com.example.a12j901.kayak.data.entities

import java.util.*

class FlyListItemFly (val originDate: Date,
                      val originCity: String,
                      val destinationDate: Date,
                      val destiantionCity: String)

fun getFlyDuration(): Long(
    return destinationDate.time - originDate.time
)

fun getFlyLongerThanDay() : Int(
    return((destinationDate.Time - originDate) /60*60*24).ToInit()
)         
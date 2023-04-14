package com.uz.grid.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val title : Int,
    val availableCourses : Int,
    @DrawableRes val image : Int,
)

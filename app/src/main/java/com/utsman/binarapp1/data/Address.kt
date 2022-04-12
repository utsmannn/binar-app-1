package com.utsman.binarapp1.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Address(
    val city: String,
    val district: String
): Parcelable
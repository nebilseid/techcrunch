package com.techcrunch.model


import com.google.gson.annotations.SerializedName

data class About(
    @SerializedName("href")
    val href: String?
)
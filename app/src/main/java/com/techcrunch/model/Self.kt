package com.techcrunch.model


import com.google.gson.annotations.SerializedName

data class Self(
    @SerializedName("href")
    val href: String?
)
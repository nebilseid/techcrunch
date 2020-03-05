package com.techcrunch.model


import com.google.gson.annotations.SerializedName

data class WpFeaturedmedia(
    @SerializedName("embeddable")
    val embeddable: Boolean?,
    @SerializedName("href")
    val href: String?
)
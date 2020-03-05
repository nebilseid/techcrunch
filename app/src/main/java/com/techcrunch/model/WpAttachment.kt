package com.techcrunch.model


import com.google.gson.annotations.SerializedName

data class WpAttachment(
    @SerializedName("href")
    val href: String?
)
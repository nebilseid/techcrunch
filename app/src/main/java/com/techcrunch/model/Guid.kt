package com.techcrunch.model


import com.google.gson.annotations.SerializedName

data class Guid(
    @SerializedName("rendered")
    val rendered: String?
)
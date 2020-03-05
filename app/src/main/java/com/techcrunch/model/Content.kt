package com.techcrunch.model


import com.google.gson.annotations.SerializedName

data class Content(
    @SerializedName("protected")
    val `protected`: Boolean?,
    @SerializedName("rendered")
    val rendered: String?
)
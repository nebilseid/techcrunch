package com.techcrunch.model


import com.google.gson.annotations.SerializedName

data class RapidData(
    @SerializedName("pct")
    val pct: String?,
    @SerializedName("pt")
    val pt: String?
)
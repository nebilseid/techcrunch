package com.techcrunch.model


import com.google.gson.annotations.SerializedName

data class TcCbMapping(
    @SerializedName("cb_link")
    val cbLink: String?,
    @SerializedName("cb_name")
    val cbName: String?,
    @SerializedName("cb_slug")
    val cbSlug: String?,
    @SerializedName("slug")
    val slug: String?
)
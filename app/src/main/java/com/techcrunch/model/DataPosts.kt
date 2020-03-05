package com.techcrunch.model


import com.google.gson.annotations.SerializedName

data class DataPosts(
    @SerializedName("excerpt")
    val excerpt: Excerpt?,
    @SerializedName("title")
    val title: Title?

)
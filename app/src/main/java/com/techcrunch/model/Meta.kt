package com.techcrunch.model


import com.google.gson.annotations.SerializedName

data class Meta(
    @SerializedName("amp_status")
    val ampStatus: String?,
    @SerializedName("crunchbase_tag")
    val crunchbaseTag: Int?,
    @SerializedName("jetpack_publicize_message")
    val jetpackPublicizeMessage: String?,
    @SerializedName("outcome")
    val outcome: String?,
    @SerializedName("relegenceEntities")
    val relegenceEntities: List<Any?>?,
    @SerializedName("relegenceSubjects")
    val relegenceSubjects: List<Any?>?,
    @SerializedName("status")
    val status: String?
)
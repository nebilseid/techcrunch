package com.techcrunch.model


import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("about")
    val about: List<About?>?,
    @SerializedName("author")
    val author: List<Author?>?,
    @SerializedName("authors")
    val authors: List<AuthorX?>?,
    @SerializedName("collection")
    val collection: List<Collection?>?,
    @SerializedName("curies")
    val curies: List<Cury?>?,
    @SerializedName("https://techcrunch.com/edit")
    val httpsTechcrunchcomedit: List<HttpsTechcrunchcomedit?>?,
    @SerializedName("predecessor-version")
    val predecessorVersion: List<PredecessorVersion?>?,
    @SerializedName("replies")
    val replies: List<Reply?>?,
    @SerializedName("self")
    val self: List<Self?>?,
    @SerializedName("version-history")
    val versionHistory: List<VersionHistory?>?,
    @SerializedName("wp:attachment")
    val wpAttachment: List<WpAttachment?>?,
    @SerializedName("wp:featuredmedia")
    val wpFeaturedmedia: List<WpFeaturedmedia?>?,
    @SerializedName("wp:term")
    val wpTerm: List<WpTerm?>?
)
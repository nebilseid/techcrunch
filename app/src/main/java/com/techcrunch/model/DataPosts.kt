package com.techcrunch.model


import com.google.gson.annotations.SerializedName

data class DataPosts(
    @SerializedName("associatedEvent")
    val associatedEvent: Any?,
    @SerializedName("author")
    val author: Int?,
    @SerializedName("authors")
    val authors: List<Int?>?,
    @SerializedName("categories")
    val categories: List<Int?>?,
    @SerializedName("comment_status")
    val commentStatus: String?,
    @SerializedName("content")
    val content: Content?,
    @SerializedName("crunchbase_tag")
    val crunchbaseTag: List<Any?>?,
    @SerializedName("date")
    val date: String?,
    @SerializedName("date_gmt")
    val dateGmt: String?,
    @SerializedName("event")
    val event: Any?,
    @SerializedName("excerpt")
    val excerpt: Excerpt?,
    @SerializedName("featured")
    val featured: Boolean?,
    @SerializedName("featured_media")
    val featuredMedia: Int?,
    @SerializedName("format")
    val format: String?,
    @SerializedName("fundingRound")
    val fundingRound: Boolean?,
    @SerializedName("guid")
    val guid: Guid?,
    @SerializedName("hideFeaturedImage")
    val hideFeaturedImage: Boolean?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("jetpack_featured_media_url")
    val jetpackFeaturedMediaUrl: String?,
    @SerializedName("jetpack_publicize_connections")
    val jetpackPublicizeConnections: List<Any?>?,
    @SerializedName("link")
    val link: String?,
    @SerializedName("_links")
    val links: Links?,
    @SerializedName("meta")
    val meta: Meta?,
    @SerializedName("modified")
    val modified: String?,
    @SerializedName("modified_gmt")
    val modifiedGmt: String?,
    @SerializedName("ping_status")
    val pingStatus: String?,
    @SerializedName("premiumContent")
    val premiumContent: Boolean?,
    @SerializedName("premiumCutoffPercent")
    val premiumCutoffPercent: Int?,
    @SerializedName("rapidData")
    val rapidData: RapidData?,
    @SerializedName("seoDescription")
    val seoDescription: String?,
    @SerializedName("seoTitle")
    val seoTitle: String?,
    @SerializedName("shortlink")
    val shortlink: String?,
    @SerializedName("slug")
    val slug: String?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("sticky")
    val sticky: Boolean?,
    @SerializedName("subtitle")
    val subtitle: String?,
    @SerializedName("tags")
    val tags: List<Int?>?,
    @SerializedName("tc_cb_mapping")
    val tcCbMapping: List<TcCbMapping?>?,
    @SerializedName("tc_event")
    val tcEvent: List<Any?>?,
    @SerializedName("tc_stories_tax")
    val tcStoriesTax: List<Any?>?,
    @SerializedName("template")
    val template: String?,
    @SerializedName("title")
    val title: Title?,
    @SerializedName("type")
    val type: String?
)
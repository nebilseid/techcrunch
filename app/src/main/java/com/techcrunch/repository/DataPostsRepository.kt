package com.techcrunch.repository

import com.techcrunch.model.DataPosts
import io.reactivex.Single

interface DataPostsRepository {
    fun getPostsFromApi(): Single<List<DataPosts>>
}
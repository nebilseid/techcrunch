package com.techcrunch.network

import com.techcrunch.model.DataPosts
import com.techcrunch.network.Constant.Companion.API_END_POINT
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET(API_END_POINT)
    fun getPosts(): Single<Response<List<DataPosts>>>

}


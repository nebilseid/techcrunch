package com.techcrunch.repository

import com.google.gson.Gson
import com.techcrunch.model.DataPosts
import com.techcrunch.network.ApiService
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


class DataPostRepositoryImpl @Inject constructor(private val apiService: ApiService) :
    DataPostsRepository {
    override fun getPostsFromApi(): Single<List<DataPosts>> {
        return apiService.getPosts().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .flatMap {
                if (it.isSuccessful) {
                    Single.just(it.body())
                }
                else {
                    Single.error<List<DataPosts>>(RuntimeException())
                }
            }
    }
    }

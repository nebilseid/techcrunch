package com.techcrunch.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.techcrunch.model.DataPosts
import com.techcrunch.repository.DataPostsRepository
import io.reactivex.disposables.CompositeDisposable

class PostsViewModel constructor(private val repository: DataPostsRepository) : ViewModel() {

    private val disposable = CompositeDisposable()
    val postViewmodel: MutableLiveData<List<DataPosts>> = MutableLiveData()
    private val error: MutableLiveData<String> = MutableLiveData()

    fun getPosts() {
        disposable.add(
            repository.getPostsFromApi()
                .subscribe({
                    if (it.isEmpty()) {
                        error.value = "No data found"
                    } else {
                        postViewmodel.value = it
                    }
                }, {
                    it.printStackTrace()
                })
        )
    }

    override fun onCleared() {
        disposable.clear()
        super.onCleared()
    }


}
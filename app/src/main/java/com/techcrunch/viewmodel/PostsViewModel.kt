package com.techcrunch.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.techcrunch.model.DataPosts
import com.techcrunch.repository.DataPostsRepository
import io.reactivex.disposables.CompositeDisposable
import java.net.UnknownHostException
import javax.inject.Inject

class PostsViewModel @Inject constructor(private val repository: DataPostsRepository) :
    ViewModel() {

    private val disposable = CompositeDisposable()
    val roadLiveData: MutableLiveData<List<DataPosts>> = MutableLiveData()
    private val error: MutableLiveData<String> = MutableLiveData()

    fun getPosts() {
        disposable.add(
            repository.getPostsFromApi()
                .subscribe({
                    if (it.isEmpty()) {
                        error.value = "No data found"
                    } else {
                        roadLiveData.value = it
                    }
                }, {
                    when (it) {
                        is UnknownHostException -> error.value = "No Network"
                        else -> error.value = it.localizedMessage
                    }
                })
        )
    }

    override fun onCleared() {
        disposable.clear()
        super.onCleared()
    }



}
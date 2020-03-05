package com.techcrunch.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.techcrunch.repository.DataPostsRepository
import javax.inject.Inject

class ViewModelFactory @Inject constructor(private val repository: DataPostsRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return PostsViewModel(repository) as T
    }
}
package com.techcrunch.di

import android.app.Application
import android.content.Context
import com.techcrunch.network.ApiService
import com.techcrunch.repository.DataPostRepositoryImpl
import com.techcrunch.repository.DataPostsRepository
import dagger.Module
import dagger.Provides

@Module(includes = [NetworkModule::class])
class AppModule(val application: Application) {
    @Provides
    @AppScope
    fun provideContext(): Context = application

    @Provides
    @AppScope
    fun provideNetwork(apiService: ApiService) : DataPostsRepository = DataPostRepositoryImpl(apiService)
}
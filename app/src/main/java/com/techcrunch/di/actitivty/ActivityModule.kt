package com.techcrunch.di.actitivty

import com.techcrunch.repository.DataPostsRepository
import com.techcrunch.viewmodel.ViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ActivityModule {
    @Provides
    @ActivityScope
    fun providePostFactory(repository: DataPostsRepository) = ViewModelFactory(repository)
}

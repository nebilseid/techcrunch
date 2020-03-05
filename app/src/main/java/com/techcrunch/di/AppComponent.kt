package com.techcrunch.di

import com.techcrunch.ui.PostsActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(activity: PostsActivity)
}
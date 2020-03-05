package com.techcrunch.di.actitivty

import com.techcrunch.di.AppModule
import com.techcrunch.di.AppScope
import com.techcrunch.ui.PostsActivity
import dagger.Component
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(activity: PostsActivity)
}
package com.techcrunch.di

import com.techcrunch.di.actitivty.ActivityComponent
import com.techcrunch.di.actitivty.ActivityModule
import dagger.Component

@AppScope
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(activity: ActivityModule): ActivityComponent
}
package com.techcrunch

import android.app.Application
import com.techcrunch.di.AppComponent
import com.techcrunch.di.AppModule
import com.techcrunch.di.DaggerAppComponent

class App : Application() {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()

    }
}
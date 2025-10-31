package com.example.myapplication

import android.app.Application
import com.example.myapplication.data.AppContainer
import com.example.myapplication.data.DefaultAppContainer

class MarsPhotosApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}
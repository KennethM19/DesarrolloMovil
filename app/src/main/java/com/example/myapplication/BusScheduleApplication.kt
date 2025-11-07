package com.example.myapplication

import android.app.Application
import com.example.myapplication.data.AppDatabase

class BusScheduleApplication: Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}
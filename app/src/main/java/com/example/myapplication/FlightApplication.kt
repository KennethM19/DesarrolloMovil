package com.example.myapplication

import android.app.Application
import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.preferencesDataStore
import com.example.myapplication.data.AppContainer
import com.example.myapplication.data.AppDataContainer
import com.example.myapplication.data.UserPreferencesRepository
import java.util.prefs.Preferences

private const val LAYOUT_PREFERENCE_NAME = "layout_preferences"
private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(
    name = LAYOUT_PREFERENCE_NAME
)

class FlightApplication : Application() {

    lateinit var container: AppContainer

    lateinit var userPreferencesRepository: UserPreferencesRepository

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
        userPreferencesRepository = UserPreferencesRepository(dataStore)
    }
}
package de.alexaweber.dadjokes

import android.app.Application
import de.alexaweber.dadjokes.data.di.datamodules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(datamodules)
        }
    }
}
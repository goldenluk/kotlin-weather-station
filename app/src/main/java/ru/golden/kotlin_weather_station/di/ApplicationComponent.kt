package ru.golden.kotlin_weather_station.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import ru.golden.kotlin_weather_station.MyApplication
import ru.golden.kotlin_weather_station.network.NetworkModule

@Component(modules = [ApplicationModule::class, NetworkModule::class])
@ApplicationScope
internal interface ApplicationComponent : AndroidInjector<MyApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MyApplication>() {

        @BindsInstance
        abstract fun context(context: Context): Builder
    }

}
package ru.golden.kotlin_weather_station.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import ru.golden.kotlin_weather_station.features.cities.di.CitiesModule
import ru.golden.kotlin_weather_station.features.cities.presentation.ui.CitiesActivity
import ru.golden.kotlin_weather_station.network.NetworkModule

@Module(includes = [
	AndroidSupportInjectionModule::class,
	NetworkModule::class
])
internal interface ApplicationModule {

	@ContributesAndroidInjector(modules = [CitiesModule::class])
	fun citiesActivityInjector(): CitiesActivity


}
package ru.golden.kotlin_weather_station.features.cities.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ru.golden.kotlin_weather_station.di.FragmentScope
import ru.golden.kotlin_weather_station.features.addcity.di.AddCityModule
import ru.golden.kotlin_weather_station.features.cities.presentation.ui.CitiesFragment

@Module
interface CitiesModule {

	@FragmentScope
	@ContributesAndroidInjector(modules = [AddCityModule::class])
	fun citiesFragmentInjector() : CitiesFragment
}
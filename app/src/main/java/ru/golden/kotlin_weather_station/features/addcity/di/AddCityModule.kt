package ru.golden.kotlin_weather_station.features.addcity.di

import dagger.Binds
import dagger.Module
import ru.golden.kotlin_weather_station.di.FragmentScope
import ru.golden.kotlin_weather_station.features.addcity.data.CitiesNetworkRepositoryImpl
import ru.golden.kotlin_weather_station.features.addcity.domain.CitiesNetworkRepository
import ru.golden.kotlin_weather_station.features.addcity.domain.GetCityByNameUseCase
import ru.golden.kotlin_weather_station.features.addcity.domain.GetCityByNameUseCaseImpl

@Module
interface AddCityModule {

	@Binds
	@FragmentScope
	fun bindGetCityByNameUseCase(impl: GetCityByNameUseCaseImpl): GetCityByNameUseCase

	@Binds
	@FragmentScope
	fun bindCitiesNetworkRepository(impl: CitiesNetworkRepositoryImpl): CitiesNetworkRepository
}
package ru.golden.kotlin_weather_station.features.addcity.domain

import io.reactivex.Single
import ru.golden.kotlin_weather_station.db.entities.WeatherEntity
import javax.inject.Inject

interface GetCityByNameUseCase {

	fun execute(name: String) : Single<WeatherEntity>
}

class GetCityByNameUseCaseImpl @Inject constructor(
	private val citiesNetworkRepository: CitiesNetworkRepository
): GetCityByNameUseCase {

	override fun execute(name: String): Single<WeatherEntity> =
		citiesNetworkRepository.getCityByName(name)
			.map { city -> WeatherEntity(city.name) }
}
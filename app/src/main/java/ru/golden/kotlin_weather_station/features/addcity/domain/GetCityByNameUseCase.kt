package ru.golden.kotlin_weather_station.features.addcity.domain

import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import ru.golden.kotlin_weather_station.db.entities.WeatherEntity
import javax.inject.Inject

interface GetCityByNameUseCase {

	fun execute(name: String) : Single<WeatherItem>
}

class GetCityByNameUseCaseImpl @Inject constructor(
	private val citiesNetworkRepository: CitiesNetworkRepository
): GetCityByNameUseCase {

	override fun execute(name: String): Single<WeatherItem> =
		citiesNetworkRepository.getCityByName(name)
			.map { city -> WeatherEntity(city.name, city.main?.temp.toString()) }
			//TODO save to db and make converters
			.map { entity -> WeatherItem(entity.name, entity.temperature) }
			.subscribeOn(Schedulers.io())
}
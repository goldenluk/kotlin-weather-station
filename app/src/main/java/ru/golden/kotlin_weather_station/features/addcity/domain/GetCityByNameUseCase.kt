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
			//TODO make a converter
			//TODO check nullabilities of api answers
			.map { city -> WeatherEntity(city.name, city.main?.temp.toString(), city.main?.pressure.toString()) }
			//TODO save to db
			.map { entity -> WeatherItem(entity.name, entity.temperature) }
			.subscribeOn(Schedulers.io())
}
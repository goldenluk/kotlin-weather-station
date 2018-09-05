package ru.golden.kotlin_weather_station.features.addcity.data

import io.reactivex.Single
import ru.golden.kotlin_weather_station.dto.WeatherDto
import ru.golden.kotlin_weather_station.features.addcity.domain.CitiesNetworkRepository
import ru.golden.kotlin_weather_station.network.APP_ID
import ru.golden.kotlin_weather_station.network.GetWeatherForCityApi
import javax.inject.Inject

class CitiesNetworkRepositoryImpl @Inject constructor(
	private val api: GetWeatherForCityApi
) : CitiesNetworkRepository {

	override fun getCityByName(name: String): Single<WeatherDto> =
		api.getWeatherForCity(name, APP_ID)
}
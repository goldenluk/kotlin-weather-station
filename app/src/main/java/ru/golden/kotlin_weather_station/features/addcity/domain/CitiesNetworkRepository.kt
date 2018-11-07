package ru.golden.kotlin_weather_station.features.addcity.domain

import io.reactivex.Single
import ru.golden.kotlin_weather_station.data.WeatherDto

interface CitiesNetworkRepository {

	fun getCityByName(name: String) : Single<WeatherDto>
}
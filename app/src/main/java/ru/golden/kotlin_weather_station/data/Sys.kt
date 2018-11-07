package ru.golden.kotlin_weather_station.data

import java.io.Serializable

data class Sys(
	val type: Int?,
	val id: Int?,
	val message: Float?,
	val country: String?,
	val sunrise: Int?,
	val sunset: Int?
) : Serializable

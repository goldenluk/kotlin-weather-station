package ru.golden.kotlin_weather_station.data

import com.google.gson.annotations.SerializedName

import java.io.Serializable

data class Main(
	val temp: Float?,
	val pressure: Int?,
	val humidity: Int?,

	@SerializedName("temp_min")
	private val tempMin: Float?,

	@SerializedName("temp_max")
	private val tempMax: Float?
) : Serializable

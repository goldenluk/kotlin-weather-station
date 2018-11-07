package ru.golden.kotlin_weather_station.data

import com.google.gson.annotations.SerializedName

import java.io.Serializable

data class Coord(
	@SerializedName("lon")
	val longitude: Float?,

	@SerializedName("lat")
	val latitude: Float?
) : Serializable

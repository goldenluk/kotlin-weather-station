package ru.golden.kotlin_weather_station.dto

import com.google.gson.annotations.SerializedName

import java.io.Serializable

data class Wind(
	val speed: Float?,

	@SerializedName("deg")
	val degrees: Float?
) : Serializable

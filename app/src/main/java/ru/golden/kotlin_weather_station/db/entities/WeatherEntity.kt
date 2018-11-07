package ru.golden.kotlin_weather_station.db.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull

@Entity(tableName = "weather_table")
data class WeatherEntity (

	@PrimaryKey
	@NonNull
	@ColumnInfo(name = "name")
	val name: String,

	@NonNull
	@ColumnInfo(name = "temperature")
	val temperature: String,

	@NonNull
	@ColumnInfo(name = "pressure")
	val pressure: String
	//TODO add another fields
)
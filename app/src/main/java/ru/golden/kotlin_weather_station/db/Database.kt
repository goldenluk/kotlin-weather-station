package ru.golden.kotlin_weather_station.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import ru.golden.kotlin_weather_station.db.dao.WeatherDao
import ru.golden.kotlin_weather_station.db.entities.WeatherEntity

@Database(entities = [
	WeatherEntity::class
],
	version = 1)
abstract class Database : RoomDatabase() {

	abstract fun getWeatherDao(): WeatherDao
}
package ru.golden.kotlin_weather_station.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import ru.golden.kotlin_weather_station.db.entities.WeatherEntity

@Dao
interface WeatherDao {

	@Insert(onConflict = OnConflictStrategy.REPLACE)
	fun insert(weather: WeatherEntity)

	@Query("SELECT * FROM weather_table")
	fun getAll(): List<WeatherEntity>

	@Query("DELETE FROM weather_table")
	fun clearTable()
}
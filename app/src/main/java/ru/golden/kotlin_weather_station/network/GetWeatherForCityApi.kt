package ru.golden.kotlin_weather_station.network

import kotlinx.coroutines.experimental.Deferred
import retrofit2.http.GET
import retrofit2.http.Query
import ru.golden.kotlin_weather_station.dto.WeatherDto

interface GetWeatherForCityApi {

    @GET("weather?")
    fun weatherForCity (@Query("q") cityName : String, @Query("APPID") appid: String) : Deferred<WeatherDto>
}
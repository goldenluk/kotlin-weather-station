package ru.golden.kotlin_weather_station.network

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query
import ru.golden.kotlin_weather_station.dto.WeatherDto

interface GetWeatherForCityApi {

    @GET("weather?")
    fun getWeatherForCity (@Query("q") cityName : String, @Query("APPID") appid: String) : Single<WeatherDto>
}
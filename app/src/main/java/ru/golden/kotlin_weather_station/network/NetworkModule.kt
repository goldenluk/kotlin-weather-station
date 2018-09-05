package ru.golden.kotlin_weather_station.network

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import ru.golden.kotlin_weather_station.di.ApplicationScope

const val APP_ID = "ad152f53f3a00f1cac75b4634245baae";
const val API = "https://api.openweathermap.org/data/2.5/"

@Module
class NetworkModule {

	@Provides
	@ApplicationScope
	fun provideRetrofit(@ApiEndpoint apiEndpoint: String): Retrofit = RetrofitProviderImpl(apiEndpoint).provide()

	@Provides
	@ApplicationScope
	@ApiEndpoint
	fun provideApiEndpoint(): String = API
}
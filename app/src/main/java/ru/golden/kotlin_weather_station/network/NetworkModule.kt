package ru.golden.kotlin_weather_station.network

import android.content.Context
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import ru.golden.kotlin_weather_station.di.ApplicationScope

@Module
class NetworkModule {

	@Provides
	@ApplicationScope
	fun provideRetrofit(@ApiEndpoint apiEndpoint: String): Retrofit = RetrofitProviderImpl(apiEndpoint).provide()

	@Provides
	@ApplicationScope
	@ApiEndpoint
	fun provideApiEndpoint(context: Context): String = "https://api.openweathermap.org/data/2.5/"
}
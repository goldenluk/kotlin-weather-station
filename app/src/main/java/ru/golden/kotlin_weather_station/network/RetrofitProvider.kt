package ru.golden.kotlin_weather_station.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

interface RetrofitProvider {

	fun provide(): Retrofit
}

internal class RetrofitProviderImpl constructor(
	private val apiEndpoint: String
) : RetrofitProvider {

	private val retrofit: Retrofit by lazy {
		val interceptor = HttpLoggingInterceptor()
		interceptor.level = HttpLoggingInterceptor.Level.BODY

		val httpClient = OkHttpClient.Builder()
			.addInterceptor(interceptor)
			.build()

		Retrofit.Builder()
			.baseUrl(apiEndpoint)
			.addCallAdapterFactory(RxJava2CallAdapterFactory.create())
			.addConverterFactory(GsonConverterFactory.create())
			.client(httpClient)
			.build()
	}

	override fun provide(): Retrofit = retrofit
}
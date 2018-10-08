package ru.golden.kotlin_weather_station.features.cities.presentation.ui

import android.os.Bundle
import ru.golden.kotlin_weather_station.R
import ru.golden.kotlin_weather_station.baseui.BaseActivity
import ru.golden.kotlin_weather_station.baseui.extensions.start

class CitiesActivity : BaseActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_cities)

		showCurrentCities()
	}

	private fun showCurrentCities() {
		supportFragmentManager.start(CitiesFragment(), R.id.fragmentContainer)
	}
}
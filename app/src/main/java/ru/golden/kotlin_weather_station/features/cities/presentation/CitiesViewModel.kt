package ru.golden.kotlin_weather_station.features.cities.presentation

import android.os.Bundle
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import ru.golden.kotlin_weather_station.baseui.BaseViewModel
import ru.golden.kotlin_weather_station.features.addcity.domain.GetCityByNameUseCase
import ru.golden.kotlin_weather_station.features.addcity.domain.WeatherItem
import javax.inject.Inject

class CitiesViewModel @Inject constructor(
	private val getCityByNameUseCase: GetCityByNameUseCase
) : BaseViewModel() {

	private var getCityByNameDisposable: Disposable? = null

	//TODO make useCase for getting from db and use it first, if list is empty -> load Moscow
	override fun onBind(state: Bundle?) {
		getCityByNameDisposable = getCityByNameUseCase.execute("")
			.observeOn(AndroidSchedulers.mainThread())
			.subscribe(this::onSuccessCityLoaded, this::onCityLoadingFailed)
	}

	private fun onSuccessCityLoaded(weatherItem: WeatherItem) {
		//TODO
	}

	private fun onCityLoadingFailed(throwable: Throwable) {
		//TODO
	}

	override fun onUnbind() {
		getCityByNameDisposable?.dispose()
	}
}
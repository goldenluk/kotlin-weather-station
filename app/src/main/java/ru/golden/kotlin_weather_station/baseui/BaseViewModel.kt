package ru.golden.kotlin_weather_station.baseui

import android.os.Bundle

abstract class BaseViewModel {

	val showSnackEvent = SingleLiveEvent<String>()
	val showDialogEvent = SingleLiveEvent<String>()
	val showToastEvent = SingleLiveEvent<String>()

	open fun onBind(state: Bundle? = null) = Unit

	open fun onUnbind() = Unit

	open fun onSaveInstanceState(state: Bundle) = Unit
}
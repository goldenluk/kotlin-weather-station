package ru.golden.kotlin_weather_station.features.cities.presentation.ui

import android.os.Bundle
import ru.golden.kotlin_weather_station.R
import ru.golden.kotlin_weather_station.baseui.BaseFragment
import ru.golden.kotlin_weather_station.databinding.FragmentCitiesBinding
import ru.golden.kotlin_weather_station.features.cities.presentation.CitiesViewModel
import javax.inject.Inject

class CitiesFragment : BaseFragment<FragmentCitiesBinding>() {

	@Inject
	lateinit var viewModel: CitiesViewModel

	override val layoutId: Int = R.layout.fragment_cities

	override fun initBinding(binding: FragmentCitiesBinding) {
		binding.viewModel = viewModel
	}

	override fun initViewModel(state: Bundle?) = viewModel.onBind()

	override fun onDestroy() {
		super.onDestroy()

		viewModel.onUnbind()
	}
}
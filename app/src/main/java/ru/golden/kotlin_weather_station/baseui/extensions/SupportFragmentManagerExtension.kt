package ru.golden.kotlin_weather_station.baseui.extensions

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction

fun FragmentManager.start(
	fragmentArg: Fragment,
	container: Int = android.R.id.content,
	tag: String? = null,
	additionalAction: FragmentTransaction.() -> FragmentTransaction = { this }
) {
	beginTransaction()
		.additionalAction()
		.replace(container, fragmentArg, tag)
		.commit()
}
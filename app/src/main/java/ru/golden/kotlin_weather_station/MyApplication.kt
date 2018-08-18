package ru.golden.kotlin_weather_station

import android.app.Activity
import android.app.Application
import android.support.v4.app.Fragment
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.HasSupportFragmentInjector
import ru.golden.kotlin_weather_station.di.DaggerApplicationComponent
import javax.inject.Inject

internal class MyApplication : Application(), HasSupportFragmentInjector, HasActivityInjector {

	@Inject
	lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

	override fun activityInjector(): AndroidInjector<Activity> = dispatchingActivityInjector

	@Inject
	lateinit var dispatchingFragmentInjector: DispatchingAndroidInjector<Fragment>

	override fun onCreate() {
		super.onCreate()
		initDagger()
	}

	override fun supportFragmentInjector(): AndroidInjector<Fragment> = dispatchingFragmentInjector

	private fun initDagger() {
		DaggerApplicationComponent
			.builder()
			.context(this)
			.create(this)
			.inject(this)
	}
}
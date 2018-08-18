package ru.golden.kotlin_weather_station.baseui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

abstract class BaseActivity : AppCompatActivity(), HasSupportFragmentInjector {

	@Inject
	lateinit var dispatchingFragmentInjector: DispatchingAndroidInjector<Fragment>

	override fun onCreate(savedInstanceState: Bundle?) {
		AndroidInjection.inject(this)
		super.onCreate(savedInstanceState)
	}

	override fun supportFragmentInjector(): AndroidInjector<Fragment> = dispatchingFragmentInjector
}
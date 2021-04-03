package com.mrbattery.stratus.candybar.activities

import com.dm.material.dashboard.candybar.activities.CandyBarSplashActivity
import com.dm.material.dashboard.candybar.activities.configurations.SplashScreenConfiguration
import com.mrbattery.stratus.candybar.R

class SplashActivity : CandyBarSplashActivity() {
    override fun onInit(): SplashScreenConfiguration {
        return SplashScreenConfiguration(MainActivity::class.java)
                .setBottomText(getString(R.string.splash_screen_title))
    }
}
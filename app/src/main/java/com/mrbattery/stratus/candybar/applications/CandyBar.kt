package com.mrbattery.stratus.candybar.applications

import com.dm.material.dashboard.candybar.applications.CandyBarApplication

class CandyBar : CandyBarApplication() {
    override fun onInit(): Configuration {
        //Sample configuration
        val configuration = Configuration()
        configuration.isGenerateAppFilter = true
        configuration.isGenerateAppMap = true
        configuration.isGenerateThemeResources = true
        configuration.isShowTabIconsCount = true
        configuration.isShowTabAllIcons = true
        configuration.wallpaperGridPreviewQuality = 10
        return configuration
    }
}
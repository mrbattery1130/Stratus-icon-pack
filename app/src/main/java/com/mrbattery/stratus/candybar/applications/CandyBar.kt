package com.mrbattery.stratus.candybar.applications;

import android.support.annotation.NonNull;

import com.dm.material.dashboard.candybar.applications.CandyBarApplication;

public class CandyBar extends CandyBarApplication {
    
    @NonNull
    @Override
    public Configuration onInit() {
        //Sample configuration
        Configuration configuration = new Configuration();

        configuration.setGenerateAppFilter(true);
        configuration.setGenerateAppMap(true);
        configuration.setGenerateThemeResources(true);
        configuration.setShowTabIconsCount(true);
        configuration.setShowTabAllIcons(true);
        configuration.setWallpaperGridPreviewQuality(10);
        
        return configuration;
    }
}

package com.mrbattery.stratus.candybar.activities

import com.dm.material.dashboard.candybar.activities.CandyBarMainActivity
import com.dm.material.dashboard.candybar.activities.configurations.ActivityConfiguration
import com.mrbattery.stratus.candybar.licenses.License


class MainActivity : CandyBarMainActivity() {

    override fun onInit(): ActivityConfiguration {
        return ActivityConfiguration()
                .setLicenseCheckerEnabled(License.isLicenseCheckerEnabled())
                .setLicenseKey(License.getLicenseKey())
                .setRandomString(License.getRandomString())
                .setDonationProductsId(License.getDonationProductsId())
                .setPremiumRequestProducts(License.getPremiumRequestProductsId(), License.getPremiumRequestProductsCount())
    }
}
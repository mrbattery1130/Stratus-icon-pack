package com.mrbattery.stratus.candybar.activities

import com.dm.material.dashboard.candybar.activities.CandyBarMuzeiActivity
import com.mrbattery.stratus.candybar.services.MuzeiService

class MuzeiActivity : CandyBarMuzeiActivity() {
    override fun onInit(): Class<*> {
        return MuzeiService::class.java
    }
}
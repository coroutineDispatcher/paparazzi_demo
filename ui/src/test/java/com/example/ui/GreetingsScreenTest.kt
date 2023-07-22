package com.example.ui

import app.cash.paparazzi.DeviceConfig.Companion.PIXEL_5
import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

class GreetingsScreenTest {

    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = PIXEL_5,
        theme = "android:Theme.Material.Light.NoActionBar",
        maxPercentDifference = 0.0
    )

    @Test
    fun `greetings screen should say Hello Android`() {
        paparazzi.snapshot {
            Greeting(name = "Whatever")
        }
    }
}
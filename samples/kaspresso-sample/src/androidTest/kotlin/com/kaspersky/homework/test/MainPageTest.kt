package com.kaspersky.homework.test

import androidx.test.ext.junit.rules.activityScenarioRule
import com.kaspersky.homework.main.MainPageScreen
import com.kaspersky.kaspressample.MainActivity
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import java.lang.Thread.sleep
import org.junit.Rule
import org.junit.Test

class MainPageTest : TestCase() {

    @get:Rule
    val activityRule = activityScenarioRule<MainActivity>()

    @Test
    fun test() = run {
        sleep(1000000)
        MainPageScreen {
            rvMain.childAt<MainPageScreen.MainRecycler>(3) {

            }
        }
    }
}

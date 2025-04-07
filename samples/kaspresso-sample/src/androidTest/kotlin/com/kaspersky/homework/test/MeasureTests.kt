package com.kaspersky.homework.test

import androidx.test.espresso.matcher.ViewMatchers.isChecked
import androidx.test.ext.junit.rules.activityScenarioRule
import com.kaspersky.homework.main.MeasureScreen
import com.kaspersky.kaspressample.measure.MeasureActivity
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import java.lang.Thread.sleep
import org.junit.Rule
import org.junit.Test

class MeasureTests : TestCase() {

    @get:Rule
    val activityRule = activityScenarioRule<MeasureActivity>()

    @Test
    fun testMeasureScreen() = run {
        MeasureScreen {
            sleep(100000000)
            /*Задание:
            1. Нажать на Button 2 один раз
            2. Проверить, что текст под кнопкой изменился на "Button_2 clicks count =1"
            3. Нажать на чекбокс
            4. Проверить, что чекбокс isChecked)
            */
            //ваш код здесь
        }
    }
}

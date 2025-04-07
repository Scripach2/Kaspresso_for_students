package com.kaspersky.homework.test

import androidx.test.ext.junit.rules.activityScenarioRule
import com.kaspersky.homework.main.SimpleActivityScreen
import com.kaspersky.kaspressample.simple.SimpleActivity
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import java.lang.Thread.sleep
import org.junit.Rule
import org.junit.Test

class SimpleTests : TestCase() {

    @get:Rule
    val activityRule = activityScenarioRule<SimpleActivity>()

    @Test
    fun testSimpleActivity() = run {
        SimpleActivityScreen {
            /*Задание:
            1. Нажать на Button 1 один раз
            2. Нажать на Button 2 один раз
            3. Проверить, что в поле ввода текст "Some text"
            */
            //ваш код здесь
            sleep(100000000)
        }
    }
}

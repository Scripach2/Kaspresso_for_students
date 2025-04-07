package com.kaspersky.homework.main

import com.kaspersky.kaspressample.R
import com.kaspersky.kaspressample.measure.MeasureActivity
import com.kaspersky.kaspresso.screens.KScreen

object MeasureScreen : KScreen<MeasureScreen>() {

    override val layoutId: Int = R.layout.activity_main
    override val viewClass: Class<*> = MeasureActivity::class.java

    //ваши локаторы здесь
}

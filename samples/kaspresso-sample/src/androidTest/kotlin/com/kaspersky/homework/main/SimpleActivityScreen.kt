package com.kaspersky.homework.main

import com.kaspersky.kaspressample.R
import com.kaspersky.kaspressample.simple.SimpleActivity
import com.kaspersky.kaspresso.screens.KScreen

object SimpleActivityScreen : KScreen<SimpleActivityScreen>() {

    override val layoutId: Int = R.layout.activity_main
    override val viewClass: Class<*> = SimpleActivity::class.java

    //ваши локаторы здесь
}

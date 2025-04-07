package com.kaspersky.homework.main

import android.view.View
import com.kaspersky.kaspressample.MainActivity
import com.kaspersky.kaspressample.R
import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView
import org.hamcrest.Matcher
import org.hamcrest.Matchers.containsString

object MainPageScreen : KScreen<MainPageScreen>() {

    override val layoutId: Int = R.layout.activity_main
    override val viewClass: Class<*> = MainActivity::class.java

    val rvMain = KRecyclerView ({ withClassName(containsString("RelativeLayout")) },
        itemTypeBuilder = {itemType(::MainRecycler)})

    class MainRecycler(parent: Matcher<View>) : KRecyclerItem<MainRecycler>(parent) {

    }
}

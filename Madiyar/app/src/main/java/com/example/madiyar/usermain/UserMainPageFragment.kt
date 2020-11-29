package com.example.madiyar.usermain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.madiyar.R
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.user_main_bottom_sheet.*

class UserMainPageFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_user_main_page)
        configureTabLayout()
    }
    private fun configureTabLayout() {

        tab_layout.addTab(tab_layout.newTab().setText("Профиль"))
        tab_layout.addTab(tab_layout.newTab().setText("Избранное"))
        tab_layout.addTab(tab_layout.newTab().setText("История заказов"))

        val adapter = TabPagerAdapter(supportFragmentManager,
            tab_layout.tabCount)
        pager.adapter = adapter

        pager.addOnPageChangeListener(
            TabLayout.TabLayoutOnPageChangeListener(tab_layout))
        tab_layout.addOnTabSelectedListener(object :
            TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                pager.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }

        })}
}
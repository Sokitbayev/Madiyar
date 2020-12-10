package com.example.madiyar.usermain

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter

class TabPagerAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {

        return when (position) {
            0 -> ProfileFragment()
            1 -> FavouriteFragment()
            2 -> OrderHistoryFragment()
            else -> ProfileFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "Профиль"
            1 -> "Избранное"
            2 -> "История заказов"
            else -> "Профиль"
        }

    }
}
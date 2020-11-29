package com.example.madiyar.usermain

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabPagerAdapter(fm: FragmentManager, private var tabCount: Int) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {

        when (position) {
            0 -> return ProfileFragment()
            1 -> return FavouriteFragment()
            2 -> return OrderHistoryFragment()
            else -> return ProfileFragment()
        }
    }

    override fun getCount(): Int {
        return tabCount
    }

}
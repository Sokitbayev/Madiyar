package com.example.madiyar.usermain

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.madiyar.R
import com.example.madiyar.databinding.FragmentUserMainPageBinding
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_user_main_page.*

class UserMainPageFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentUserMainPageBinding>(inflater, R.layout.fragment_user_main_page,container,false)
        binding.pager.adapter = TabPagerAdapter(childFragmentManager)
        binding.tabLayout.tabGravity = TabLayout.GRAVITY_FILL
        binding.pager.addOnPageChangeListener(
            TabLayout.TabLayoutOnPageChangeListener(binding.tabLayout))
        binding.tabLayout.addOnTabSelectedListener(object :
            TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                binding.pager.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }

        })

        binding.tabLayout.setupWithViewPager(binding.pager)
        return binding.root
    }

    /*private fun configureTabLayout() {

        tab_layout.addTab(tab_layout.newTab().setText("Профиль"))
        tab_layout.addTab(tab_layout.newTab().setText("Избранное"))
        tab_layout.addTab(tab_layout.newTab().setText("История заказов"))

        val adapter = fragmentManager?.let {
            TabPagerAdapter(
                it,
                tab_layout.tabCount)
        }
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

        })}*/
}
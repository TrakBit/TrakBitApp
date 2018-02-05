package com.trakbit.harshvardhan.trakbit.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class ViewPageAdapter: FragmentPagerAdapter {

    private val fragmentList = mutableListOf<Fragment>()
    private val fragmentTitle = mutableListOf<String>()


    fun addFragment(fragment: Fragment, title: String) {
        fragmentList.add(fragment)
        fragmentTitle.add(title)
    }

    override fun getItem(position: Int): Fragment {
        return fragmentList.get(position)
    }

    override fun getPageTitle(position: Int): String {
        return fragmentTitle.get(position)
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    constructor(manager: FragmentManager): super(manager)

}
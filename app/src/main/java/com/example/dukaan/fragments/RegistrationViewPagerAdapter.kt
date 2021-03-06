package com.example.dukaan.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class RegistrationViewPagerAdapter(fm: FragmentManager, behavior: Int):FragmentStatePagerAdapter(fm, behavior) {

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> {
                return BuyerFragment.newInstance()
            }
            1 ->{
                return SellerFragment.newInstance()
            }
            else ->{
                return BuyerFragment.newInstance()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var tabName = "Purchase on dukaan"
        when(position){
            0 ->  tabName = "Purchase on dukaan"
            1 ->  tabName = "Sell on dukaan"
            else -> tabName
        }
        return tabName
    }
}
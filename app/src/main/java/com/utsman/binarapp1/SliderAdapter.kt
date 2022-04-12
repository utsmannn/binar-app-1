package com.utsman.binarapp1

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

@Suppress("DEPRECATION")
class SliderAdapter(fragmentManager: FragmentManager) :
    FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private var listFragment: List<Fragment> = emptyList()

    fun addFragmentList(fragments: List<Fragment>) {
        listFragment = fragments
    }

    override fun getCount(): Int {
        return listFragment.size
    }

    override fun getItem(position: Int): Fragment {
        return listFragment[position]
    }
}
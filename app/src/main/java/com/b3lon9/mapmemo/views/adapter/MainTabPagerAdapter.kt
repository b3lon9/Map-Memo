package com.b3lon9.mapmemo.views.adapter

import androidx.annotation.NonNull
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.b3lon9.mapmemo.views.fragment.tab.MapFragment
import com.b3lon9.mapmemo.views.fragment.tab.SettingFragment

class MainTabPagerAdapter(@NonNull fragmentManager:FragmentManager, @NonNull lifecycle:Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    private var fragments = mutableListOf<Fragment>()

    init {
        fragments.apply {
            add(MapFragment())
            add(SettingFragment())
        }
    }

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }
}
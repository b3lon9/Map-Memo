package com.b3lon9.mapmemo.views.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.b3lon9.mapmemo.R
import com.b3lon9.mapmemo.databinding.FragmentMainBinding
import com.b3lon9.mapmemo.views.adapter.MainTabPagerAdapter
import com.b3lon9.nlog.NLog

class MainFragment : Fragment() {
    private lateinit var binding:FragmentMainBinding
    private lateinit var adapter:MainTabPagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = MainTabPagerAdapter(parentFragmentManager, lifecycle)
        binding.mainMiddle.adapter = adapter
        binding.mainMiddle.isUserInputEnabled = false
        binding.mainBottom.setOnCheckedChangeListener(checkChangeListener)
    }

    private val checkChangeListener = RadioGroup.OnCheckedChangeListener { group, id ->
        val position = binding.mainBottom.indexOfChild(binding.mainBottom.findViewById(id))

        binding.mainMiddle.currentItem = position
    }
}
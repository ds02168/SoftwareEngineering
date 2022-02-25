package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.databinding.FragmentOrderBinding
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OrderFragment : Fragment(R.layout.fragment_order) {
    private var _binding: FragmentOrderBinding? = null
    private val binding
        get() = _binding!!

    private val title = arrayOf("포장", "매장 식사", "YU 라이브")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentOrderBinding.bind(view)

        setUpViewPager()
    }

    private fun setUpViewPager() {
        binding.pager.apply {
            adapter = object : FragmentStateAdapter(requireActivity()) {
                override fun getItemCount(): Int {
                    return title.size
                }

                override fun createFragment(position: Int): Fragment {
                    return when (position) {
                        0 -> DeliverTakeOutFragment()
                        1 -> BMartFragment()
                        2 -> ShoppingLiveFragment()
                        else -> DeliverTakeOutFragment()
                    }
                }
            }
        }
        TabLayoutMediator(binding.tabLayout, binding.pager){tab, position ->
            tab.text = title[position]
        }.attach()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

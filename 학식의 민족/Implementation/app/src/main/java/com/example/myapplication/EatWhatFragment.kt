package com.example.myapplication.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_eat_what.*

@AndroidEntryPoint
class EatWhatFragment : Fragment(R.layout.fragment_eat_what) {
    private val eatWhatViewModel: EatWhatViewModel by viewModels()
    private lateinit var whatToEatAdapter: WhatToEatAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        eatWhatViewModel.getFakeWhatToEatList()

        whatToEatAdapter = WhatToEatAdapter()
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this.context)
            adapter = whatToEatAdapter
        }

        subscribeObservers()
    }

    private fun subscribeObservers() {
        eatWhatViewModel.eatWhatToEatList.observe(
            viewLifecycleOwner,
            Observer { fakeWhatToEatList ->
                fakeWhatToEatList?.let {
                    whatToEatAdapter.apply {
                        setList(fakeWhatToEatList)
                    }
                }
            })
    }
}
package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.FragmentBMartBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BMartFragment : Fragment(R.layout.fragment_b_mart) {
    private var _binding: FragmentBMartBinding? = null
    private val binding
        get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentBMartBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
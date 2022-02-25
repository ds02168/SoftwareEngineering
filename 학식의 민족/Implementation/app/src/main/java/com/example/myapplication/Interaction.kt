package com.example.myapplication.ui

import android.view.View
import com.example.myapplication.BannerItem

interface Interaction: View.OnClickListener {
    fun onBannerItemClicked(bannerItem: BannerItem)
}

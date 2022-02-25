package com.example.myapplication

import com.example.myapplication.R
import com.example.myapplication.BannerItem
import com.example.myapplication.GridItem
import com.example.myapplication.WhatToEat

val fakeBannerItemList = listOf(
    BannerItem(R.drawable.first),
    BannerItem(R.drawable.second),
    BannerItem(R.drawable.third),
    BannerItem(R.drawable.fourth),
    BannerItem(R.drawable.fifth)
)

val fakeGridItemList = listOf(
    GridItem(R.drawable.a, "자연계 학생 식당"),
    GridItem(R.drawable.b, "학생회관 식당"),
    GridItem(R.drawable.c, "GRANDE"),
    GridItem(R.drawable.d, "자연계 교직원 식당"),
    GridItem(R.drawable.e, "인문계 교직원 식당(선향재)"),
    GridItem(R.drawable.f, "천마아트센터 식당(은하정)"),
    GridItem(R.drawable.s, "인기 랭킹"),
    GridItem(R.drawable.t) //Last Item is Blank
)

// 뭐먹지 리스트용!
val fakeWhatToEatList = listOf(
    WhatToEat("GRANDE에서 치즈가 쭈~욱 늘어나는 피자 어때요?",
        "https://i.ytimg.com/vi/7p6rcKJNAUg/hqdefault.jpg",
        "피자, 양식, 패스트푸드, 지방"),
    WhatToEat("너? 햄최몇??",
        "https://images2.minutemediacdn.com/image/upload/c_crop,h_1126,w_2000,x_0,y_181/f_auto,q_auto,w_1100/v1554932288/shape/mentalfloss/12531-istock-637790866.jpg",
        "햄버거, 패티, 치즈, 패티, 수제버거"),
    WhatToEat("스테이크, 미디움 레어로 먹자!",
        "https://i2.wp.com/www.foodrepublic.com/wp-content/uploads/2012/05/testkitchen_argentinesteak.jpg?resize=1280%2C%20560&ssl=1",
        "스테이크, 미디움, 레어, 고기, 마늘, 소고기, 웰던"),
    WhatToEat("못 정할땐 은하정에서 다양하게 골라 먹는 뷔페 어떄요!?",
        "https://i0.wp.com/post.healthline.com/wp-content/uploads/2019/05/Various_Sandwiches_1296x728-header-1296x728.jpg?w=1155&h=1528",
        "다양성, 음식묵자, 푸드, 뭐먹지"),
    WhatToEat("오늘만큼은 환경 생각하여 야채를 먹는 베지터블~",
        "https://images.unsplash.com/photo-1498837167922-ddd27525d352?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2850&q=80",
        "베지터블, 야채야채, 먹어보자, 채소")
)
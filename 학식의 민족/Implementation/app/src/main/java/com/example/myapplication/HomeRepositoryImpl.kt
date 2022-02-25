package com.example.myapplication

class HomeRepositoryImpl : HomeRepository {
    override suspend fun getBannerItems(): List<BannerItem> {
        return fakeBannerItemList
    }

    override suspend fun getGridItems(): List<GridItem> {
        return fakeGridItemList
    }

}
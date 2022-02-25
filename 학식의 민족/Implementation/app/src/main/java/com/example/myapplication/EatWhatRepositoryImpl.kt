package com.example.myapplication

class EatWhatRepositoryImpl : EatWhatRepository {
    override suspend fun getWhatToEatItems(): List<WhatToEat> {
        return fakeWhatToEatList
    }
}
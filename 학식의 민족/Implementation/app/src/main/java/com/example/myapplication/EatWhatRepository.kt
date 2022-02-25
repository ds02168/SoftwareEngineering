package com.example.myapplication

interface EatWhatRepository {
    suspend fun getWhatToEatItems(): List<WhatToEat>
}
package com.myprojects.newsappdemo.model

data class ApiResponse(
    val news: List<New>,
    val newsCount: Int,
    val status: Boolean
)
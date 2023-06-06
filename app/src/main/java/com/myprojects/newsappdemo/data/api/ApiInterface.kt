package com.myprojects.newsappdemo.data.api

import com.myprojects.newsappdemo.model.ApiResponse
import retrofit2.http.GET

interface ApiInterface {

    @GET("/news_response.php")
    suspend fun getNews() : ApiResponse
}
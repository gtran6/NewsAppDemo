package com.myprojects.newsappdemo.data.repo

import com.myprojects.newsappdemo.data.api.ApiInterface
import com.myprojects.newsappdemo.model.ApiResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class NewsRepo @Inject constructor(val apiInterface: ApiInterface) {

    fun getAllNewsFromServer() : Flow<ApiResponse> = flow {
        emit(apiInterface.getNews())
    }
}
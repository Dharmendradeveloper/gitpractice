package com.dharmendra.gitpractice.network

import com.dharmendra.gitpractice.model.Post
import retrofit2.http.GET

interface PostApiService {
    @GET("posts")
    suspend fun getPost():List<Post>
}
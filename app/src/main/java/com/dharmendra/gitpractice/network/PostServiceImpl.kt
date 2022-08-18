package com.dharmendra.gitpractice.network

import com.dharmendra.gitpractice.model.Post
import javax.inject.Inject

class PostServiceImpl @Inject constructor(private val postApiService: PostApiService) {
    suspend fun getPost():List<Post> = postApiService.getPost()
}
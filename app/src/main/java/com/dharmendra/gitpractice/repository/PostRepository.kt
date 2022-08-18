package com.dharmendra.gitpractice.repository

import com.dharmendra.gitpractice.model.Post
import com.dharmendra.gitpractice.network.PostServiceImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class PostRepository @Inject constructor(private val postApiServiceImpl: PostServiceImpl) {
    fun getPost():Flow<List<Post>> = flow{
        val response = postApiServiceImpl.getPost()
        emit(response)
    }.flowOn(Dispatchers.IO)
}
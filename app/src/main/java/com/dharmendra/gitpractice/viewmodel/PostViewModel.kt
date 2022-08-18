package com.dharmendra.gitpractice.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.dharmendra.gitpractice.model.Post
import com.dharmendra.gitpractice.repository.PostRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import javax.inject.Inject

@HiltViewModel
class PostViewModel @Inject constructor(private val repository: PostRepository):ViewModel() {
    val response: LiveData<List<Post>> = repository.getPost()
        .catch { e->
            Log.d("main", "${e.message} ")

    }.asLiveData()
}
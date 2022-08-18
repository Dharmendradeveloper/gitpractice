package com.dharmendra.gitpractice

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

import com.dharmendra.gitpractice.viewmodel.PostViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    /*
    * Field injection
     */
    @Inject
    lateinit var car: Car
//    @Inject
//     lateinit var main:Main

     @Inject
     lateinit var qualifiers:QualifiersAnotation

     lateinit var postViewModel: PostViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        car.getCar()
//        main.getName()
        qualifiers.getName()
        postViewModel = ViewModelProvider(this).get(PostViewModel::class.java)
        postViewModel.response.observe(this, Observer {response->

            Log.d("mainActivity", "onCreate: ${response[0].body}")
        })
    }
}
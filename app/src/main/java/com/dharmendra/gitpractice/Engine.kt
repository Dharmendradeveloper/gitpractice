package com.dharmendra.gitpractice

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor() {

    fun engineStarted(){
        Log.d("MainActivity", "engineStarted: ")
    }
}
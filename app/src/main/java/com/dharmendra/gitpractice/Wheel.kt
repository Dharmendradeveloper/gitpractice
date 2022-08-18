package com.dharmendra.gitpractice

import android.util.Log
import javax.inject.Inject

class Wheel @Inject constructor() {
    
    fun wheelStarted(){
        Log.d("MainActivity", "wheelStarted: ")
    }
}
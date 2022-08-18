package com.dharmendra.gitpractice

import android.util.Log
import javax.inject.Inject


class Car @Inject constructor(private val engine: Engine,private val wheel: Wheel){

    fun getCar() {
        engine.engineStarted()
        wheel.wheelStarted()
        Log.d("MainActivity", "getCar: ")
    }


}
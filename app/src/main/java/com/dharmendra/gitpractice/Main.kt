package com.dharmendra.gitpractice

import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

interface One {
    fun getName()
}

class ImplementOne @Inject constructor(private val name:String):One{
    override fun getName() {
        Log.d("main", "getName:Dharmendra")
    }
}

/*
*@constructor Injection
* */
class Main @Inject constructor(private val one:One){
    fun getName(){
        one.getName()
    }
}

//@Module
//@InstallIn(SingletonComponent::class)
//abstract class AppModule{
//    @Binds
//    @Singleton
//    abstract fun binding(implementOne: ImplementOne):One
//}

//@Module
//@InstallIn(SingletonComponent::class)
// class AppModule{
//    @Provides
//    @Singleton
//    fun getName():String = "Ram Krishna"
//    @Provides
//    @Singleton
//     fun binding(name:String):One = ImplementOne(name)
//}
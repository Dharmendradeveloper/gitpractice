package com.dharmendra.gitpractice

import android.util.Log
import androidx.core.app.ActivityCompat
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject
import javax.inject.Qualifier

class QualifiersAnotation @Inject constructor(@FName private val fName:String,
                                             @LName private val lName:String){
    fun getName(){
        Log.d("QualifiersAno", "getName: $fName  $lName")
    }
}

@Module
@InstallIn(ActivityComponent::class)
class ModuleApp{
    @Provides
    @FName
    fun getFName():String = "Radhe"

    @Provides
    @LName
    fun getLName():String = "Shyam"
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FName

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class LName

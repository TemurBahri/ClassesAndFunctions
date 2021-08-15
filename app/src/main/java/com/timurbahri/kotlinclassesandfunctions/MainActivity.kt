package com.timurbahri.kotlinclassesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test()
        test2()
    }

    fun  test(){
        println("test functions")

    }

    fun  test2(){
        println("test functions")

    }




}
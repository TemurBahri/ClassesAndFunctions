package com.timurbahri.kotlinclassesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test()
        mySum(5,5)
        myMultiply(50,40)

        val hommer = Simpson("Homer Simpson",50,"Nuclear")
        hommer.hairColor = "Yellow"


        //hommer.age = 60
        //hommer.job = "Nuc"
        //hommer.name ="Hommer"
        println(hommer.hairColor)
    }

    fun  test(){
        println("test functions")
    }


    //Input & Return
    fun mySum(a:Int,b:Int){
        println(a+b)
    }

    fun myMultiply(x:Int,y:Int) : Int {
        return x * y

    }

    fun helloKotlin(view : View){
        println("hello Kotlin")
    }



}
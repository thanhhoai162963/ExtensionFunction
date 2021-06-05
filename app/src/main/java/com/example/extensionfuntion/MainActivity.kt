package com.example.extensionfuntion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val student = Student("thanh",26)
        student.checkClassification()

        val number:Int? = null
        number?.last()

        val a:Double? = null
        a?.demo()
    }
    fun Int.last():Int{
        return this + 2
    }
    fun Student.checkClassification(): Boolean {
        if (this.name == "thanh"){
            return true
        }else if(this.name == "hoai"){
            return false
        }else
            return false
    }

    fun Student.demo():String{
        if (this.name == "thanh" ){
            return "dung roi"
        }else
            return "sai"
    }
    fun Double.demo(){
        this + 3F
    }
}
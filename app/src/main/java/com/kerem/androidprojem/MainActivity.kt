package com.kerem.androidprojem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var a = false


    fun hello(view : View)
    {
        if(a == false) {
            textView.text = "Hello World!"
            a = true
        }

        else{
            textView.text = ""
            a = false
        }
    }
}
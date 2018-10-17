package com.example.redcarpet.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.redcarpet.myapplication.R.id.number1
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.nio.file.attribute.AttributeView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }



    fun sum(view: View) {
        val a = number1.text.toString().toInt()

        val b = number2.text.toString().toInt()

        val result = a + b

        textView.text = "Result : $result"
    }

    fun sub(view: View) {
        val a = number1.text.toString().toInt()

        val b = number2.text.toString().toInt()

        val result = a - b

        textView.text = "Result : $result"
    }

    fun multiply(view: View) {
        val a = number1.text.toString().toInt()

        val b = number2.text.toString().toInt()

        val result = a * b

        textView.text = "Result : $result"
    }

    fun div(view: View) {
        val a = number1.text.toString().toInt()

        val b = number2.text.toString().toInt()

        val result = a / b

        textView.text = "Result : $result"
    }

}
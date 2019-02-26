package com.usbank.myapplication

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview.setText("08/23/99".getDateAsText().replace(",",", "))

    }
}

@SuppressLint("SimpleDateFormat")
fun String.getDateAsText() : String {
    return java.text.SimpleDateFormat("MMMM dd,yyyy")
        .format(java.text.SimpleDateFormat("MM/dd/yy").parse(this.replace("\\", ""))).toUpperCase()
}

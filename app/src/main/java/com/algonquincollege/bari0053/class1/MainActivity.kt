package com.algonquincollege.bari0053.class1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val aNumber = 10;

        if (aNumber < 20) {
            Log.i("Output", "The number smaller than 20")
        } else {
            Log.i("Output", "The number bigger than 20")
        }

        val aList = arrayOf("First","Second","Third")
        aList[1];

        for(index in 0 ..(aList.size -1)) {
            Log.i("Index", ""+"Index")
        }
    }
}
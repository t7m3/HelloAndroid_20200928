package com.example.helloandroid_20200928

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tapHere.setOnClickListener {
            textView.text = "ボタンがタップされました。"
        }

        imageView.setOnClickListener {
            textView.text = "ちわ！あんどろいど"
        }
    }
}
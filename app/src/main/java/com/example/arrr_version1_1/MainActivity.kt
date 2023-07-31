package com.example.arrr_version1_1

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myButton = findViewById<Button>(R.id.myButton)
        myButton.setOnClickListener { // 버튼이 클릭되었을 때 수행할 동작을 여기에 작성합니다.
            // 예시: 버튼이 클릭되면 텍스트를 변경합니다.
            myButton.text = "Button Clicked"
        }
    }
}
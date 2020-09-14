package com.example.codingchallenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        button1.setOnClickListener{
            val intent = Intent();
            intent.putExtra("itemName", "Cheese")
            setResult(RESULT_OK, intent);
            finish();
        }
        button2.setOnClickListener{
            val intent = Intent();
            intent.putExtra("itemName", "Rice")
            setResult(RESULT_OK, intent);
            finish();
        }
        button3.setOnClickListener{
            val intent = Intent();
            intent.putExtra("itemName", "Apple")
            setResult(RESULT_OK, intent);
            finish();
        }
    }
}
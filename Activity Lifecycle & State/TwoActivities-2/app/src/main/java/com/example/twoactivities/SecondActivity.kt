package com.example.twoactivities

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {
    private val LOG_TAG = SecondActivity::class.java.simpleName
    companion object {
        val EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY";
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val intent = intent
        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
        text_message.setText(message);
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "onResume")
    }

    fun returnReply(view: View) {
        val reply = editText_second.text.toString();
        val replyIntent = Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(Activity.RESULT_OK, replyIntent);
        Log.d(LOG_TAG, "End SecondActivity");
        finish();
    }
}
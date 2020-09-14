package com.example.twoactivities

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {
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

    fun returnReply(view: View) {
        val reply = editText_second.text.toString();
        val replyIntent = Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(Activity.RESULT_OK, replyIntent);
        finish();
    }
}
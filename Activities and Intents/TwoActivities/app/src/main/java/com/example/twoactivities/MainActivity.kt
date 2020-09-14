package com.example.twoactivities

import android.R.attr
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private val LOG_TAG = MainActivity::class.java.simpleName;
    companion object {
        val EXTRA_MESSAGE = "com.example.twoactivities.extra.MESSAGE";
        val TEXT_REQUEST = 1;
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
    }
    override fun onActivityResult(
        requestCode: Int,
        resultCode: Int, data: Intent?
    ) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                val reply = data?.extras?.get(SecondActivity.EXTRA_REPLY).toString();
                text_header_reply.visibility =  View.VISIBLE;
                text_message_reply.setText(reply);
                text_message_reply.visibility = View.VISIBLE;

            }
        }
    }

    fun launchSecondActivity(view: View) {
        Log.d(LOG_TAG, "Button clicked!");
        val intent = Intent(this, SecondActivity::class.java);
        val message = editText_main.text.toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(intent, TEXT_REQUEST);
    }
}
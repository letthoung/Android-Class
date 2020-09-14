package com.example.codingchallenge

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    companion object {
        val EXTRA_MESSAGE = "com.example.codingchallenge.extra.MESSAGE";
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendTextToDisplayInSecondActivity(text: String){
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(EXTRA_MESSAGE, text);
        startActivity(intent);
    }
    fun launchSecondActivityFromButon1(view: View) {
        val textToDisplay = getString(R.string.passage1)
        sendTextToDisplayInSecondActivity(textToDisplay)
    }
    fun launchSecondActivityFromButon2(view: View) {
        val textToDisplay = getString(R.string.passage2)
        sendTextToDisplayInSecondActivity(textToDisplay)
    }
    fun launchSecondActivityFromButon3(view: View) {
        val textToDisplay = getString(R.string.passage3)
        sendTextToDisplayInSecondActivity(textToDisplay)
    }
}
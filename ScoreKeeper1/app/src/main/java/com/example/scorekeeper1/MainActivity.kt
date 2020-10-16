package com.example.scorekeeper1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val STATE_SCORE_1: String = "Team 1 Score";
    private val STATE_SCORE_2: String = "Team 2 Score";
    private var score1: Int = 0
    private var score2: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState != null){
            score1 = savedInstanceState.getInt(STATE_SCORE_1);
            score2 = savedInstanceState.getInt(STATE_SCORE_2);

            score_1.text = score1.toString();
            score_2.text = score2.toString();
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu);
        var nightMode = AppCompatDelegate.getDefaultNightMode();
        if (nightMode == AppCompatDelegate.MODE_NIGHT_YES){
            menu?.findItem(R.id.night_mode)?.setTitle(R.string.night_mode)
        } else {
            menu?.findItem(R.id.night_mode)?.setTitle(R.string.day_mode)
        }
        return true;
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(STATE_SCORE_1, score1);
        outState.putInt(STATE_SCORE_2, score2)
        super.onSaveInstanceState(outState)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.night_mode){
            var nightMode = AppCompatDelegate.getDefaultNightMode();
            if (nightMode == AppCompatDelegate.MODE_NIGHT_YES){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }
            recreate();
        }
        return true;
    }

    fun decreaseScore(view: View) {
        val viewId = view.id;
        when (viewId) {
            R.id.decreaseTeam1 -> {
                --score1;
                score_1.text = score1.toString();
            }

            R.id.decreaseTeam2 -> {
                --score2;
                score_2.text = score2.toString();
            }
        }
    }
    fun increaseScore(view: View) {

        val viewId = view.id;
        when (viewId) {
            R.id.increaseTeam1 -> {
                ++score1;
                score_1.text = score1.toString();
            }

            R.id.increaseTeam2 -> {
                ++score2;
                score_2.text = score2.toString();
            }
        }
    }
}
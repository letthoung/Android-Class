package com.example.codingchallenge

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    companion object {
        val ADD_REQUEST = 1;
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState != null) {
            item0.setText(savedInstanceState.getString("item0"))
            item1.setText(savedInstanceState.getString("item1"))
            item2.setText(savedInstanceState.getString("item2"))
            item3.setText(savedInstanceState.getString("item3"))
            item4.setText(savedInstanceState.getString("item4"))
            item5.setText(savedInstanceState.getString("item5"))
            item6.setText(savedInstanceState.getString("item6"))
            item7.setText(savedInstanceState.getString("item7"))
            item8.setText(savedInstanceState.getString("item8"))
            item9.setText(savedInstanceState.getString("item9"))
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == ADD_REQUEST){
            if(resultCode == Activity.RESULT_OK){
                val itemName = data?.getStringExtra("itemName").toString()
                when ("") {
                    item0.text -> item0.setText(itemName)
                    item1.text -> item1.setText(itemName)
                    item2.text -> item2.setText(itemName)
                    item3.text -> item3.setText(itemName)
                    item4.text -> item4.setText(itemName)
                    item5.text -> item5.setText(itemName)
                    item6.text -> item6.setText(itemName)
                    item7.text -> item7.setText(itemName)
                    item8.text -> item8.setText(itemName)
                    item9.text -> item9.setText(itemName)
                }
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState);
        outState.putString("item0", item0.text.toString());
        outState.putString("item1", item1.text.toString());
        outState.putString("item2", item2.text.toString());
        outState.putString("item3", item3.text.toString());
        outState.putString("item4", item4.text.toString());
        outState.putString("item5", item5.text.toString());
        outState.putString("item6", item6.text.toString());
        outState.putString("item7", item7.text.toString());
        outState.putString("item8", item8.text.toString());
        outState.putString("item9", item9.text.toString());
    }

    fun addItem(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivityForResult(intent, ADD_REQUEST);
    }
}
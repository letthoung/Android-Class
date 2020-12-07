package com.example.krogerrecipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var mRecyclerView: RecyclerView
    private lateinit var gridLayoutManager: GridLayoutManager
    private lateinit var adapter: RecipeAdapter

    private lateinit var mRecipeList: ArrayList<RecipeData>
    private lateinit var mRecipeData: RecipeData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRecyclerView = allRecipesRecyclerView
        gridLayoutManager = GridLayoutManager(this, 1)
        mRecyclerView.layoutManager = gridLayoutManager;

        mRecipeList = ArrayList();
        mRecipeList.add(RecipeData("First", "This is the first recipe", "$4", R.drawable.recipe1))
        mRecipeList.add(RecipeData("Second", "This is the second recipe", "$4", R.drawable.recipe1))
        mRecipeList.add(RecipeData("Third", "This is the third recipe", "$4", R.drawable.recipe1))

        adapter = RecipeAdapter(this, mRecipeList)
        mRecyclerView.setAdapter(adapter);
    }
}
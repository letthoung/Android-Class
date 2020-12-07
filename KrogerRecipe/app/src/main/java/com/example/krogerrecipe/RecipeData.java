package com.example.krogerrecipe;

public class RecipeData {
    private String recipeName;
    private String recipeDescription;
    private String recipePrice;
    private int recipeImage;

    public RecipeData(String recipeName, String recipeDescription, String recipePrice, int recipeImage) {
        this.recipeName = recipeName;
        this.recipeDescription = recipeDescription;
        this.recipePrice = recipePrice;
        this.recipeImage = recipeImage;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public String getRecipeDescription() {
        return recipeDescription;
    }

    public String getRecipePrice() {
        return recipePrice;
    }

    public int getRecipeImage() {
        return recipeImage;
    }
}

package com.udacity.sandwichclub.model;

import java.util.List;

public class Sandwich {

    private String mainName;
    private List<String> alsoKnownAs = null;
    private String placeOfOrigin;
    private String description;
    private String image;
    private List<String> ingredients = null;

    /**
     * No args constructor for use in serialization
     */
    public Sandwich() {
    }

    public Sandwich(String mainName, List<String> alsoKnownAs, String placeOfOrigin, String description, String image, List<String> ingredients) {
        this.mainName = mainName;
        this.alsoKnownAs = alsoKnownAs;
        this.placeOfOrigin = placeOfOrigin;
        this.description = description;
        this.image = image;
        this.ingredients = ingredients;
    }

    public String getMainName() {
        return mainName.length() > 0 ? mainName : "Unavailable right now.";
    }

    public void setMainName(String mainName) {
        this.mainName = mainName;
    }

    public List<String> getAlsoKnownAs() {
        return alsoKnownAs;
    }

    public String getAlsoKnownAsString() {
        return alsoKnownAs.size() > 0 ? alsoKnownAs.toString() : "Unavailable right now.";
    }

    public void setAlsoKnownAs(List<String> alsoKnownAs) {
        this.alsoKnownAs = alsoKnownAs;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin.length() > 0 ? placeOfOrigin : "Unavailable right now.";
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public String getDescription() {
        return description.length() > 0 ? description : "Unavailable right now.";
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getIngredientsString() {
        return ingredients.size() > 0 ? ingredients.toString() : "Unavailable right now.";
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        StringBuilder sB = new StringBuilder();
        sB.append("mainName: ").append(getMainName()).append("\n");
        sB.append("alsoKnownAs: ").append(getAlsoKnownAs().toString()).append("\n");
        sB.append("placeOfOrigin: ").append(getPlaceOfOrigin()).append("\n");
        sB.append("description: ").append(getDescription()).append("\n");
        sB.append("image: ").append(getImage()).append("\n");
        sB.append("ingredients: ").append(getIngredients().toString());
        return sB.toString();
    }
}

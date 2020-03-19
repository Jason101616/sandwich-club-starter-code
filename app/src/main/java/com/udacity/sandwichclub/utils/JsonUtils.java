package com.udacity.sandwichclub.utils;

import com.udacity.sandwichclub.model.Sandwich;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonUtils {

    public static Sandwich parseSandwichJson(String json) throws JSONException {
        // TODO(mengge): write your own Json parser
        final String NAME = "name";
        final String MAIN_NAME = "mainName";
        final String ALSO_KNOWN_AS = "alsoKnownAs";
        final String PLACE_OF_ORIGIN = "placeOfOrigin";
        final String DESCRIPTION = "description";
        final String IMAGE = "image";
        final String INGREDIENTS = "ingredients";

        JSONObject sandwichJson = new JSONObject(json);
        Sandwich currentSandwich = new Sandwich();
        String mainName = sandwichJson.getJSONObject(NAME).getString(MAIN_NAME);
        List<String> alsoKnownAs = new ArrayList<>();
        JSONArray alsoKnownAsJSONArray = sandwichJson.getJSONObject(NAME).getJSONArray(ALSO_KNOWN_AS);
        for (int i = 0; i < alsoKnownAsJSONArray.length(); i++) {
            alsoKnownAs.add(alsoKnownAsJSONArray.getString(i));
        }
        String placeOfOrigin = sandwichJson.getString(PLACE_OF_ORIGIN);
        String description = sandwichJson.getString(DESCRIPTION);
        String image = sandwichJson.getString(IMAGE);
        List<String> ingredients = new ArrayList<>();
        JSONArray ingredientsJSONArray = sandwichJson.getJSONArray(INGREDIENTS);
        for (int i = 0; i < ingredientsJSONArray.length(); i++) {
            ingredients.add(ingredientsJSONArray.getString(i));
        }
        return new Sandwich(mainName, alsoKnownAs, placeOfOrigin, description, image, ingredients);
    }
}

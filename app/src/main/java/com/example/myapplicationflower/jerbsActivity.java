package com.example.myapplicationflower;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplicationflower.ui.ShoppingCart;
import com.example.myapplicationflower.ui.cartitem;

public class jerbsActivity extends AppCompatActivity {

    LinearLayout snow;
    LinearLayout bride;
    LinearLayout queen;
    LinearLayout story;
    LinearLayout lux;
    LinearLayout para;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jerbs);

        SearchView searchView = findViewById(R.id.searchView);
        snow = findViewById(R.id.snow);
        bride= findViewById(R.id.bride);
       queen= findViewById(R.id.queen);
        story= findViewById(R.id.story);
       lux= findViewById(R.id.lux);
       para= findViewById(R.id.para);
        // Set up the OnQueryTextListener for the SearchView
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // Handle the search query submission
                performSearch(query);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // Handle changes in the search query text
                // You can update the UI or perform incremental search here
                return true;
            }
        });
    }
    public void gotocart(View view) {
        Intent i = new Intent(this , CartActivity.class);
        startActivity(i);
    }

    public void addToCartButtonClicksnow(View view) {
        // Get the details of the selected item
        String itemName = ((TextView) view.getRootView().findViewById(R.id.snowname)).getText().toString();
        String itemPriceString = ((TextView) view.getRootView().findViewById(R.id.snowprice)).getText().toString();
        double itemPrice = Double.parseDouble(itemPriceString.replace(" EGP", ""));

        // Create a CartItem object
        cartitem cartItem = new cartitem(itemName, itemPrice);

        // Add the item to the cart (you may want to use a list or another data structure)
        ShoppingCart.addToCart(cartItem);

        // Optionally, you can show a message to the user indicating the item has been added to the cart
        Toast.makeText(this, "Added to Cart: " + itemName, Toast.LENGTH_SHORT).show();
    }

    public void addToCartButtonClickbride(View view) {
        // Get the details of the selected item
        String itemName = ((TextView) view.getRootView().findViewById(R.id.bridename)).getText().toString();
        String itemPriceString = ((TextView) view.getRootView().findViewById(R.id.brideprice)).getText().toString();
        double itemPrice = Double.parseDouble(itemPriceString.replace(" EGP", ""));

        // Create a CartItem object
        cartitem cartItem = new cartitem(itemName, itemPrice);

        // Add the item to the cart (you may want to use a list or another data structure)
        ShoppingCart.addToCart(cartItem);

        // Optionally, you can show a message to the user indicating the item has been added to the cart
        Toast.makeText(this, "Added to Cart: " + itemName, Toast.LENGTH_SHORT).show();
    }

    public void addToCartButtonClickqueen(View view) {
        // Get the details of the selected item
        String itemName = ((TextView) view.getRootView().findViewById(R.id.queenname)).getText().toString();
        String itemPriceString = ((TextView) view.getRootView().findViewById(R.id.queenprice)).getText().toString();
        double itemPrice = Double.parseDouble(itemPriceString.replace(" EGP", ""));

        // Create a CartItem object
        cartitem cartItem = new cartitem(itemName, itemPrice);

        // Add the item to the cart (you may want to use a list or another data structure)
        ShoppingCart.addToCart(cartItem);

        // Optionally, you can show a message to the user indicating the item has been added to the cart
        Toast.makeText(this, "Added to Cart: " + itemName, Toast.LENGTH_SHORT).show();
    }

    public void addToCartButtonClickstory(View view) {
        // Get the details of the selected item
        String itemName = ((TextView) view.getRootView().findViewById(R.id.storyname)).getText().toString();
        String itemPriceString = ((TextView) view.getRootView().findViewById(R.id.storyprice)).getText().toString();
        double itemPrice = Double.parseDouble(itemPriceString.replace(" EGP", ""));

        // Create a CartItem object
        cartitem cartItem = new cartitem(itemName, itemPrice);

        // Add the item to the cart (you may want to use a list or another data structure)
        ShoppingCart.addToCart(cartItem);

        // Optionally, you can show a message to the user indicating the item has been added to the cart
        Toast.makeText(this, "Added to Cart: " + itemName, Toast.LENGTH_SHORT).show();
    }

    public void addToCartButtonClicklux(View view) {
        // Get the details of the selected item
        String itemName = ((TextView) view.getRootView().findViewById(R.id.luxname)).getText().toString();
        String itemPriceString = ((TextView) view.getRootView().findViewById(R.id.luxprice)).getText().toString();
        double itemPrice = Double.parseDouble(itemPriceString.replace(" EGP", ""));

        // Create a CartItem object
        cartitem cartItem = new cartitem(itemName, itemPrice);

        // Add the item to the cart (you may want to use a list or another data structure)
        ShoppingCart.addToCart(cartItem);

        // Optionally, you can show a message to the user indicating the item has been added to the cart
        Toast.makeText(this, "Added to Cart: " + itemName, Toast.LENGTH_SHORT).show();
    }

    public void addToCartButtonClickpara(View view) {
        // Get the details of the selected item
        String itemName = ((TextView) view.getRootView().findViewById(R.id.paraname)).getText().toString();
        String itemPriceString = ((TextView) view.getRootView().findViewById(R.id.paraprice)).getText().toString();
        double itemPrice = Double.parseDouble(itemPriceString.replace(" EGP", ""));

        // Create a CartItem object
        cartitem cartItem = new cartitem(itemName, itemPrice);

        // Add the item to the cart (you may want to use a list or another data structure)
        ShoppingCart.addToCart(cartItem);

        // Optionally, you can show a message to the user indicating the item has been added to the cart
        Toast.makeText(this, "Added to Cart: " + itemName, Toast.LENGTH_SHORT).show();
    }

    private LinearLayout getFlowerLinearLayout(String flowerName) {
        // Implement a method to map flower names to corresponding LinearLayout references
        // You can use a switch statement or a HashMap for this mapping
        // Return null if the flower name is not found
        switch (flowerName.toLowerCase()) {
            case "snow white":
                return snow;
            // Add more cases for other flower names if needed
            case "bride time":
                return bride;
            case "queen":
                return queen;
            case "wedding story":
                return story;
            case "luxury bridal":
                return lux;
            case "paradise":
                return para;
            default:
                return null;
        }
    }

    private void performSearch(String query) {
        // Implement your search logic here
        // You can update the UI or launch a search activity, etc.

        // Get the LinearLayout reference based on the flower name
        LinearLayout flowerLinearLayout = getFlowerLinearLayout(query);

        if (flowerLinearLayout == bride) {
            // Set whatever properties or perform actions on the LinearLayout as needed
            // For example, change the background color
            snow.setBackgroundColor(getResources().getColor(R.color.white));
            bride.setBackgroundColor(getResources().getColor(R.color.purple));
            queen.setBackgroundColor(getResources().getColor(R.color.white));
            lux.setBackgroundColor(getResources().getColor(R.color.white));
            para.setBackgroundColor(getResources().getColor(R.color.white));
            story.setBackgroundColor(getResources().getColor(R.color.white));
        }
        else if (flowerLinearLayout == snow) {
            // Set whatever properties or perform actions on the LinearLayout as needed
            // For example, change the background color
            snow.setBackgroundColor(getResources().getColor(R.color.purple));
            bride.setBackgroundColor(getResources().getColor(R.color.white));
            queen.setBackgroundColor(getResources().getColor(R.color.white));
          lux.setBackgroundColor(getResources().getColor(R.color.white));
           para.setBackgroundColor(getResources().getColor(R.color.white));
            story.setBackgroundColor(getResources().getColor(R.color.white));
        }

        else if (flowerLinearLayout ==queen) {
            // Set whatever properties or perform actions on the LinearLayout as needed
            // For example, change the background color
            snow.setBackgroundColor(getResources().getColor(R.color.white));
            bride.setBackgroundColor(getResources().getColor(R.color.white));
            queen.setBackgroundColor(getResources().getColor(R.color.purple));
            lux.setBackgroundColor(getResources().getColor(R.color.white));
            para.setBackgroundColor(getResources().getColor(R.color.white));
            story.setBackgroundColor(getResources().getColor(R.color.white));
        }

        else if (flowerLinearLayout == lux) {
            // Set whatever properties or perform actions on the LinearLayout as needed
            // For example, change the background color
            snow.setBackgroundColor(getResources().getColor(R.color.white));
            bride.setBackgroundColor(getResources().getColor(R.color.white));
            queen.setBackgroundColor(getResources().getColor(R.color.white));
            lux.setBackgroundColor(getResources().getColor(R.color.purple));
            para.setBackgroundColor(getResources().getColor(R.color.white));
            story.setBackgroundColor(getResources().getColor(R.color.white));
        }
        else if (flowerLinearLayout == para) {
            // Set whatever properties or perform actions on the LinearLayout as needed
            // For example, change the background color
            snow.setBackgroundColor(getResources().getColor(R.color.white));
            bride.setBackgroundColor(getResources().getColor(R.color.white));
            queen.setBackgroundColor(getResources().getColor(R.color.white));
            lux.setBackgroundColor(getResources().getColor(R.color.white));
            para.setBackgroundColor(getResources().getColor(R.color.purple));
            story.setBackgroundColor(getResources().getColor(R.color.white));
        }
        else if (flowerLinearLayout == story) {
            // Set whatever properties or perform actions on the LinearLayout as needed
            // For example, change the background color

            snow.setBackgroundColor(getResources().getColor(R.color.white));
            bride.setBackgroundColor(getResources().getColor(R.color.white));
            queen.setBackgroundColor(getResources().getColor(R.color.white));
            lux.setBackgroundColor(getResources().getColor(R.color.white));
            para.setBackgroundColor(getResources().getColor(R.color.white));
            story.setBackgroundColor(getResources().getColor(R.color.purple));
        }
        else {
            Toast.makeText(this, "Flower not found: " + query, Toast.LENGTH_SHORT).show();
            snow.setBackgroundColor(getResources().getColor(R.color.white));
            bride.setBackgroundColor(getResources().getColor(R.color.white));
            queen.setBackgroundColor(getResources().getColor(R.color.white));
            lux.setBackgroundColor(getResources().getColor(R.color.white));
            para.setBackgroundColor(getResources().getColor(R.color.white));
            story.setBackgroundColor(getResources().getColor(R.color.white));
        }
    }
}
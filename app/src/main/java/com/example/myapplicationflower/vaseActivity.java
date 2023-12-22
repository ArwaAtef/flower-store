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

public class vaseActivity extends AppCompatActivity {

    LinearLayout flash;
    LinearLayout mod;
    LinearLayout dream;
    LinearLayout vibes;
    LinearLayout sunny;
    LinearLayout cleb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vase);

        SearchView searchView = findViewById(R.id.searchView);
        flash = findViewById(R.id.flash);
        mod= findViewById(R.id.mod);
        dream= findViewById(R.id.dream);
        vibes= findViewById(R.id.vibes);
        sunny= findViewById(R.id.sunny);
        cleb= findViewById(R.id.cleb);
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

    public void addToCartButtonClickflash(View view) {
        // Get the details of the selected item
        String itemName = ((TextView) view.getRootView().findViewById(R.id.flashname)).getText().toString();
        String itemPriceString = ((TextView) view.getRootView().findViewById(R.id.flashprice)).getText().toString();
        double itemPrice = Double.parseDouble(itemPriceString.replace(" EGP", ""));

        // Create a CartItem object
        cartitem cartItem = new cartitem(itemName, itemPrice);

        // Add the item to the cart (you may want to use a list or another data structure)
        ShoppingCart.addToCart(cartItem);

        // Optionally, you can show a message to the user indicating the item has been added to the cart
        Toast.makeText(this, "Added to Cart: " + itemName, Toast.LENGTH_SHORT).show();
    }

    public void addToCartButtonClickmod(View view) {
        // Get the details of the selected item
        String itemName = ((TextView) view.getRootView().findViewById(R.id.modname)).getText().toString();
        String itemPriceString = ((TextView) view.getRootView().findViewById(R.id.modprice)).getText().toString();
        double itemPrice = Double.parseDouble(itemPriceString.replace(" EGP", ""));

        // Create a CartItem object
        cartitem cartItem = new cartitem(itemName, itemPrice);

        // Add the item to the cart (you may want to use a list or another data structure)
        ShoppingCart.addToCart(cartItem);

        // Optionally, you can show a message to the user indicating the item has been added to the cart
        Toast.makeText(this, "Added to Cart: " + itemName, Toast.LENGTH_SHORT).show();
    }

    public void addToCartButtonClickdream(View view) {
        // Get the details of the selected item
        String itemName = ((TextView) view.getRootView().findViewById(R.id.dreamname)).getText().toString();
        String itemPriceString = ((TextView) view.getRootView().findViewById(R.id.dreamprice)).getText().toString();

        try {
            // Remove any non-numeric characters from the price string
            String cleanedPriceString = itemPriceString.replaceAll("[^\\d.]", "");

            // Convert the cleaned price string to double
            double itemPrice = Double.parseDouble(cleanedPriceString);

            // Create a CartItem object
            cartitem cartItem = new cartitem(itemName, itemPrice);

            // Add the item to the cart (you may want to use a list or another data structure)
            ShoppingCart.addToCart(cartItem);

            // Optionally, you can show a message to the user indicating the item has been added to the cart
            Toast.makeText(this, "Added to Cart: " + itemName, Toast.LENGTH_SHORT).show();
        } catch (NumberFormatException e) {
            // Handle the case where the price couldn't be parsed
            Toast.makeText(this, "Error parsing item price", Toast.LENGTH_SHORT).show();
            e.printStackTrace(); // Log the exception for debugging purposes
        }
    }


    public void addToCartButtonClickvibe(View view) {
        // Get the details of the selected item
        String itemName = ((TextView) view.getRootView().findViewById(R.id.vibename)).getText().toString();
        String itemPriceString = ((TextView) view.getRootView().findViewById(R.id.vibeprice)).getText().toString();
        double itemPrice = Double.parseDouble(itemPriceString.replace(" EGP", ""));

        // Create a CartItem object
        cartitem cartItem = new cartitem(itemName, itemPrice);

        // Add the item to the cart (you may want to use a list or another data structure)
        ShoppingCart.addToCart(cartItem);

        // Optionally, you can show a message to the user indicating the item has been added to the cart
        Toast.makeText(this, "Added to Cart: " + itemName, Toast.LENGTH_SHORT).show();
    }

    public void addToCartButtonClicksun(View view) {
        // Get the details of the selected item
        String itemName = ((TextView) view.getRootView().findViewById(R.id.sunname)).getText().toString();
        String itemPriceString = ((TextView) view.getRootView().findViewById(R.id.sunprice)).getText().toString();
        double itemPrice = Double.parseDouble(itemPriceString.replace(" EGP", ""));

        // Create a CartItem object
        cartitem cartItem = new cartitem(itemName, itemPrice);

        // Add the item to the cart (you may want to use a list or another data structure)
        ShoppingCart.addToCart(cartItem);

        // Optionally, you can show a message to the user indicating the item has been added to the cart
        Toast.makeText(this, "Added to Cart: " + itemName, Toast.LENGTH_SHORT).show();
    }

    public void addToCartButtonClickcele(View view) {
        // Get the details of the selected item
        String itemName = ((TextView) view.getRootView().findViewById(R.id.celename)).getText().toString();
        String itemPriceString = ((TextView) view.getRootView().findViewById(R.id.celeprice)).getText().toString();
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
            case "flashback":
                return flash;
            // Add more cases for other flower names if needed
            case "modality":
                return mod;
            case "dreamland":
                return dream;
            case "purple vibes":
                return vibes;
            case "sunny lilies":
                return sunny;
            case "celebrity":
                return cleb;
            default:
                return null;
        }
    }

    private void performSearch(String query) {
        // Implement your search logic here
        // You can update the UI or launch a search activity, etc.

        // Get the LinearLayout reference based on the flower name
        LinearLayout flowerLinearLayout = getFlowerLinearLayout(query);

        if (flowerLinearLayout == flash) {
            // Set whatever properties or perform actions on the LinearLayout as needed
            // For example, change the background color
            flash.setBackgroundColor(getResources().getColor(R.color.purple));
            dream.setBackgroundColor(getResources().getColor(R.color.white));
           sunny.setBackgroundColor(getResources().getColor(R.color.white));
            cleb.setBackgroundColor(getResources().getColor(R.color.white));
           vibes.setBackgroundColor(getResources().getColor(R.color.white));
            mod.setBackgroundColor(getResources().getColor(R.color.white));
        }
        else if (flowerLinearLayout == dream) {
            // Set whatever properties or perform actions on the LinearLayout as needed
            // For example, change the background color
            flash.setBackgroundColor(getResources().getColor(R.color.white));
            dream.setBackgroundColor(getResources().getColor(R.color.purple));
            sunny.setBackgroundColor(getResources().getColor(R.color.white));
            cleb.setBackgroundColor(getResources().getColor(R.color.white));
            vibes.setBackgroundColor(getResources().getColor(R.color.white));
            mod.setBackgroundColor(getResources().getColor(R.color.white));
        }

        else if (flowerLinearLayout == sunny) {
            // Set whatever properties or perform actions on the LinearLayout as needed
            // For example, change the background color
            flash.setBackgroundColor(getResources().getColor(R.color.white));
            dream.setBackgroundColor(getResources().getColor(R.color.white));
            sunny.setBackgroundColor(getResources().getColor(R.color.purple));
            cleb.setBackgroundColor(getResources().getColor(R.color.white));
            vibes.setBackgroundColor(getResources().getColor(R.color.white));
            mod.setBackgroundColor(getResources().getColor(R.color.white));
        }

        else if (flowerLinearLayout == cleb) {
            // Set whatever properties or perform actions on the LinearLayout as needed
            // For example, change the background color
            flash.setBackgroundColor(getResources().getColor(R.color.white));
            dream.setBackgroundColor(getResources().getColor(R.color.white));
            sunny.setBackgroundColor(getResources().getColor(R.color.white));
            cleb.setBackgroundColor(getResources().getColor(R.color.purple));
            vibes.setBackgroundColor(getResources().getColor(R.color.white));
            mod.setBackgroundColor(getResources().getColor(R.color.white));
        }
        else if (flowerLinearLayout == vibes) {
            // Set whatever properties or perform actions on the LinearLayout as needed
            // For example, change the background color
            flash.setBackgroundColor(getResources().getColor(R.color.white));
            dream.setBackgroundColor(getResources().getColor(R.color.white));
            sunny.setBackgroundColor(getResources().getColor(R.color.white));
            cleb.setBackgroundColor(getResources().getColor(R.color.white));
            vibes.setBackgroundColor(getResources().getColor(R.color.purple));
            mod.setBackgroundColor(getResources().getColor(R.color.white));
        }
        else if (flowerLinearLayout == mod) {
            // Set whatever properties or perform actions on the LinearLayout as needed
            // For example, change the background color
            flash.setBackgroundColor(getResources().getColor(R.color.white));
            dream.setBackgroundColor(getResources().getColor(R.color.white));
            sunny.setBackgroundColor(getResources().getColor(R.color.white));
            cleb.setBackgroundColor(getResources().getColor(R.color.white));
            vibes.setBackgroundColor(getResources().getColor(R.color.white));
            mod.setBackgroundColor(getResources().getColor(R.color.purple));
        }
        else {
            Toast.makeText(this, "Flower not found: " + query, Toast.LENGTH_SHORT).show();
            flash.setBackgroundColor(getResources().getColor(R.color.white));
            dream.setBackgroundColor(getResources().getColor(R.color.white));
            sunny.setBackgroundColor(getResources().getColor(R.color.white));
            cleb.setBackgroundColor(getResources().getColor(R.color.white));
            vibes.setBackgroundColor(getResources().getColor(R.color.white));
            mod.setBackgroundColor(getResources().getColor(R.color.white));
        }
    }
}
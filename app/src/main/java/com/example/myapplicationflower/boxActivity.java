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

public class boxActivity extends AppCompatActivity {

    LinearLayout romance;
    LinearLayout grand;
    LinearLayout mix;
    LinearLayout pinkblack;
    LinearLayout amber;
    LinearLayout amour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_box);

        SearchView searchView = findViewById(R.id.searchView);
        romance = findViewById(R.id.romance);
        grand= findViewById(R.id.grand);
        mix= findViewById(R.id.mix);
       pinkblack= findViewById(R.id.pinkblack);
      amour= findViewById(R.id.amour);
        amber= findViewById(R.id.amber);
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

    public void addToCartButtonClicknew(View view) {
        // Get the details of the selected item
        String itemName = ((TextView) view.getRootView().findViewById(R.id.newname)).getText().toString();
        String itemPriceString = ((TextView) view.getRootView().findViewById(R.id.newprice)).getText().toString();
        double itemPrice = Double.parseDouble(itemPriceString.replace(" EGP", ""));

        // Create a CartItem object
        cartitem cartItem = new cartitem(itemName, itemPrice);

        // Add the item to the cart (you may want to use a list or another data structure)
        ShoppingCart.addToCart(cartItem);

        // Optionally, you can show a message to the user indicating the item has been added to the cart
        Toast.makeText(this, "Added to Cart: " + itemName, Toast.LENGTH_SHORT).show();
    }

    public void addToCartButtonClickgrand(View view) {
        // Get the details of the selected item
        String itemName = ((TextView) view.getRootView().findViewById(R.id.grandname)).getText().toString();
        String itemPriceString = ((TextView) view.getRootView().findViewById(R.id.grandprice)).getText().toString();
        double itemPrice = Double.parseDouble(itemPriceString.replace(" EGP", ""));

        // Create a CartItem object
        cartitem cartItem = new cartitem(itemName, itemPrice);

        // Add the item to the cart (you may want to use a list or another data structure)
        ShoppingCart.addToCart(cartItem);

        // Optionally, you can show a message to the user indicating the item has been added to the cart
        Toast.makeText(this, "Added to Cart: " + itemName, Toast.LENGTH_SHORT).show();
    }

    public void addToCartButtonClickmix(View view) {
        try {
            // Get the details of the selected item
            String itemName = ((TextView) view.getRootView().findViewById(R.id.mixname)).getText().toString();
            String itemPriceString = ((TextView) view.getRootView().findViewById(R.id.mixprice)).getText().toString();

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


    public void addToCartButtonClickmy(View view) {
        // Get the details of the selected item
        String itemName = ((TextView) view.getRootView().findViewById(R.id.myname)).getText().toString();
        String itemPriceString = ((TextView) view.getRootView().findViewById(R.id.myprice)).getText().toString();
        double itemPrice = Double.parseDouble(itemPriceString.replace(" EGP", ""));

        // Create a CartItem object
        cartitem cartItem = new cartitem(itemName, itemPrice);

        // Add the item to the cart (you may want to use a list or another data structure)
        ShoppingCart.addToCart(cartItem);

        // Optionally, you can show a message to the user indicating the item has been added to the cart
        Toast.makeText(this, "Added to Cart: " + itemName, Toast.LENGTH_SHORT).show();
    }

    public void addToCartButtonClickpink(View view) {
        // Get the details of the selected item
        String itemName = ((TextView) view.getRootView().findViewById(R.id.pinkname)).getText().toString();
        String itemPriceString = ((TextView) view.getRootView().findViewById(R.id.pinkprice)).getText().toString();
        double itemPrice = Double.parseDouble(itemPriceString.replace(" EGP", ""));

        // Create a CartItem object
        cartitem cartItem = new cartitem(itemName, itemPrice);

        // Add the item to the cart (you may want to use a list or another data structure)
        ShoppingCart.addToCart(cartItem);

        // Optionally, you can show a message to the user indicating the item has been added to the cart
        Toast.makeText(this, "Added to Cart: " + itemName, Toast.LENGTH_SHORT).show();
    }
    public void addToCartButtonClickamber(View view) {
        // Get the details of the selected item
        String itemName = ((TextView) view.getRootView().findViewById(R.id.ambername)).getText().toString();
        String itemPriceString = ((TextView) view.getRootView().findViewById(R.id.amberprice)).getText().toString();
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
            case "new romance":
                return romance;
            // Add more cases for other flower names if needed
            case "grandeur":
                return grand;
            case "color mix":
                return mix;
            case "pink black":
                return pinkblack;
            case "my amour":
                return amour;
            case "amber":
                return amber;
            default:
                return null;
        }
    }

    private void performSearch(String query) {
        // Implement your search logic here
        // You can update the UI or launch a search activity, etc.

        // Get the LinearLayout reference based on the flower name
        LinearLayout flowerLinearLayout = getFlowerLinearLayout(query);

        if (flowerLinearLayout == romance) {
            // Set whatever properties or perform actions on the LinearLayout as needed
            // For example, change the background color
           romance.setBackgroundColor(getResources().getColor(R.color.purple));
            mix.setBackgroundColor(getResources().getColor(R.color.white));
            pinkblack.setBackgroundColor(getResources().getColor(R.color.white));
            amour.setBackgroundColor(getResources().getColor(R.color.white));
            amber.setBackgroundColor(getResources().getColor(R.color.white));
           grand.setBackgroundColor(getResources().getColor(R.color.white));
        }
        else if (flowerLinearLayout == mix) {
            // Set whatever properties or perform actions on the LinearLayout as needed
            // For example, change the background color
            romance.setBackgroundColor(getResources().getColor(R.color.white));
            mix.setBackgroundColor(getResources().getColor(R.color.purple));
            pinkblack.setBackgroundColor(getResources().getColor(R.color.white));
            amour.setBackgroundColor(getResources().getColor(R.color.white));
            amber.setBackgroundColor(getResources().getColor(R.color.white));
            grand.setBackgroundColor(getResources().getColor(R.color.white));
        }

        else if (flowerLinearLayout == pinkblack) {
            // Set whatever properties or perform actions on the LinearLayout as needed
            // For example, change the background color
            romance.setBackgroundColor(getResources().getColor(R.color.white));
            mix.setBackgroundColor(getResources().getColor(R.color.white));
            pinkblack.setBackgroundColor(getResources().getColor(R.color.purple));
            amour.setBackgroundColor(getResources().getColor(R.color.white));
            amber.setBackgroundColor(getResources().getColor(R.color.white));
            grand.setBackgroundColor(getResources().getColor(R.color.white));
        }

        else if (flowerLinearLayout == amour) {
            // Set whatever properties or perform actions on the LinearLayout as needed
            // For example, change the background color
            romance.setBackgroundColor(getResources().getColor(R.color.white));
            mix.setBackgroundColor(getResources().getColor(R.color.white));
            pinkblack.setBackgroundColor(getResources().getColor(R.color.white));
            amour.setBackgroundColor(getResources().getColor(R.color.purple));
            amber.setBackgroundColor(getResources().getColor(R.color.white));
            grand.setBackgroundColor(getResources().getColor(R.color.white));
        }
        else if (flowerLinearLayout == amber) {
            // Set whatever properties or perform actions on the LinearLayout as needed
            // For example, change the background color
            romance.setBackgroundColor(getResources().getColor(R.color.white));
            mix.setBackgroundColor(getResources().getColor(R.color.white));
            pinkblack.setBackgroundColor(getResources().getColor(R.color.white));
            amour.setBackgroundColor(getResources().getColor(R.color.white));
            amber.setBackgroundColor(getResources().getColor(R.color.purple));
            grand.setBackgroundColor(getResources().getColor(R.color.white));
        }
        else if (flowerLinearLayout == grand) {
            // Set whatever properties or perform actions on the LinearLayout as needed
            // For example, change the background color
            romance.setBackgroundColor(getResources().getColor(R.color.white));
            mix.setBackgroundColor(getResources().getColor(R.color.white));
            pinkblack.setBackgroundColor(getResources().getColor(R.color.white));
            amour.setBackgroundColor(getResources().getColor(R.color.white));
            amber.setBackgroundColor(getResources().getColor(R.color.white));
            grand.setBackgroundColor(getResources().getColor(R.color.purple));
        }
        else {
            Toast.makeText(this, "Flower not found: " + query, Toast.LENGTH_SHORT).show();

            romance.setBackgroundColor(getResources().getColor(R.color.white));
            mix.setBackgroundColor(getResources().getColor(R.color.white));
            pinkblack.setBackgroundColor(getResources().getColor(R.color.white));
            amour.setBackgroundColor(getResources().getColor(R.color.white));
            amber.setBackgroundColor(getResources().getColor(R.color.white));
            grand.setBackgroundColor(getResources().getColor(R.color.white));
        }
    }
}
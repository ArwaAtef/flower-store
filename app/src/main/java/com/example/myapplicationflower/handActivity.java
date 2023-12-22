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

public class handActivity extends AppCompatActivity {

    LinearLayout simply_rose;
    LinearLayout purple;
    LinearLayout rosy;
    LinearLayout brill;
    LinearLayout dew;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hand);

        SearchView searchView = findViewById(R.id.searchView);
        simply_rose = findViewById(R.id.simply_rose); // Assuming you have a LinearLayout for displaying the flower
        purple= findViewById(R.id.purple);
       rosy= findViewById(R.id.rosy);
        brill= findViewById(R.id.brill);
        dew= findViewById(R.id.dew);
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
    public void addToCartButtonClickRose(View view) {
        // Get the details of the selected item
        String itemName = ((TextView) view.getRootView().findViewById(R.id.itemNameTextView)).getText().toString();
        String itemPriceString = ((TextView) view.getRootView().findViewById(R.id.itemPriceTextView)).getText().toString();
        double itemPrice = Double.parseDouble(itemPriceString.replace(" EGP", ""));

        // Create a CartItem object
        cartitem cartItem = new cartitem(itemName, itemPrice);

        // Add the item to the cart (you may want to use a list or another data structure)
        ShoppingCart.addToCart(cartItem);

        // Optionally, you can show a message to the user indicating the item has been added to the cart
        Toast.makeText(this, "Added to Cart: " + itemName, Toast.LENGTH_SHORT).show();
    }

    public void addToCartButtonClickSunset(View view) {
        // Get the details of the selected item
        String itemName = ((TextView) view.getRootView().findViewById(R.id.purpleName)).getText().toString();
        String itemPriceString = ((TextView) view.getRootView().findViewById(R.id.purpleprice)).getText().toString();
        double itemPrice = Double.parseDouble(itemPriceString.replace(" EGP", ""));

        // Create a CartItem object
        cartitem cartItem = new cartitem(itemName, itemPrice);

        // Add the item to the cart (you may want to use a list or another data structure)
        ShoppingCart.addToCart(cartItem);

        // Optionally, you can show a message to the user indicating the item has been added to the cart
        Toast.makeText(this, "Added to Cart: " + itemName, Toast.LENGTH_SHORT).show();
    }

    public void addToCartButtonClickRosy(View view) {
        // Get the details of the selected item
        String itemName = ((TextView) view.getRootView().findViewById(R.id.rosyname)).getText().toString();
        String itemPriceString = ((TextView) view.getRootView().findViewById(R.id.rosyprice)).getText().toString();
        double itemPrice = Double.parseDouble(itemPriceString.replace(" EGP", ""));

        // Create a CartItem object
        cartitem cartItem = new cartitem(itemName, itemPrice);

        // Add the item to the cart (you may want to use a list or another data structure)
        ShoppingCart.addToCart(cartItem);

        // Optionally, you can show a message to the user indicating the item has been added to the cart
        Toast.makeText(this, "Added to Cart: " + itemName, Toast.LENGTH_SHORT).show();
    }
    public void addToCartButtonClickB(View view) {
        // Get the details of the selected item
        String itemName = ((TextView) view.getRootView().findViewById(R.id.bname)).getText().toString();
        String itemPriceString = ((TextView) view.getRootView().findViewById(R.id.bprice)).getText().toString();
        double itemPrice = Double.parseDouble(itemPriceString.replace(" EGP", ""));

        // Create a CartItem object
        cartitem cartItem = new cartitem(itemName, itemPrice);

        // Add the item to the cart (you may want to use a list or another data structure)
        ShoppingCart.addToCart(cartItem);

        // Optionally, you can show a message to the user indicating the item has been added to the cart
        Toast.makeText(this, "Added to Cart: " + itemName, Toast.LENGTH_SHORT).show();
    }
    public void addToCartButtonClickdew(View view) {
        // Get the details of the selected item
        String itemName = ((TextView) view.getRootView().findViewById(R.id.dewname)).getText().toString();
        String itemPriceString = ((TextView) view.getRootView().findViewById(R.id.dewprice)).getText().toString();
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
            case "simple rose":
                return simply_rose;
            // Add more cases for other flower names if needed
            case "purple sunset":
                return purple;
            case "rosy angel":
                return rosy;
            case "brilliance":
                return brill;
            case "morning dew":
                return dew;
            default:
                return null;
        }
    }

    private void performSearch(String query) {
        // Implement your search logic here
        // You can update the UI or launch a search activity, etc.

        // Get the LinearLayout reference based on the flower name
        LinearLayout flowerLinearLayout = getFlowerLinearLayout(query);

        if (flowerLinearLayout == simply_rose) {
            // Set whatever properties or perform actions on the LinearLayout as needed
            // For example, change the background color
          simply_rose.setBackgroundColor(getResources().getColor(R.color.purple));
          purple.setBackgroundColor(getResources().getColor(R.color.white));
            rosy.setBackgroundColor(getResources().getColor(R.color.white));
            brill.setBackgroundColor(getResources().getColor(R.color.white));
            dew.setBackgroundColor(getResources().getColor(R.color.white));
        }
        else if (flowerLinearLayout == purple) {
            // Set whatever properties or perform actions on the LinearLayout as needed
            // For example, change the background color
            simply_rose.setBackgroundColor(getResources().getColor(R.color.white));
            purple.setBackgroundColor(getResources().getColor(R.color.purple));
            rosy.setBackgroundColor(getResources().getColor(R.color.white));
            brill.setBackgroundColor(getResources().getColor(R.color.white));
            dew.setBackgroundColor(getResources().getColor(R.color.white));
        }

        else if (flowerLinearLayout == rosy) {
            // Set whatever properties or perform actions on the LinearLayout as needed
            // For example, change the background color
            simply_rose.setBackgroundColor(getResources().getColor(R.color.white));
            purple.setBackgroundColor(getResources().getColor(R.color.white));
            rosy.setBackgroundColor(getResources().getColor(R.color.purple));
            brill.setBackgroundColor(getResources().getColor(R.color.white));
            dew.setBackgroundColor(getResources().getColor(R.color.white));
        }

        else if (flowerLinearLayout == brill) {
            // Set whatever properties or perform actions on the LinearLayout as needed
            // For example, change the background color
            simply_rose.setBackgroundColor(getResources().getColor(R.color.white));
            purple.setBackgroundColor(getResources().getColor(R.color.white));
            rosy.setBackgroundColor(getResources().getColor(R.color.white));
            brill.setBackgroundColor(getResources().getColor(R.color.purple));
            dew.setBackgroundColor(getResources().getColor(R.color.white));
        }
        else if (flowerLinearLayout == dew) {
            // Set whatever properties or perform actions on the LinearLayout as needed
            // For example, change the background color
            simply_rose.setBackgroundColor(getResources().getColor(R.color.white));
            purple.setBackgroundColor(getResources().getColor(R.color.white));
            rosy.setBackgroundColor(getResources().getColor(R.color.white));
            brill.setBackgroundColor(getResources().getColor(R.color.white));
            dew.setBackgroundColor(getResources().getColor(R.color.purple));
        }
        else {
            Toast.makeText(this, "Flower not found: " + query, Toast.LENGTH_SHORT).show();

            simply_rose.setBackgroundColor(getResources().getColor(R.color.white));
            purple.setBackgroundColor(getResources().getColor(R.color.white));
            rosy.setBackgroundColor(getResources().getColor(R.color.white));
            brill.setBackgroundColor(getResources().getColor(R.color.white));
            dew.setBackgroundColor(getResources().getColor(R.color.white));
        }
    }

}
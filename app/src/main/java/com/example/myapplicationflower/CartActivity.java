package com.example.myapplicationflower;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationflower.ui.ShoppingCart;
import com.example.myapplicationflower.ui.cartitem;

import java.util.List;

public class CartActivity extends AppCompatActivity {

    private TextView cartTextView;
    private Button checkoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        cartTextView = findViewById(R.id.cartTextView);
        checkoutButton = findViewById(R.id.checkoutButton);

        // Get the list of items from the shopping cart
        List<cartitem> cartItems = ShoppingCart.getCartItems();

        // Display the items in a TextView or RecyclerView, depending on your UI design
        StringBuilder cartContent = new StringBuilder();
        double totalPrice = 0;

        for (cartitem item : cartItems) {
            cartContent.append(item.getItemName()).append(" - ").append(item.getItemPrice()).append(" EGP\n");
            totalPrice += item.getItemPrice();
        }

        cartContent.append("\nTotal Price: ").append(totalPrice).append(" EGP");
        cartTextView.setText(cartContent.toString());

        // Enable or disable the checkout button based on cart content
        checkoutButton.setEnabled(!cartItems.isEmpty());
    }

    // Checkout button click handler
    public void checkoutButtonClick(View view) {
        // If the cart is not empty, proceed to checkout
        if (!ShoppingCart.getCartItems().isEmpty()) {
            // Start a new activity for payment method selection
            Intent intent = new Intent(this, PaymentMethodActivity.class);
            startActivity(intent);
        }
    }
}

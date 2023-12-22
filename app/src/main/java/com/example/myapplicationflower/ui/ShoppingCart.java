package com.example.myapplicationflower.ui;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private static List<cartitem> cartItems = new ArrayList<>();

    public static void addToCart(cartitem cartItem) {
        cartItems.add(cartItem);
    }

    public static List<cartitem> getCartItems() {
        return cartItems;
    }


}

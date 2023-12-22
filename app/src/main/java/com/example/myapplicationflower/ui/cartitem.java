package com.example.myapplicationflower.ui;

public class cartitem {
    private String itemName;
    private double itemPrice;

    int imageResourceId;

    public cartitem(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }
    public int getImageResourceId() {

        return imageResourceId;
    }
}

package com.example.eltequito;

public class Article {
    private String mName;
    private double mPrice;
    private int mQuantity;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    protected Article(String articleName, double articlePrice) {
        this.setmName(articleName);
        this.setmPrice(articlePrice);
    }

    protected Article(String articleName, double articlePrice, int imageResourceId) {
        this.setmName(articleName);
        this.setmPrice(articlePrice);
        this.setImage(imageResourceId);
    }

    public String getmName() {
        return mName;
    }

    public double getmPrice() {
        return mPrice;
    }

    public int getimageResourceId() {
        return mImageResourceId;
    }

    protected void setmName(String articleName) {
        mName = articleName;
    }

    protected void setmPrice(double articlePrice) {
        mPrice = articlePrice;
    }

    protected void setmQuantity(int articleQuantity) {
        mQuantity = articleQuantity;
    }

    protected void setImage(int imageResourceId) {
        mImageResourceId = imageResourceId;
    }
}

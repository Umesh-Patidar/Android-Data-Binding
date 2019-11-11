package com.databinding.model;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

public class DataModel {
    private String androidVersion;
    private String androidName;
    private int imageUrl;

    public DataModel(String androidVersion, String androidName, int imageUrl) {
        this.androidVersion = androidVersion;
        this.androidName = androidName;
        this.imageUrl = imageUrl;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
    }

    public String getAndroidName() {
        return androidName;
    }

    public void setAndroidName(String androidName) {
        this.androidName = androidName;
    }

    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView view, int url) {
        view.setImageResource(url);
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }
}

package com.example.om.canteenitemsphotoload;

/**
 * Created by Om on 3/6/2018.
 */

public class ImageUpload {
    public String name;
    public String url;

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public ImageUpload(String name, String url) {
        this.name = name;
        this.url = url;
    }
}

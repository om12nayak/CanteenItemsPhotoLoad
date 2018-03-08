package com.example.om.canteenitemsphotoload;

/**
 * Created by Om on 3/6/2018.
 */

public class ImageUpload {
    public String name;
    public String url;
    public String price;

    public String getPrice() {
        return price;
    }

    public String getItemNo() {
        return itemNo;
    }

    public String itemNo;

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public ImageUpload(String name, String url, String price, String itemNo) {
        this.name = name;
        this.url = url;
        this.price = price;
        this.itemNo = itemNo;
    }
}

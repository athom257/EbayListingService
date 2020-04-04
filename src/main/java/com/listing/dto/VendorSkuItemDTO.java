package com.listing.dto;

public class VendorSkuItemDTO {

    private String sku_code;

    private String item_name;

    private String brand;

    private String price;

    private String img_url;

    private String item_description;

    public VendorSkuItemDTO(String sku_code, String item_name, String brand, String price, String img_url, String item_description) {
        this.sku_code = sku_code;
        this.item_name = item_name;
        this.brand = brand;
        this.price = price;
        this.img_url = img_url;
        this.item_description = item_description;
    }

    public String getSku_code() {
        return sku_code;
    }

    public void setSku_code(String sku_code) {
        this.sku_code = sku_code;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getItem_description() {
        return item_description;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }

    @Override
    public String toString() {
        return "VendorSkuItemDTO{" +
                "sku_code='" + sku_code + '\'' +
                ", item_name='" + item_name + '\'' +
                ", brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                ", img_url='" + img_url + '\'' +
                ", item_description='" + item_description + '\'' +
                '}';
    }
}

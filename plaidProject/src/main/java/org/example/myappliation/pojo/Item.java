package org.example.myappliation.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Item {
    @SerializedName("available_products")
    @Expose
    private List<String> availableProducts;
    @SerializedName("billed_products")
    @Expose
    private List<String> billedProducts;
    private String consent_expiration_time;
    private String error;
    private String institution_id;
    private String item_id;
    private String optional_products;
    private List<String> products;
    private String update_type;
    private String webhook;

    public Item() {
    }

    public Item(List<String> availableProducts, List<String> billedProducts, String consent_expiration_time, String error, String institution_id, String item_id, String optional_products, List<String> products, String update_type, String webhook) {
        this.availableProducts = availableProducts;
        this.billedProducts = billedProducts;
        this.consent_expiration_time = consent_expiration_time;
        this.error = error;
        this.institution_id = institution_id;
        this.item_id = item_id;
        this.optional_products = optional_products;
        this.products = products;
        this.update_type = update_type;
        this.webhook = webhook;
    }

    public List<String> getAvailableProducts() {
        return availableProducts;
    }

    public void setAvailableProducts(List<String> availableProducts) {
        this.availableProducts = availableProducts;
    }

    public List<String> getBilledProducts() {
        return billedProducts;
    }

    public void setBilledProducts(List<String> billedProducts) {
        this.billedProducts = billedProducts;
    }

    public String getConsent_expiration_time() {
        return consent_expiration_time;
    }

    public void setConsent_expiration_time(String consent_expiration_time) {
        this.consent_expiration_time = consent_expiration_time;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getInstitution_id() {
        return institution_id;
    }

    public void setInstitution_id(String institution_id) {
        this.institution_id = institution_id;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public String getOptional_products() {
        return optional_products;
    }

    public void setOptional_products(String optional_products) {
        this.optional_products = optional_products;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public String getUpdate_type() {
        return update_type;
    }

    public void setUpdate_type(String update_type) {
        this.update_type = update_type;
    }

    public String getWebhook() {
        return webhook;
    }

    public void setWebhook(String webhook) {
        this.webhook = webhook;
    }
}

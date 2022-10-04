package org.example.myappliation.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.example.myappliation.entity.UserAccountInfo;

import java.util.List;

public class Pojo {
    @SerializedName("accounts")
    @Expose
    private List<UserAccountInfo> allAccounts;
    private Item item;
    private String request_id;

    public List<UserAccountInfo> getAllAccounts() {
        return allAccounts;
    }

    public void setAllAccounts(List<UserAccountInfo> allAccounts) {
        this.allAccounts = allAccounts;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }
}

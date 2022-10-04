package org.example.dto;

import org.example.entity.Customer;

public class OrderRequest {
    private Customer customer;

    public OrderRequest() {
    }

    public OrderRequest(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

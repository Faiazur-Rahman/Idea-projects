package org.example.myappliation.entity;

import javax.persistence.*;

@Entity
@Table(name = "balance_info")
public class BalanceInfo {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "available_balance")
    private Double available;
    @Column(name = "current_balance")
    private Double current;
    private String iso_currency_code;
    @Column(name = "the_limit")
    private Object limit;
    private Object unofficial_currency_code;

    public BalanceInfo() {
    }

    public BalanceInfo( Double available, Double current, String iso_currency_code, Object limit, Object unofficial_currency_code) {

        this.available = available;
        this.current = current;
        this.iso_currency_code = iso_currency_code;
        this.limit = limit;
        this.unofficial_currency_code = unofficial_currency_code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getAvailable() {
        return available;
    }

    public void setAvailable(Double available) {
        this.available = available;
    }

    public Double getCurrent() {
        return current;
    }

    public void setCurrent(Double current) {
        this.current = current;
    }

    public String getIso_currency_code() {
        return iso_currency_code;
    }

    public void setIso_currency_code(String iso_currency_code) {
        this.iso_currency_code = iso_currency_code;
    }

    public Object getLimit() {
        return limit;
    }

    public void setLimit(Object limit) {
        this.limit = limit;
    }

    public Object getUnofficial_currency_code() {
        return unofficial_currency_code;
    }

    public void setUnofficial_currency_code(Object unofficial_currency_code) {
        this.unofficial_currency_code = unofficial_currency_code;
    }
}

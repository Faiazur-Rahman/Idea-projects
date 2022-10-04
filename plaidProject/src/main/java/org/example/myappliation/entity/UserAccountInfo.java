package org.example.myappliation.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.persistence.*;

@Entity
public class UserAccountInfo {
    @GeneratedValue
    private int id;
    @Id
    @SerializedName("account_id")
    @Expose
    private String accountId;

    @OneToOne(targetEntity = BalanceInfo.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "account_fk", referencedColumnName = "id")
    @Column(name = "balance_info")
    private BalanceInfo balances;
    @Column(name = "the_mask")
    private String mask;
    @Column(name = "name")
    private String name;

    @SerializedName("official_name")
    @Expose
    private Object officialName;
    @Column(name = "sub_type")
    private String subtype;
    @Column(name = "the_type")
    private String type;

    public UserAccountInfo() {
    }

    public UserAccountInfo( String accountId, BalanceInfo balances, String mask, String name, Object officialName, String subtype, String type) {
        this.accountId = accountId;
        this.balances = balances;
        this.mask = mask;
        this.name = name;
        this.officialName = officialName;
        this.subtype = subtype;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public BalanceInfo getBalances() {
        return balances;
    }

    public void setBalances(BalanceInfo balances) {
        this.balances = balances;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getOfficialName() {
        return officialName;
    }

    public void setOfficialName(Object officialName) {
        this.officialName = officialName;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

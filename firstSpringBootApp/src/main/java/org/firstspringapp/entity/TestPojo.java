package org.firstspringapp.entity;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Generated("jsonschema2pojo")
public class TestPojo {

    @SerializedName("domains")
    @Expose
    private List<String> domains;
    @SerializedName("alpha_two_code")
    @Expose
    private String alphaTwoCode;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("web_pages")
    @Expose
    private List<String> webPages;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("state-province")
    @Expose
    private String stateProvince;

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public String getAlphaTwoCode() {
        return alphaTwoCode;
    }

    public void setAlphaTwoCode(String alphaTwoCode) {
        this.alphaTwoCode = alphaTwoCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getWebPages() {
        return webPages;
    }

    public void setWebPages(List<String> webPages) {
        this.webPages = webPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

}
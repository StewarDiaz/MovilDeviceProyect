package com.programmingjd.movildeviceproyect.models;

import com.programmingjd.movildeviceproyect.apiManager.RetrofitClient;

import java.io.Serializable;

public class Random implements Serializable {

    String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

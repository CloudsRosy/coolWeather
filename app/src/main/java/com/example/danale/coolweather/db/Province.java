package com.example.danale.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by danale on 2017/7/31.
 */

public class Province extends DataSupport {
    private int ID;
    private String proviceName;
    private int provinceID;

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setProviceName(String proviceName) {
        this.proviceName = proviceName;
    }

    public String getProviceName() {
        return proviceName;
    }

    public void setProvinceID(int provinceID) {
        this.provinceID = provinceID;
    }

    public int getProvinceID() {
        return provinceID;
    }
}

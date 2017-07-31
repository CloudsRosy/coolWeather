package com.example.danale.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by danale on 2017/7/31.
 */

public class City extends DataSupport {
    private int ID;
    private String CityName;
    private int CityCode;
    private int provinceID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public int getCityCode() {
        return CityCode;
    }

    public void setCityCode(int cityCode) {
        CityCode = cityCode;
    }

    public void setProvinceID(int provinceID) {
        this.provinceID = provinceID;
    }

    public int getProvinceID() {
        return provinceID;
    }
}

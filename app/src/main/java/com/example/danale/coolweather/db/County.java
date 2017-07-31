package com.example.danale.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by danale on 2017/7/31.
 */

public class County extends DataSupport {
    private int ID;
    private String countyCode;
    private String weatherID;
    private int cityID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public int getCityID() {
        return cityID;
    }

    public String getWeatherID() {
        return weatherID;
    }

    public void setWeatherID(String weatherID) {
        this.weatherID = weatherID;
    }
}

package com.sssta.ganmaqu.response;

import com.sssta.ganmaqu.model.City;

import java.util.List;

/**
 * Created by libin on 15/2/26.
 */
public class AvaliableCitiesResponse {

    private int status;
    private String msg;
    private List<City> cities;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}

package com.demo.modules.po;

import com.demo.commons.domain.po.PO;

import java.io.Serializable;
import java.util.Date;

public class LocationPO implements Serializable, PO {

    private String trapId;
    /**
     * longitude
     */
    private String lng;
    /**
     * latitude
     */
    private String lat;

    private Date time;

    public String getTrapId() {
        return trapId;
    }

    public void setTrapId(String trapId) {
        this.trapId = trapId;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public Class getVO() {
        return LocationPO.class;
    }
}

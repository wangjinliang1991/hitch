package com.demo.modules.po;

import com.demo.commons.domain.po.PO;

import java.io.Serializable;
import java.util.Date;

public class OrderPO implements Serializable, PO {
    private String id;

    private String passengerId;

    /**
     * passenger stroke ID
     */
    private String passengerStrokeId;

    private String driverId;

    /**
     * driver stroke ID
     */
    private String driverStrokeId;

    /**
     * distance, unit: meter
     */
    private Integer distance;

    /**
     * estimated time, unit: second
     */
    private Integer estimatedTime;

    /**
     * cost, unit: RMB
     */
    private Float cost;


    /**
     * order status
     * unpaid: 0
     * paid: 1
     * unconfirmed: 2
     */
    private Integer status;

    private Integer revision;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public String getPassengerStrokeId() {
        return passengerStrokeId;
    }

    public void setPassengerStrokeId(String passengerStrokeId) {
        this.passengerStrokeId = passengerStrokeId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getDriverStrokeId() {
        return driverStrokeId;
    }

    public void setDriverStrokeId(String driverStrokeId) {
        this.driverStrokeId = driverStrokeId;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(Integer estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRevision() {
        return revision;
    }

    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public Class getVO() {
        return OrderPO.class;
    }
}

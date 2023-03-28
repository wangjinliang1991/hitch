package com.demo.modules.po;

import com.demo.commons.domain.po.PO;

import java.io.Serializable;
import java.util.Date;

public class StrokePO implements Serializable, PO {
    private String id;

    private String publisherId;

    /**
     * publisher role
     * passenger: 0
     * driver: 1
     */
    private Integer role;

    private String startGeoLng;

    private String startGeoLat;

    private String endGeoLng;

    private String endGeoLat;

    private String startAddr;

    private String endAddr;

    /**
     * quantity
     * for driver: num of empty seats
     * for passenger: num of companions
     */
    private Integer quantity;

    private Date departureTime;

    /**
     * quick confirm
     * for driver: auto order acceptance
     * for passenger: quick confirm
     */
    private Integer quickConfirm;

    /**
     * stroke status
     * <p>
     * missed order：0
     * received order：1
     * have set out：2
     * on the road：3
     * finished：4
     * time out：5
     */
    private Integer status;

    private Integer revision;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;


    private Date updatedTime;

    /**
     * t_stroke
     */
    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId == null ? null : publisherId.trim();
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getStartGeoLng() {
        return startGeoLng;
    }

    public void setStartGeoLng(String startGeoLng) {
        this.startGeoLng = startGeoLng;
    }

    public String getStartGeoLat() {
        return startGeoLat;
    }

    public void setStartGeoLat(String startGeoLat) {
        this.startGeoLat = startGeoLat;
    }

    public String getEndGeoLng() {
        return endGeoLng;
    }

    public void setEndGeoLng(String endGeoLng) {
        this.endGeoLng = endGeoLng;
    }

    public String getEndGeoLat() {
        return endGeoLat;
    }

    public void setEndGeoLat(String endGeoLat) {
        this.endGeoLat = endGeoLat;
    }

    public String getStartAddr() {
        return startAddr;
    }

    public void setStartAddr(String startAddr) {
        this.startAddr = startAddr == null ? null : startAddr.trim();
    }

    public String getEndAddr() {
        return endAddr;
    }

    public void setEndAddr(String endAddr) {
        this.endAddr = endAddr == null ? null : endAddr.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Integer getQuickConfirm() {
        return quickConfirm;
    }

    public void setQuickConfirm(Integer quickConfirm) {
        this.quickConfirm = quickConfirm;
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
        this.createdBy = createdBy == null ? null : createdBy.trim();
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
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public Class getVO() {
        return StrokePO.class;
    }
}

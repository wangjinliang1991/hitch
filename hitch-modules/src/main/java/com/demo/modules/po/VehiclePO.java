package com.demo.modules.po;

import com.demo.commons.domain.po.PO;

import java.io.Serializable;
import java.util.Date;

public class VehiclePO implements Serializable, PO {
    private String id;

    /**
     * car license number
     */
    private String carNumber;

    private String carFrontPhoto;

    private String carBackPhoto;

    private String carSidePhoto;

    private Date purchaseDate;

    private String phone;

    /**
     * auth status
     * unauthorized 0
     * authorize successfully 1
     * authorize failed 2
     */
    private Integer status;

    private Integer revision;


    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    /**
     * t_vehicle
     */
    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarFrontPhoto() {
        return carFrontPhoto;
    }

    public void setCarFrontPhoto(String carFrontPhoto) {
        this.carFrontPhoto = carFrontPhoto;
    }

    public String getCarBackPhoto() {
        return carBackPhoto;
    }

    public void setCarBackPhoto(String carBackPhoto) {
        this.carBackPhoto = carBackPhoto;
    }

    public String getCarSidePhoto() {
        return carSidePhoto;
    }

    public void setCarSidePhoto(String carSidePhoto) {
        this.carSidePhoto = carSidePhoto;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        return VehiclePO.class;
    }
}

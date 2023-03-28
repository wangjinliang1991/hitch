package com.demo.modules.po;

import com.demo.commons.domain.po.PO;

import java.io.Serializable;
import java.util.Date;

public class AuthenticationPO implements Serializable, PO {

    private String id;


    private String useralias;


    private String phone;

    private String birth;

    private String personalPhoto;


    private String cardId;


    private String cardIdFrontPhoto;


    private String cardIdBackPhoto;

    /**
     * auth status
     * unauthorized 0
     * authorize successfully 1
     * authorize failed 2
     */
    private String status;

    private Integer revision;

    private String createdBy;

    private Date createdTime;


    private String updatedBy;

    private Date updatedTime;
    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUseralias() {
        return useralias;
    }

    public void setUseralias(String useralias) {
        this.useralias = useralias;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPersonalPhoto() {
        return personalPhoto;
    }

    public void setPersonalPhoto(String personalPhoto) {
        this.personalPhoto = personalPhoto;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCardIdFrontPhoto() {
        return cardIdFrontPhoto;
    }

    public void setCardIdFrontPhoto(String cardIdFrontPhoto) {
        this.cardIdFrontPhoto = cardIdFrontPhoto;
    }

    public String getCardIdBackPhoto() {
        return cardIdBackPhoto;
    }

    public void setCardIdBackPhoto(String cardIdBackPhoto) {
        this.cardIdBackPhoto = cardIdBackPhoto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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
        return AuthenticationPO.class;
    }
}

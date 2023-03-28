package com.demo.modules.po;

import com.demo.commons.domain.po.PO;

import java.io.Serializable;
import java.util.Date;

public class AccountPO implements Serializable, PO {

    public AccountPO() {
    }

    /**
     * primary key
     */
    private String id;

    /**
     * user name
     */
    private String username;
    /**
     * user real name
     */
    private String useralias;

    /**
     * passwd
     */
    private String password;

    /**
     * mobile phone
     */
    private String phone;

    /**
     * passenger 1, driver 2
     */
    private Integer role;

    /**
     * user avatar
     */
    private String avatar;


    /**
     * status
     * forbidden 0
     * normal 1
     */
    private Integer status;

    /**
     * optimistic lock
     */
    private Integer revision;

    private String createdBy;

    private Date createdTime;


    private String updatedBy;

    private Date updatedTime;

    /**
     * t_account
     */
    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUseralias() {
        return useralias;
    }

    public void setUseralias(String useralias) {
        this.useralias = useralias == null ? null : useralias.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? password : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
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
        return AccountPO.class;
    }
}

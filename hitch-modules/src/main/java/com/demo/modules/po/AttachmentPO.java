package com.demo.modules.po;

import com.demo.commons.domain.po.PO;

import java.io.Serializable;
import java.util.Date;

public class AttachmentPO implements Serializable, PO {


    private String id;
    /**
     * file name
     */
    private String name;
    /**
     * file url
     */
    private String url;
    /**
     * file size
     */
    private long lenght;

    //file extension name
    private String ext;

    //file md5 digest
    private String md5;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getLenght() {
        return lenght;
    }

    public void setLenght(long lenght) {
        this.lenght = lenght;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
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
        return AttachmentPO.class;
    }
}

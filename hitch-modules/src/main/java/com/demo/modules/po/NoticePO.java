package com.demo.modules.po;

import com.demo.commons.domain.po.PO;

import java.io.Serializable;
import java.util.Date;

public class NoticePO implements Serializable, PO {

    private String senderId;

    private String senderUseralias;

    private String receiverId;

    private String receiverUseralias;

    /**
     * passenger trip ID
     */
    private String tripId;

    /**
     * whether has read
     */
    private boolean read = false;


    private String message;

    private Date createdTime;

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getSenderUseralias() {
        return senderUseralias;
    }

    public void setSenderUseralias(String senderUseralias) {
        this.senderUseralias = senderUseralias;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getReceiverUseralias() {
        return receiverUseralias;
    }

    public void setReceiverUseralias(String receiverUseralias) {
        this.receiverUseralias = receiverUseralias;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public Class getVO() {
        return NoticePO.class;
    }
}

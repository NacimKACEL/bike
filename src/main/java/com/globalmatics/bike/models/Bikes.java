package com.globalmatics.bike.models;

import java.math.BigDecimal;
import java.util.Date;

public class Bikes {
    private String name;
    private String email;
    private String phone;
    private String model;
    private String SerialNumber;
    private BigDecimal purshasePrice;
    private Date purshaseDate;
    private boolean isContact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        SerialNumber = serialNumber;
    }

    public BigDecimal getPurshasePrice() {
        return purshasePrice;
    }

    public void setPurshasePrice(BigDecimal purshasePrice) {
        this.purshasePrice = purshasePrice;
    }

    public Date getPurshaseDate() {
        return purshaseDate;
    }

    public void setPurshaseDate(Date purshaseDate) {
        this.purshaseDate = purshaseDate;
    }

    public boolean isContact() {
        return isContact;
    }

    public void setContact(boolean contact) {
        isContact = contact;
    }
}

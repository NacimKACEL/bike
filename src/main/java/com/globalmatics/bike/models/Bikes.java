package com.globalmatics.bike.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Bikes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String model;
    private String SerialNumber;
    private BigDecimal purshasePrice;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;

/**
 *
 * @author anupritadhamale
 */
public class CarDetails {
    private String carName;
    private String carAvailability;
    private String brandName;
    private Date manufacturingYear;
    private int seats;
    private long serialNumber;
    private String modelNumber;
    private String cityName;
    private Date expiredCertificate;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarAvailability() {
        return carAvailability;
    }

    public void setCarAvailability(String carAvailability) {
        this.carAvailability = carAvailability;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Date getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(Date manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Date getExpiredCertificate() {
        return expiredCertificate;
    }

    public void setExpiredCertificate(Date expiredCertificate) {
        this.expiredCertificate = expiredCertificate;
    }
    
    
    @Override
    public String toString(){
        return carName;
    }
    
    
    
}

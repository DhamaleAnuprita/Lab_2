/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;
import javax.swing.JOptionPane;

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
    private String expiredCertificate;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
        if(carName.matches("[a-zA-Z]*")) {
                this.carName = carName;
    }
        else {
            JOptionPane.showMessageDialog(null, "Please enter a valid Car name.");
            }
        
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
        if(brandName.matches("[a-zA-Z]*")) {
                this.brandName = brandName;
    }
        else {
            JOptionPane.showMessageDialog(null, "Please enter a valid Car brand name.");
            }
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
        //String mn = String.valueOf(modelNumber);
        //if(mn.matches("^[0-9]$"))
        //{
         //   this.seats = seats;
        //}
        //else {
        //    JOptionPane.showMessageDialog(null, "Please enter a valid Seat record number.");
        //}
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        
           if(String.valueOf(serialNumber).length() == 5) {
            this.serialNumber = serialNumber;
        }
            else {
        JOptionPane.showMessageDialog(null, "Please enter a valid Serial Number Of length 5.");
           }  
    }
    
    
    

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        
        
        String mn = String.valueOf(modelNumber);
        if(mn.matches("^[0-9]$"))
        {
            this.modelNumber = modelNumber;
        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter a valid Model record number.");
        }
        
        
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
        if(cityName.matches("[a-zA-Z]*")) {
                this.cityName = cityName;
    }
        else {
            JOptionPane.showMessageDialog(null, "Please enter a valid City name.");
            }
    }

    public String getExpiredCertificate() {
        return expiredCertificate;
    }

    public void setExpiredCertificate(String expiredCertificate) {
        this.expiredCertificate = expiredCertificate;
    }
    
    
    @Override
    public String toString(){
        return carName;
    }
    
    
    
}

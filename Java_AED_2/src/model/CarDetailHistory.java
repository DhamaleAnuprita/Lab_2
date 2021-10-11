/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author anupritadhamale
 */
public class CarDetailHistory {
    
    private ArrayList<CarDetails>history;
    
    // ArrayList is actually an object. And for all objects we need to initialise before we start using it 
    
    public CarDetailHistory(){
        
        this.history = new ArrayList<CarDetails>();
    }

    public ArrayList<CarDetails> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<CarDetails> history) {
        this.history = history;
    }
    
    public CarDetails addNewDetails(){
        CarDetails newDetails = new CarDetails();
        history.add(newDetails);
        return newDetails;
    }
    
    public ArrayList<CarDetails> filterByExpiry() {
        ArrayList<CarDetails> list = new ArrayList<>();
        for(CarDetails cd: history) {
            if(cd.getExpiredCertificate().equalsIgnoreCase("yes")) {
                list.add(cd);
            }
        }
        return list;
    }
    
    public ArrayList<CarDetails> filterbyBrandName(String brandName2){
        ArrayList<CarDetails> list= new ArrayList<>();
        for(CarDetails cd : history){
            if(cd.getBrandName().contains(brandName2)){
                list.add(cd);
            }
        }
        return list;
    }
    
    public ArrayList<CarDetails> filterByModelNum(String modelNum) {
         ArrayList<CarDetails> list = new ArrayList<>();
        for(CarDetails cd : history) {
            if(cd.getModelNumber().contains(modelNum)) {
                list.add(cd);
            }
        }
        return list;
    }
    
  
    public ArrayList<CarDetails> filterByCity(String city) {
         ArrayList<CarDetails> list = new ArrayList<>();
        for(CarDetails cd : history) {
            if(cd.getCityName().contains(city)) {
                list.add(cd);
            }
        }
        return list;
    }
            
    
    public ArrayList<CarDetails> filterbySerialNumber(String serialNumber) {
         ArrayList<CarDetails> list = new ArrayList<>();
        for(CarDetails c : history) {
            if(String.valueOf(c.getSerialNumber()).contains(serialNumber.toString())) {
                list.add(c);
            }
        }
        return list;
    }
    
     
    //Confused about the get function and what to do with min max 
     
     
    //Need to make a checkbox and give timestamp  
    
    public ArrayList<CarDetails> filterbyManufacturingYear(String year2){
      ArrayList<CarDetails> list= new ArrayList<>();
        for(CarDetails cd : history){
            if(cd.getManufacturingYear().toString().contains(year2)){
                list.add(cd);
            }
        }
        return list;
    }
    //Correct syntax still an error 
    
    public void deleteCar( CarDetails cd) {
       history.remove(cd);
    }
    
    public void filterByAvailability() {
         int countAvailable, countUnavailable;
         countAvailable = countUnavailable = 0;
         
        for(CarDetails cd : history) {
            if(cd.getCarAvailability().equalsIgnoreCase("yes")) {
                countAvailable++;
            } else if(cd.getCarAvailability().equalsIgnoreCase("no")) {
                countUnavailable++;
         }
        }
        JOptionPane.showMessageDialog(null, "Card Available :" + countAvailable);
        JOptionPane.showMessageDialog(null, "\nCars unavailable :" + countUnavailable);
    }
    
    public ArrayList<CarDetails> filterBySeatCount(String seats) {
        String minSeat = seats.split(" ")[0];
        String maxSeat = seats.split(" ")[1];
        
        ArrayList<CarDetails> list = new ArrayList<>();
        for(CarDetails c : history) {
            int mainCount = Integer.parseInt(String.valueOf(c.getSeats()));
            int count1 = Integer.parseInt(minSeat);      
            int count2 = Integer.parseInt(maxSeat);
            if(mainCount>=count1 && mainCount<=count2) { 
                list.add(c);
            }
        }
        return list;
    }
    
    
//    public ArrayList<CarDetails> filterbyFirstPassengerCar(){
//         ArrayList<CarDetails> list = new ArrayList<>();
//         for(CarDetails cd : history) {
//
//           if(cd.getCarAvailability().equalsIgnoreCase("yes"))
//        {
//               list.add(cd);
//                break;
//         }    
//    }   
//         return list;   
//    }
    
    public ArrayList<CarDetails> filterbyFirstPassengerCar() {
    ArrayList<CarDetails> list = new ArrayList();
    boolean flag = false;

    for(CarDetails cd : history) {
        if (!flag && cd.getCarAvailability().equalsIgnoreCase("yes")) {
            list.add(cd);
            flag = true;
        }
    }
    return list;
}
    
    
    
}

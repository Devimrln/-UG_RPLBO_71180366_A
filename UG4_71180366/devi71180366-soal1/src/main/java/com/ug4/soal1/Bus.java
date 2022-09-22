package com.ug4.soal1;

import java.util.ArrayList;

public class Bus {
    private String name;
    private Driver driver;
    private int capacity = 25;
    private static final ArrayList<Passenger> passenger = new ArrayList<>();
    private int usedCapacity;
    private final double fares = 1000;
    private double profit;
    private String[] ROUTE;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public int getCapacity() {
        return capacity;
    }

    public static ArrayList<Passenger> getPassenger() {
        return passenger;
    }

    public int getUsedCapacity() {
        return usedCapacity;
    }

    public void setUsedCapacity(int capacity){
        if (usedCapacity<capacity){
            this.usedCapacity += usedCapacity;
        }
    }

    public double getFares() {
        return fares;
    }

    public double getProfit() {
        return profit;
    }

    public String[] getRoute() {
        return ROUTE;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public boolean checkPassengerBalance(Passenger passenger){
        boolean status = false;
        if(passenger.getBalance() > getFares() && passenger.getBalance() > 0){
            status = true;
        }
        return status;
    }

    public void topUpBalance(double jumlah, Passenger passenger){
        if (jumlah > 0){
            passenger.setBalance(jumlah);
        }
    }
    public void takePassenger(Passenger passenger){

    }

    public void dropPassengers(String tujuan, Passenger penumpang){
        if (tujuan == penumpang.getDestiny()){
            passenger.clear();
        }
    }
    public void proceedOrder(String name, Passenger passenger){

    }

    public String cancelOrder(Passenger penumpang){
        return penumpang.getName();
    }

    public Bus (String name, Driver driver){
        this.name = name;
        this.driver = driver;
    }
}

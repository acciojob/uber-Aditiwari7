package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int driverId;
    private String mobile;
    private String password;

    public Driver(){}

    public Driver(String moNum, String pswrd){
        this.mobile = moNum;
        this.password = pswrd;
    }

    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
    private List<TripBooking> tripBookingList = new ArrayList<>();

    @ManyToOne
    @JoinColumn
    private Cab cab;

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<TripBooking> getTripBookingList() {
        return tripBookingList;
    }

    public void setTripBookingList(List<TripBooking> tripBookingList) {
        this.tripBookingList = tripBookingList;
    }

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }
}
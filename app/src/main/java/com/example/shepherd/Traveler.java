package com.example.shepherd;

import java.util.List;

public class Traveler {
    private int travelerId;
    private String travelerPrivateName;
    private String travelerLastName;
    private String travelerGender;
    private int travelerAge;
    private List travelerLimits;

    public Traveler(){
        this.travelerId = 999999;
        this.travelerPrivateName = "johan";
        this.travelerLastName = "due";
        this.travelerGender = "MIX";
        this.travelerAge = 50;

    }

    public Traveler(int travelerId, String travelerPrivateName, String travelerLastName, String travelerGender, int travelerAge, List travelerLimits) {
        this.travelerId = travelerId;
        this.travelerPrivateName = travelerPrivateName;
        this.travelerLastName = travelerLastName;
        this.travelerGender = travelerGender;
        this.travelerAge = travelerAge;
        this.travelerLimits = travelerLimits;
    }

    public int getTravelerId() {
        return travelerId;
    }

    public void setTravelerId(int travelerId) {
        this.travelerId = travelerId;
    }

    public String getTravelerPrivateName() {
        return travelerPrivateName;
    }

    public void setTravelerPrivateName(String travelerPrivateName) {
        this.travelerPrivateName = travelerPrivateName;
    }

    public String getTravelerLastName() {
        return travelerLastName;
    }

    public void setTravelerLastName(String travelerLastName) {
        this.travelerLastName = travelerLastName;
    }

    public String getTravelerGender() {
        return travelerGender;
    }

    public void setTravelerGender(String travelerGender) {
        this.travelerGender = travelerGender;
    }

    public int getTravelerAge() {
        return travelerAge;
    }

    public void setTravelerAge(int travelerAge) {
        this.travelerAge = travelerAge;
    }

    public List getTravelerLimits() {
        return travelerLimits;
    }

    public void setTravelerLimits(List travelerLimits) {
        this.travelerLimits = travelerLimits;
    }
}

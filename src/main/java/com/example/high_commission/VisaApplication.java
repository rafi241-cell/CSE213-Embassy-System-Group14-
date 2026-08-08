package com.example.high_commission;

import java.time.LocalDate;

public class VisaApplication {
    private int id;
    private String fullName;
    private String passportNumber;
    private String visaType;
    private String nationality;
    private LocalDate travelDate;
    private String status;

    public VisaApplication(int id, String fullName, String passportNumber, String visaType, String nationality, LocalDate travelDate, String status) {
        this.id = id;
        this.fullName = fullName;
        this.passportNumber = passportNumber;
        this.visaType = visaType;
        this.nationality = nationality;
        this.travelDate = travelDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getVisaType() {
        return visaType;
    }

    public void setVisaType(String visaType) {
        this.visaType = visaType;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public LocalDate getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(LocalDate travelDate) {
        this.travelDate = travelDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "VisaApplication{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", visaType='" + visaType + '\'' +
                ", Nationality='" + nationality + '\'' +
                ", travelDate=" + travelDate +
                ", status='" + status + '\'' +
                '}';
    }
}

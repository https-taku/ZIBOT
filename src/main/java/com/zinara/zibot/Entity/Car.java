package com.zinara.zibot.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table("car_dataset")
public class Car {

    // Getters and Setters
    @Id

        private String numberPlate;
        private String name;
        private int year;
        private int kmDriven;
        private String fuel;
        private String transmission;
        private String owner;
        private String mileage;
        private String engine;
        private Float seats;

    public void setNumberPlate(String numberPlate) {
            this.numberPlate = numberPlate;
        }

    public void setName(String name) {
            this.name = name;
        }

    public void setYear(int year) {
            this.year = year;
        }

    public void setKmDriven(int kmDriven) {
            this.kmDriven = kmDriven;
        }

    public void setFuel(String fuel) {
            this.fuel = fuel;
        }

    public void setTransmission(String transmission) {
            this.transmission = transmission;
        }

    public void setOwner(String owner) {
            this.owner = owner;
        }

    public void setMileage(String mileage) {
            this.mileage = mileage;
        }

    public void setEngine(String engine) {
            this.engine = engine;
        }

    public void setSeats(Float seats) {
            this.seats = seats;
        }
    }



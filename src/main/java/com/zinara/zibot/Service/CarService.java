package com.zinara.zibot.Service;
import com.zinara.zibot.Entity.Car;
import com.zinara.zibot.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


    @Service
    public class CarService {

        @Autowired
        private CarRepository carRepository;

        public Car getCarByNumberPlate(String numberPlate) {
            return carRepository.findByNumberPlate(numberPlate);
        }
    }


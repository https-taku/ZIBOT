package com.zinara.zibot.Controller;

import com.zinara.zibot.Entity.Car;
import com.zinara.zibot.Service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;


    @RestController
    @RequestMapping("/car")
    public class CarController {

        @Autowired
        private CarService carService;

        @GetMapping("/greet")
        public String greet() {
            return "Hello! How can I assist you today?";
        }

        @GetMapping("/options")
        public String getOptions() {
            return "1. Search by Number Plate\n2. Exit";
        }
        // Endpoint to search by number plate

        @GetMapping("/search/{numberPlate}")
        public Car searchCarByNumberPlate(@PathVariable String numberPlate) {
            return carService.getCarByNumberPlate(numberPlate);
        }
    }



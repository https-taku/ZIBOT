package com.zinara.zibot.Repository;

import com.zinara.zibot.Entity.Car;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, String> {
    // Custom query to find a car by its number plate
    @Query("SELECT * FROM car_dataset WHERE number_plate = :numberPlate")
    Car findByNumberPlate(@Param("numberPlate") String numberPlate);
}

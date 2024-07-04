package com.yourpackage.services;

import com.yourpackage.dao.CarDAO;
import com.yourpackage.entities.Car;
import java.util.List;

public class CarService {
    private CarDAO carDAO = new CarDAO();

    public void addCar(Car car) {
        carDAO.addCar(car);
    }

    public void updateCar(Car car) {
        carDAO.updateCar(car);
    }

    public void deleteCar(int id) {
        carDAO.deleteCar(id);
    }

    public List<Car> getAllCars() {
        return carDAO.getAllCars();
    }
}

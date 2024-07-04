package com.yourpackage.ui;

import com.yourpackage.entities.Car;
import com.yourpackage.services.CarService;
import java.util.Scanner;

public class CarUI {
    private CarService carService = new CarService();
    private Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        while (true) {
            System.out.println("1. Add Car");
            System.out.println("2. Update Car");
            System.out.println("3. Delete Car");
            System.out.println("4. List Cars");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    addCar();
                    break;
                case 2:
                    updateCar();
                    break;
                case 3:
                    deleteCar();
                    break;
                case 4:
                    listCars();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addCar() {
        System.out.println("Enter car details:");

        System.out.println("Brand: ");
        String brand = scanner.nextLine();

        System.out.println("Model: ");
        String model = scanner.nextLine();

        System.out.println("Plate: ");
        String plate = scanner.nextLine();

        System.out.println("Color: ");
        String color = scanner.nextLine();

        System.out.println("Mileage: ");
        int mileage = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Fuel Type: ");
        String fuelType = scanner.nextLine();

        System.out.println("Gear Type: ");
        String gearType = scanner.nextLine();

        Car car = new Car();
        // Set car attributes here

        carService.addCar(car);
        System.out.println("Car added successfully.");
    }

    private void updateCar() {
        // Update car logic
    }

    private void deleteCar() {
        // Delete car logic
    }

    private void listCars() {
        // List cars logic
    }
}

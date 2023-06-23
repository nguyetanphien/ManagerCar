package model;

import java.util.Scanner;

public class Over200cc extends Vehicle {


    private int VehicleDisplacement;

    public Over200cc() {
    }

    public Over200cc(String fullName, int age, String phoneNumber, String email, double carPrice, int vehicleDisplacement) {
        super(fullName, age, phoneNumber, email, carPrice);
        VehicleDisplacement = vehicleDisplacement;
    }

    public int getVehicleDisplacement() {
        return VehicleDisplacement;
    }

    public void setVehicleDisplacement(int vehicleDisplacement) {
        VehicleDisplacement = vehicleDisplacement;
    }

    @Override
    public void input(Scanner scanner) {
        super.input(scanner);
        System.out.printf("VehicleDisplacement");
        setVehicleDisplacement(scanner.nextInt());
    }

    @Override
    public double taxPayable() {
        return getCarPrice() * 0.05;
    }

    public String toString() {
        return "Over200cc{" + super.toString() + " " + " VehicleDisplacement " + getVehicleDisplacement() +
                " taxPayable " + taxPayable() +
                '}';
    }
}

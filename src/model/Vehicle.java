package model;

import java.util.Scanner;

public abstract class Vehicle {
    private String code;
    private String fullName;
    private int age;
    private String phoneNumber;
    private String email;
    private double carPrice;

    public Vehicle() {
    }

    public Vehicle(String fullName, int age, String phoneNumber, String email, double carPrice) {
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.carPrice = carPrice;

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }


    public void input(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Employee Code:  ");
        setCode(scanner.nextLine());

        System.out.printf("Full Name: ");
        setFullName(scanner.nextLine());
        System.out.printf("Age: ");
        setAge(scanner.nextInt());
        scanner.nextLine();

        System.out.printf("Phone number: ");
        phoneNumber = scanner.nextLine();

        System.out.printf("Email: ");
        setEmail(scanner.nextLine());
        System.out.printf("Car price: ");
        setCarPrice(scanner.nextDouble());

    }


    @Override
    public String toString() {
        return
                "code='" + code + '\'' +
                        ", fullName='" + fullName + '\'' +
                        ", age=" + age +
                        ", phoneNumber='" + phoneNumber + '\'' +
                        ", email='" + email + '\'' +
                        ", carPrice=" + carPrice
                ;
    }

    public abstract double taxPayable();
}

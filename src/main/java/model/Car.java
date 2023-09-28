package model;

import java.util.Objects;

public class Car {

    private String model;
    private int topSpeed;
    private String serialNumber;

    public Car(String model, int topSpeed, String serialNumber) {
        this.model = model;
        this.topSpeed = topSpeed;
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return topSpeed == car.topSpeed && Objects.equals(model, car.model) && Objects.equals(serialNumber, car.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, topSpeed, serialNumber);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", topSpeed=" + topSpeed +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}

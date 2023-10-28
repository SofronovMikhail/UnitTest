package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

    @Test
    public void carInstanceOfVehicle() {
        Car car = new Car(null, null, 0);
        assertEquals(car instanceof Vehicle, true);
    }

    @Test
    public void carCountWheel() {
        Car car = new Car(null, null, 0);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void motorcycleCountWheel() {
        Motorcycle motorcycle = new Motorcycle(null, null, 0);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void carSpeedTestDrive() {
        Car car = new Car(null, null, 0);
        car.testDrive();
        assertEquals(60, car.getSpeed());

    }

    @Test
    public void motorcycleSpeedTestDrive() {
        Motorcycle motorcycle = new Motorcycle(null, null, 0);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void carSpeedPark() {
        Car car = new Car(null, null, 0);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void motorcycleSpeedPark() {
        Motorcycle motorcycle = new Motorcycle(null, null, 0);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }

}

package com.ericbouchut.polymorphism;

public class InterfacePolymorphism {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();

        vehicle.start();
    }
}

/**
 * The use cases for an Interface is to define a contract (a set of methods)
 *
 */
interface Vehicle {
    void start();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Vroom vroom");
    }
}

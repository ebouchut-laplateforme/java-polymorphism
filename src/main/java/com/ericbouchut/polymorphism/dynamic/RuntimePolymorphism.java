package com.ericbouchut.polymorphism.dynamic;

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal animal = new Dog();

        /*
         * The (abstract) base class Animal declared the sound method.
         * Subclasses of Animal (Dog and Cat) should **define** this method.
         *
         * The JVM then decides which `sound` method to call depending on the type/class of the intance it is called on.
         */
        animal.sound();
    }
}

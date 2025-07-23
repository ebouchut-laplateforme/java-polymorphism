package com.ericbouchut.polymorphism.dynamic;

/**
 * This abstract class **declares** the <code>sound</code> method
 * but does not provide its implementation.
 *
 * Subclasses extending the abstract <code>Animal</code> class
 * should <b>define</b> this method to make the class concrete.
 *
 * Do note that the <code>sournd</code> method will be overriden
 * in two subclasses (<code>Dog</code>, <code>Cat</code>)
 * with the very same signature.
 *
 * At <b>Runtime</b>, the JVM will use "runtime/dynamic" polymorphism to decice which one to call
 * depending on the class of the object/instance it is called on.
 */
public abstract class Animal {
    public abstract void sound();
}

class Dog extends Animal {
    /**
     * The <code>Dog</code> specific implementation for the <code>sound</code> method.
     */
    @Override
    public void sound() {
        System.out.println(" Wow");
    }
}

class Cat extends Animal {
    /**
     * Provide the implementation for the <code>sound</code> method
     * This emthod has been declared in the super (mother) class (<code>Animal</code>).
     * It is now defined for <code>Animal</code> of kind <code>Cat</code>.
     */
    @Override
    public void sound() {
        System.out.println("Purr");
    }
}

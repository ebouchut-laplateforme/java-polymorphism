package com.ericbouchut.polymorphism.lab.dao;

/**
 * This abstract class provides:
 * - a constructor
 * - a few concrete (helper) methods
 * - does NOT define the Persistable abstract methods
 *
 * Subclasses will have to define the methods declared in <code>Peristable</code>.
 */
public abstract class AbstractDAO implements Persistable {

    /**
     * Perform the common initialization here,
     * shared among DAO concrete implementations.
     */
    public AbstractDAO() {
        // Common shared initialization here
    }

    // Add other constructors with connection parameters
    // or instead use a dedicated class to hold the "zillion" params

    // Add the common/shared concrete methods
}

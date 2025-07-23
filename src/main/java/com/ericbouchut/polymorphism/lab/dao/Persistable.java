package com.ericbouchut.polymorphism.lab.dao;

/**
 * The contract (i.e., methods) that classes implementing
 * this interface should implement.
 */
public interface Persistable {
    boolean save();
    boolean update();
    boolean delete();
}

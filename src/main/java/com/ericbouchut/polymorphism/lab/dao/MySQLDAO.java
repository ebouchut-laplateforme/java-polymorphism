package com.ericbouchut.polymorphism.lab.dao;

public class MySQLDAO extends AbstractDAO {
    @Override
    public boolean save() {
        System.out.println("MySQLDAO save called");
        // TODO: save
        return false;
    }

    @Override
    public boolean update() {
        System.out.println("MySQLDAO update called");
        // TODO: Update...
        return false;
    }

    @Override
    public boolean delete() {
        System.out.println("MySQLDAO delete called");
        // TODO: delete...
        return false;
    }
}

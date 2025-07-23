package com.ericbouchut.polymorphism.lab.dao;

public class PostgreSQLDAO extends AbstractDAO {
    @Override
    public boolean save() {
        System.out.println("PostgreSQLDAO.save called");
        // TODO: save...
        return false;
    }

    @Override
    public boolean update() {
        System.out.println("PostgreSQLDAO.update called");
        // TODO: update...
        return false;
    }

    @Override
    public boolean delete() {
        System.out.println("PostgreSQLDAO.delete called");
        // TODO: delete...
        return false;
    }
}

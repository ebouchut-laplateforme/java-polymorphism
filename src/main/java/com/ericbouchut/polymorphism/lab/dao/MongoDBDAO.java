package com.ericbouchut.polymorphism.lab.dao;

public class MongoDBDAO extends AbstractDAO {
    @Override
    public boolean save() {
        System.out.println("MongoDBDAO.save called");
        // TODO: save...
        return false;
    }

    @Override
    public boolean update() {
        System.out.println("MongoDBDAO.update called");
        // TODO: update....
        return false;
    }

    @Override
    public boolean delete() {
        System.out.println("MongoDBDAO.delete called");
        // TODO: delete...
        return false;
    }
}

package com.ericbouchut.polymorphism.lab.dao;

public class Main {
    public static void main(String[] args) {
        Persistable persistable = new PostgreSQLDAO();

        persistable.save();
        persistable.update();
        persistable.delete();
    }
}

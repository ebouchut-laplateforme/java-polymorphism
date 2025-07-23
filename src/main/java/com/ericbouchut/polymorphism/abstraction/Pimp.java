package com.ericbouchut.polymorphism.abstraction;

public abstract class Pimp implements Mafia{
    private double money;

    public Pimp(double money) {
        this.money = money;
    }

    @Override
    public double reimburse() {
        return bringMoney();
    }

    /**
     * The Pimp (proxénète) **declares** this method here,
     * meaning it does not provide a body but only its signature.
     * The Pimp will force its subclasses to implement this method
     * (that is, define and provide a body) and ... bring him the money, of course.
     */
    public abstract double bringMoney();
}
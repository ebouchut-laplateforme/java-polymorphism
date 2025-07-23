package com.ericbouchut.polymorphism.abstraction;

public class Victim extends Pimp {

    public Victim(double money) {
        super(money);
    }

    public void work() {
        // TODO: money += 2_000; // <==> money = money + 2_000;
    }

    public double bringMoney() {
        //TODO: money -= 2_000;
        return 2_000;
    }
}
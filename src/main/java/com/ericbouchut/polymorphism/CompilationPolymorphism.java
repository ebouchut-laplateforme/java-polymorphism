package com.ericbouchut.polymorphism;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CompilationPolymorphism {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(" 1 + 3 = " + calculator.add(1, 3));
        System.out.println(" 1.23 + 4.56 = " + calculator.add(1.23, 4.56));
    }

}
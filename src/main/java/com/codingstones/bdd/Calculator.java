package com.codingstones.bdd;

public class Calculator {
    private int value;
    public void sum(int aNumber, int anotherNumber){
        value = aNumber + anotherNumber;
    }
    public void substract(int aNumber, int anotherNumber) {
        value = aNumber - anotherNumber;
    }

    public int currentValue(){
        return value;
    }
}

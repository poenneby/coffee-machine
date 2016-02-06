package com.onneby.coffee.model;

public abstract class Drink {
    private int numberOfSugars;

    public Drink withSugar(int numberOfSugars) {
        this.numberOfSugars = numberOfSugars;
        return this;
    }

    public boolean hasSugar() {
        return this.numberOfSugars > 0;
    }

    public int getNumberOfSugars() {
        return numberOfSugars;
    }
}
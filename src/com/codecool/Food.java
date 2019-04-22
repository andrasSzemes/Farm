package com.codecool;

public enum Food {
    Spruce, Almond, Juniper;

    private int amount = 0;

    public void add(int num) {
        amount += num;
    }

    public static String getAmountOfAll() {
        return Spruce.toString() + Almond.toString() + Juniper.toString();
    }
}

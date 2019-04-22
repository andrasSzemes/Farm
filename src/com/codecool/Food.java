package com.codecool;

public enum Food {
    Spruce, Almond, Juniper;

    private int amount = 0;

    public void add(int num) {
        amount += num;
    }

    public static void getAmountOfAll() {
        System.out.println("Spruce: " + Spruce.amount + ", Almond: " + Almond.amount + ", Juniper: " + Juniper.amount);
    }
}

package com.codecool;

import java.util.*;

/**
 *  If any plant rots, no food is produced that month at all.
 */
public abstract class Plant {
    protected int amountToProduce;
    protected Food foodType;
    protected double chanceToRot;

    private static boolean anyRottenPlant;

    /**
     * Specified month data for anyRottenPlant assignation.
     */
    private static int monthToCheck = 0;

    /**
     * Calculated in months
     */
    protected int age = 0;

    protected abstract void boostHarvest();

    protected abstract void reduceHarvest();

    protected abstract boolean isRotten();

    public void grow() {
        baseBoost();
        if (this.isRotten()) {
            rotOtherPlants();
            reduceHarvest();
        }
        else {
            boostHarvest();
        }
    }

    public void harvest() {
        if (!anyRottenPlant) {
            this.foodType.add(amountToProduce);
        }
    }

    private void rotOtherPlants() {
        if (monthToCheck < this.age) {
            monthToCheck++;
            anyRottenPlant = true;
        }
        else if (monthToCheck == this.age) {
        }
        else {
            System.out.println("Error in rotten check");
        }
    }

    private void baseBoost() {
        amountToProduce += 4;
    }
}

package com.codecool;

import java.util.*;

/**
 *  If any plant rots, no food is produced that month at all.
 *
 *  Shroom growing always happens first!
 */
public abstract class Plant {
    protected int amountToProduce;
    protected Food foodType;
    protected double chanceToRot;
    protected double chanceShroomBoost;

    private static boolean anyRottenPlant;
    private static int plantCounter = 0;

    /**
     * Specified month data for anyRottenPlant assignation.
     */
    private static int monthToCheck = 0;

    /**
     * Calculated in months
     */
    protected int age = 0;

    protected void boostHarvest() {
        amountToProduce += 4;
    }

    protected abstract void reduceHarvest();

    protected boolean isRotten() {
        return Math.random() < chanceToRot;
    }

    public void grow() {
        if (plantCounter == 0) { anyRottenPlant = false; }

        age++;
        plantCounter++;
        boostHarvest();
        if (this.isRotten()) {
            rotOtherPlants();
            reduceHarvest();
        }
    }

    public void harvest() {
        plantCounter--;
        if (!anyRottenPlant) {
            this.foodType.add(amountToProduce);
        }
    }

    private void rotOtherPlants() {
        if (monthToCheck < this.age) {
            monthToCheck = this.age;
            anyRottenPlant = true;
        }
        else if (monthToCheck == this.age) {
        }
        else {
            System.out.println("Error in rotten check");
        }
    }
}

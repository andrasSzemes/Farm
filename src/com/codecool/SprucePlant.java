package com.codecool;

import java.util.ArrayList;
import java.util.List;

/**
 * Spruces is an evergreen, can grow leaves by their own every 5 months, increasing its production by 8
 * Max production can be 70, at that point they speak and say "<Name> at full production!".
 * Can grow a shroom every month, which have a 5% chance that boosts the production by 15 spruce
 * Can rot every month with a chance of 4% which reduces their production by 20 spruce
 */
public class SprucePlant extends Plant {

    public SprucePlant() {
        this.amountToProduce = 26;
        this.chanceToRot = 0.04;
        this.chanceShroomBoost = 0.05;
        this.foodType = Food.Spruce;
    }

    @Override
    public void boostHarvest() {
        super.boostHarvest();

        if (age % 5 == 0) { amountToProduce += 8; }

        if (Math.random() < chanceShroomBoost) { amountToProduce += 15; }

        if (amountToProduce > 70) {
            amountToProduce = 70;
            System.out.println("Spruce at full production!");
        }
    }

    @Override
    public void reduceHarvest() {
        amountToProduce -= 20;
    }
}

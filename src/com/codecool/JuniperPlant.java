package com.codecool;

/**
 * Juniper is an evergreen, can grow leaves by their own every 5 months, increasing its production by 8
 * Max production can be 70, at that point they speak and say "<Name> at full production!".
 */
public class JuniperPlant extends Plant {

    public JuniperPlant() {
        this.amountToProduce = 14;
        this.chanceToRot = 0;
        this.chanceShroomBoost = 0;
        this.foodType = Food.Juniper;
    }

    @Override
    protected void boostHarvest() {
        super.boostHarvest();

        if (age % 5 == 0) { amountToProduce += 8; }

        if (amountToProduce > 70) {
            amountToProduce = 70;
            System.out.println("Juniper at full production!");
        }
    }

    @Override
    protected void reduceHarvest() {

    }
}

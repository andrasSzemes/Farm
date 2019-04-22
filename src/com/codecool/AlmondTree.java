package com.codecool;

/**
 * When their production falls below 40, it is doubled!
 * Can grow a shroom every month, which have a 8% chance that boosts the production by 10 almond
 * Can rot every month with a chance of 13% which reduces their production by 18 almond
 */
public class AlmondTree extends Plant {

    public AlmondTree() {
        this.amountToProduce = 50;
        this.chanceToRot = 0.13;
        this.chanceShroomBoost = 0.08;
        this.foodType = Food.Almond;
    }

    @Override
    protected void boostHarvest() {
        super.boostHarvest();
        if (Math.random() < chanceShroomBoost) {
            amountToProduce += 10;
        }
    }

    @Override
    protected void reduceHarvest() {
        amountToProduce -= 18;

        if (amountToProduce < 40) {
            amountToProduce *= 2;
        }
    }
}

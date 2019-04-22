package com.codecool;

/**
 * When their production falls below 40, it is doubled!
 * Can grow a shroom every month, which have a 8% chance that boosts the production by 10 almond
 * Can rot every month with a chance of 13% which reduces their production by 18 almond
 *
 * Shroom growing always happens first!
 */
public class AlmondTree extends Plant {
    @Override
    protected void boostHarvest() {

    }

    @Override
    protected void reduceHarvest() {

    }

    @Override
    protected boolean isRotten() {
        return false;
    }
}

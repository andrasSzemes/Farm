package com.codecool;

/**
 * Juniper is an evergreen, can grow leaves by their own every 5 months, increasing its production by 8
 * Max production can be 70, at that point they speak and say "<Name> at full production!".
 */
public class JuniperPlant extends Plant {
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

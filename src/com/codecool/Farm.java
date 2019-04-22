package com.codecool;

import java.util.*;

/**
 * At least 2 of every plant type is present.
 *
 * What is the production total on the farm after 80 months?
 */
public class Farm {
    private List<Plant> plants = new ArrayList<Plant>();
    private int totalMonths = 80;

    private void addPlants(int numOfAlmond, int numOfSpruce, int numOfJuniper) {
        for (int i=0; i< numOfAlmond; i++) { plants.add(new AlmondTree()); }
        for (int i=0; i< numOfSpruce; i++) { plants.add(new SprucePlant()); }
        for (int i=0; i< numOfJuniper; i++) { plants.add(new JuniperPlant()); }
    }

    private void waitForAMonth() {
        for (Plant plant : plants) {
            plant.grow();
        }
    }

    private void harvestPlants() {
        for (Plant plant : plants) {
            plant.harvest();
        }
    }

    public static void main(String[] args) {
        Farm farm = new Farm();
        farm.addPlants(2, 2, 2);

        for (int i=0; i<farm.totalMonths; i++) {
            farm.waitForAMonth();
            farm.harvestPlants();
        }

        Food.getAmountOfAll();
    }
}

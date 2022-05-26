package com.company;

public class Bicycle extends Transport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check(Transport transport) {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}
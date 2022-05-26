package com.company;

public class Car extends Transport implements hasEngine{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check(Transport transport) {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
        checkEngine();
    }
}

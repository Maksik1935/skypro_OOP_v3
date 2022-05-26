package com.company;

public interface hasEngine {
    default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}

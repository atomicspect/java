package com.test4;

public class Cat implements Animal{
    @Override
    public void cry() {
        System.out.println("������");
    }

    @Override
    public String getAnimalName() {
        System.out.println("è");
        return null;
    }
}

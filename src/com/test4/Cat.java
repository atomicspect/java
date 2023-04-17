package com.test4;

public class Cat implements Animal{
    @Override
    public void cry() {
        System.out.println("ίχίχίχ");
    }

    @Override
    public String getAnimalName() {
        System.out.println("Γ¨");
        return null;
    }
}

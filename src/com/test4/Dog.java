package com.test4;

public class Dog implements Animal{
    @Override
    public void cry() {
        System.out.println("อ๔อ๔อ๔");
    }

    @Override
    public String getAnimalName() {
        System.out.println("นท");
        return null;
    }
}

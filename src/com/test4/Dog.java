package com.test4;

public class Dog implements Animal{
    @Override
    public void cry() {
        System.out.println("������");
    }

    @Override
    public String getAnimalName() {
        System.out.println("��");
        return null;
    }
}

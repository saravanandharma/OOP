package com.oop;

public class StandardMemory implements Memory {

    private String brand;
    private String size;

    public StandardMemory(String brand, String size) {
        this.brand = brand;
        this.size = size;
    }



    @Override
    public String getBrand() {
        return null;
    }

    @Override
    public String getSize() {
        return null;
    }

    @Override
    public String toString() {
        return "StandardMemory{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

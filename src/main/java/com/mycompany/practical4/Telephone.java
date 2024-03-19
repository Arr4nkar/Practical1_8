/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical4;

/**
 *
 * @author gnekh
 */
class Telephone {
    private String model;
    private String serialNumber;
    private String color;
    private boolean isMobile;

    public Telephone(String model, String serialNumber, String color, boolean isMobile) {
        this.model = model;
        this.serialNumber = serialNumber;
        this.color = color;
        this.isMobile = isMobile;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return model + ", " + serialNumber + ", " + color + ", " + isMobile;
    }
}

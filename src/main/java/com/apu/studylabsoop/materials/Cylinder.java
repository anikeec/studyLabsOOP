/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apu.studylabsoop.materials;

/**
 *
 * @author apu
 */
public class Cylinder extends AbstractForm{
    private final float length;
    private final float diameter;

    public Cylinder(Wood wood, float length, float diameter) {
        if((length < 0) || (length == 0))
            throw new IllegalArgumentException("Error length");
        if((diameter < 0) || (diameter == 0))
            throw new IllegalArgumentException("Error diameter");
        this.wood = wood;
        this.length = length;
        this.diameter = diameter;
    }

    public float getLength() {
        return length;
    }

    public float getDiameter() {
        return diameter;
    }

    @Override
    public float volume() {
        return (float) (Math.PI * Math.pow(diameter / 2, 2) * length);
    }

    @Override
    public String toString() {
        return "Cylinder [wood=" + wood.getName() + ", weight()=" + weight() + "]";
    }

}

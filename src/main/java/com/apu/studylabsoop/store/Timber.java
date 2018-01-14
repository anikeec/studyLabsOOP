/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apu.studylabsoop.store;

/**
 *
 * @author apu
 */
public class Timber {
    private final Wood wood;
    private final float length;
    private final float height;
    private final float width;
    
    public Timber(Wood wood, float length, float height, float width) {
        this.wood = wood;
        this.length = length;
        this.height = height;
        this.width = width;
    }
    
    public Wood getWood() {
        return wood;
    }
    
    public float getLength() {
        return length;
    }
    
    public float getHeight() {
        return height;
    }
    
    public float getWidth() {
        return width;
    }
    
    public float volume() {
        return length * height * width;
    }
    
    public float weight() {
        return wood.getDensity() * volume();
    }
    
    @Override
    public String toString() {
        return "Timber [Name = " + wood.getName() + ", Weight = " + weight() + "]";
    }

}

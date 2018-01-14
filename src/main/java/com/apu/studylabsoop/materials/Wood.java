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
public class Wood {
    private final int id;
    private final String name;
    private final float density;
    static int currentId = 0;
    
    public Wood(String name, float density) {
        this(currentId++, name, density);
    }
    
    public Wood(int id, String name, float density) {
            this.id = id;
            this.name = name;
            this.density = density;
    }
    
    public int getId() {
            return id;
    }
    
    public String getName() {
            return name;
    }
    
    public float getDensity() {
            return density;
    }
    
    @Override
    public String toString() {
            return "Wood [Id = " + id + ", Name = " + name + ", Density = " + density + "]";
    }

}

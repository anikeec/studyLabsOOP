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
public class Waste implements IWeight {
    private float weight;
	
    public float getWeight() {
        return weight;
    }

    public Waste(float weight) {
        if((weight < 0) || (weight == 0))
            throw new IllegalArgumentException("Error weight");
        this.weight = weight;
    }

    @Override
    public float weight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Waste [Weight = " + weight() + "]";
    }

}

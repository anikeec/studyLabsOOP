/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apu.studylabsoop.store;

import java.util.Arrays;

/**
 *
 * @author apu
 */
public class ProductStore {
    private Timber[] arr = new Timber[3];
    private int count = 0;
    
    public Timber[] getTimbers() {
        return Arrays.copyOf(arr, count);
    }
    
    public void add(Timber newTimber) {
        if (arr.length == count) {
            arr = Arrays.copyOf(arr, count +count/2);
        }
        arr[count++] = newTimber;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Timber directory:\n");
        for (int i = 0; i < count; i++) {
            sb.append(arr[i]).append("\n");
        }
        return sb .toString();
    }

}

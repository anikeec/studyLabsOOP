/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apu.studylabsoop.store;

import com.apu.studylabsoop.materials.Wood;
import java.util.Arrays;

/**
 *
 * @author apu
 */
public class WoodDirectory {
    private Wood[] arr = new Wood[3];    
    
    private int count = 0;
    {
        arr[0] = new Wood("Larch", 1.1f);
        arr[1] = new Wood("Spruce", 0.9f);
        arr[2] = new Wood("Pine", 0.7f);
        count = 3;
    }
    
    public Wood[] getWoods() {
            return Arrays.copyOf(arr, count);
    }
    
    public Wood get(int id) {
        for (int i = 0; i < count; i++) {
            if (arr[i].getId() == id) {
                return arr[i];
            }
        }
        return null;
    }
    
    public boolean add(Wood newWood) {
        if (get(newWood.getId()) != null) {
            return false;
        }
        if (arr.length == count) {
            arr = Arrays.copyOf(arr, count +count/2);
        }
        arr[count++] = newWood;
        return true;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder("Wood directory:\n");
        for (int i = 0; i < count; i++) {
                sb.append(arr[i]).append("\n");
        }
        return sb .toString();
    }

}

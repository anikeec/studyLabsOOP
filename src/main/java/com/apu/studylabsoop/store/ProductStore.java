/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apu.studylabsoop.store;

import com.apu.studylabsoop.materials.IWeight;
import java.util.Arrays;

/**
 *
 * @author apu
 */
public class ProductStore extends AbstractStore {
    
    public void add(IWeight newElement) {
        super.add(newElement);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Product Store:\n");
        sb.append(super.toString());
        return sb .toString();
    }

}

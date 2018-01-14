/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apu.studylabsoop.materials;

import com.apu.studylabsoop.materials.Wood;

/**
 *
 * @author apu
 */
public abstract class AbstractForm implements IWeight {
    public abstract float volume();
    protected Wood wood;

    public AbstractForm() {
        super();
    }

    public Wood getWood() {
        return wood;
    }

    @Override
    public float weight() {
        return wood.getDensity() * volume();
    }

}

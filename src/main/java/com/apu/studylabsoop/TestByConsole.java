/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apu.studylabsoop;

import com.apu.studylabsoop.materials.AbstractForm;
import com.apu.studylabsoop.materials.IWeight;
import com.apu.studylabsoop.store.ProductStore;
import com.apu.studylabsoop.materials.Timber;
import com.apu.studylabsoop.materials.Waste;
import com.apu.studylabsoop.materials.Wood;
import com.apu.studylabsoop.store.WoodDirectory;
import com.apu.studylabsoop.utils.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**
 *
 * @author apu
 */
public class TestByConsole {
    
    private static final Log log = Log.getInstance();
    private static final Class classname = TestByConsole.class;
    BufferedReader reader = 
                new BufferedReader(new InputStreamReader(System.in));
    WoodDirectory woodDirectory = new WoodDirectory();
    ProductStore productStore = new ProductStore();
    
    public void start() {        
        String[] menuItems = new String[5];
        menuItems[0] = "1. Add wood.";
	menuItems[1] = "2. Add timber.";
        menuItems[2] = "3. Add waste.";
	menuItems[3] = "4. Calculate sum weight.";
	menuItems[4] = "5. Exit.";
        String menuHeader = "Select operation and enter number:";

        while(true) {
            System.out.println(menuHeader);
            for(String item:menuItems) {
                System.out.println(item);
            }
            String readValue;
            int readValueInt;
            try {
                readValue = reader.readLine();
                readValueInt = Integer.parseInt(readValue);
            } catch (IOException ex) {
                log.debug(classname,ExceptionUtils.getStackTrace(ex));
                continue;
            }
            if(readValue.equals("")) {
                continue;
            }
            switch(readValueInt) {
                case 1:
                        addWood();
                        break;
                case 2:
                        addTimber();
                        break;
                case 3:
                        addWaste();
                        break;
                case 4:
                        calculateSumWeight();
                        break;
                case 5:
                        return;
                default:
                        continue;
//                        break;
            }
        }
        
    }
    
    private void addWood() { 
        String readStr;
        try {
            System.out.println("Enter name(String) for new wood:");
            String woodName = reader.readLine();
            System.out.println("Enter density(float) for new wood:");
            readStr = reader.readLine();
            Float woodDensity = Float.parseFloat(readStr);
            Wood wood = new Wood(woodName, woodDensity);
            woodDirectory.add(wood);
            System.out.println("New wood: " + wood.toString());
        } catch (IOException ex) {
            log.debug(classname,ExceptionUtils.getStackTrace(ex));
        }
    }
    
    private void addTimber() {
        System.out.println("Available woods:");
        for(Wood wood:woodDirectory.getWoods()) {
            System.out.println(wood.toString());
        }
        System.out.println();
        String readStr;
        try {
            System.out.println("Enter wood id(Integer) for new timber:");
            readStr = reader.readLine();
            Integer woodId = Integer.parseInt(readStr);
            System.out.println("Enter length(float) for new timber:");
            readStr = reader.readLine();
            Float length = Float.parseFloat(readStr);
            System.out.println("Enter height(float) for new timber:");
            readStr = reader.readLine();
            Float height = Float.parseFloat(readStr);
            System.out.println("Enter width(float) for new timber:");
            readStr = reader.readLine();
            Float width = Float.parseFloat(readStr);
            Timber timber = new Timber(woodDirectory.get(woodId),
                                        length, 
                                        height, 
                                        width);
            productStore.add(timber);
            System.out.println("New timber: " + timber.toString());
        } catch (IOException ex) {
            log.debug(classname,ExceptionUtils.getStackTrace(ex));
        }
    }
    
    private void addWaste() { 
        String readStr;
        try {
            System.out.println("Enter weight(float) for new waste:");
            readStr = reader.readLine();
            Float weight = Float.parseFloat(readStr);
            Waste waste = new Waste(weight);
            productStore.add(waste);
            System.out.println("New waste: " + waste.toString());
        } catch (IOException ex) {
            log.debug(classname,ExceptionUtils.getStackTrace(ex));
        }
    }
    
    private void calculateSumWeight() {
        System.out.println("Available timbers:");
        Float summ = new Float(0);
        for(Object form:productStore.getArr()) {
            System.out.println(form.toString());
            if(form instanceof IWeight)
                summ += ((IWeight)form).weight();
        }
        System.out.println("Summary weight :" + summ);
    }
    
}

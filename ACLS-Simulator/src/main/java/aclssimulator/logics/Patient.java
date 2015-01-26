/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aclssimulator.logics;

import java.util.*;

/**
 *
 * @author okesokes
 */

// Early WIP

// Lacks getter & setter methods!!

public class Patient {

    private int age;
    private int weightKg;
    private int heightCm;
    // Body temperature is measured in degrees Celsius (°C)
    private int bodyTemperature;
    private boolean isMale;
    private CNS_Status cnsStatus;
    private CirculationStatus circulationStatus;
    private VentilationStatus ventilationStatus;

    public Patient(int age, int weightKg, int heightCm, int bodyTemperature, boolean isMale) {
        this.age = age;
        this.weightKg = weightKg;
        this.heightCm = heightCm;
        this.bodyTemperature = bodyTemperature;
        this.isMale = isMale;

        initVitals();
    }

    private boolean initVitals() {
        // initialize vitals
        try {
            // WIP
            
            // Example of initialization given below
            
            /*
            // Patient has been in cardiac arrest for ca. 5 minutes during arrival of EMS but given CPR the whole time
            // Oxygenation level of CNS (70 out of 100) indicates that CNS hasn't suffered any permanent damage yet
            
            this.cnsStatus = new CNS_Status(70);
            
            // BPM = 0 indicates cardiac arrest (type VF), the latter values indicate blood pressure measured in mmHg during CPR
            
            this.circulationStatus = new CirculationStatus(0, 50, 20, HeartState.VENTRICULAR_FIBRILLATION);
            
            // Patient isn't breathing spontaneously due to cardiac arrest, thus BF = 0
            
            this.ventilationStatus = new VentilationStatus(0);
            */
            
            System.out.println("Vitals of the patient have been initialized successfully!");
            return true;
        } catch (Exception e) {
            System.out.println("Exception during initialization of status of patient!");
            return false;
        }
    }
    
    // Measured in Celsius degrees
    public int getBodyTemperature() {
        return this.bodyTemperature;
    }
    
    // Measured in Celsius degrees
    public void setBodyTemperature(int bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }
    
    @Override
    public String toString() {
        // Check patient sex to prepare for printing
        String sex = "";
        if (this.isMale == true) {
            sex = "male";
        } else {
            sex = "female";
        }
        
        // Print patient info
        return "PATIENT:  sex: " + sex + ", age: " + this.age + " yrs, length: "
                + this.heightCm + " cm, weight: " + this.weightKg + " kg";
    }

}

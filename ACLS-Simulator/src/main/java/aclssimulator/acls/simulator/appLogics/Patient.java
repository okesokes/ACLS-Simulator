/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aclssimulator.acls.simulator.appLogics;

import java.util.*;

/**
 *
 * @author okesokes
 */

// Early WIP

public class Patient {
    private int age;
    private int weightKg;
    private int lengthCm;
    private boolean isMale;
    private CNS_Status cnsStatus;
    private CirculationStatus circulationStatus;
    private VentilationStatus ventilationStatus;
    
    public Patient(int age, int weightKg, int lengthCm, boolean isMale) {
        this.age = age;
        this.weightKg = weightKg;
        this.lengthCm = lengthCm;
        this.isMale = isMale;
        
        initVitals();
    }

    private boolean initVitals() {
        try {
            // initialize vitals
            // WIP
            initVitalsTest();
            return true;
        } catch (Exception e) {
            System.out.println("Exception during initialization of status of patient");
            return false;
        }
    }

    // !!! Move to proper JUnitTest class!!!
    private void initVitalsTest() {
        // Patient has been in cardiac arrest for ca. 5 minutes during arrival of EMS but given CPR the whole time
        // Oxygenation level of CNS indicates that CNS hasn't suffered any permanent damage yet
        this.cnsStatus = new CNS_Status(70);
        // BPM = 0 indicates cardiac arrest, the latter values indicate blood pressure measured in mmHg during CPR
        this.circulationStatus = new CirculationStatus(0, 50, 20);
        // Patient isn't breathing due to cardiac arrest, thus BF = 0
        this.ventilationStatus = new VentilationStatus(0);
    }
    
}

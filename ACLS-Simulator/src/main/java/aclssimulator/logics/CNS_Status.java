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
// Consider capsulating the vital organ functions to avoid cross dependencies

public class CNS_Status implements Runnable {
    // cnsOxygenationLevel can vary from 0 (fatal level) to 100 (full oxygenation)
    private int cnsOxygenationLevel;
    // varies from 0 (no damage) to 100 (fatal damage), determined by degree of hypoxia and body temperature during cardiac arrest
    // in addition, degree of acidosis might affect to cerebral damage as well in future
    private int cumulativeCerebralDamage;
    
    public CNS_Status(int CNS_OxygenationLevel) {
        this.cnsOxygenationLevel = CNS_OxygenationLevel;
        estimateCumulativeCerebralDamage(CNS_OxygenationLevel);
    }
    
    // requires threaded execution
    public void estimateCumulativeCerebralDamage(int CNS_OxygenationLevel) {
        run();
       // retrieve situationOnGoing boolean value from the main application logics class
        // while (situationOnGoing) {
            // determine measurement frequency by Thread.sleep(ms); value
            // add to cumulativeBrainDamage variable incrementally every time
            // when the CNS_OxygenationLevel variable exceeds threshold value
            
            // remember to divide the result by measurement frequency before add operation!
        // }
    }
    
    public int getCnsOxygenationLevel() {
        return this.cnsOxygenationLevel;
    }
    
    private void setCnsOxygenationLevel(int newCnsOxygenationLevel) {
        this.cnsOxygenationLevel = newCnsOxygenationLevel;
    }
    
    public int getCumulativeCerebralDamage() {
        return this.cumulativeCerebralDamage;
    }
    
    // ATTN: variable 'additionalCerebralDamage' indicates change in cerebral damage instead of total cerebral damage,
    // thus the additional operation instead of set operation
    private void setCumulativeCerebralDamage(int additionalCerebralDamage) {
        this.cumulativeCerebralDamage += additionalCerebralDamage;
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

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
// Consider capsulating the vital organ functions to avoid cross dependencies

public class CNS_Status {
    // cnsOxygenationLevel can vary from 0 (fatal level) to 100 (full oxygenation)
    private int cnsOxygenationLevel;
    // if cumulativeBrainDamage value exceeds given threshold, the CNS is fatally damaged and long term prognosis status
    // changes to "hopeless"
    private int cumulativeBrainDamage;
    
    public CNS_Status(int CNS_OxygenationLevel) {
        this.cnsOxygenationLevel = CNS_OxygenationLevel;
        estimateCumulativeBrainDamage(CNS_OxygenationLevel);
    }
    
    // requires threaded execution
    public void estimateCumulativeBrainDamage(int CNS_OxygenationLevel) {
       // retrieve situationOnGoing boolean value from the main application logics class
        // while (situationOnGoing) {
            // determine measurement frequency by Thread.sleep(ms); value
            // add to cumulativeBrainDamage variable incrementally every time
            // when the CNS_OxygenationLevel variable exceeds threshold value
            
            // remember to divide the result by measurement frequency before add operation!
        // }
    }
}

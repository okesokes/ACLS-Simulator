
package aclssimulator.logics;

import java.util.*;

/**
 *
 * @author okesokes
 */

// WIP

// "Dumb" data container/holder class
// Initialized by class Patient
// Accessed by class SimulateCNSState

public class CNS_Status {
    // cnsOxygenationLevel can vary from 0 (fatal level) to 100 (full oxygenation)
    private int cnsOxygenationLevel;
    // varies from 0 (no damage) to 100 (fatal damage), determined by degree of hypoxia and body temperature during cardiac arrest
    // in addition, degree of acidosis might affect to cerebral damage as well in future
    private int cumulativeCerebralDamage;
    
    public CNS_Status(int CNS_OxygenationLevel) {
        this.cnsOxygenationLevel = CNS_OxygenationLevel;
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
    private void addToCumulativeCerebralDamage(int additionalCerebralDamage) {
        this.cumulativeCerebralDamage += additionalCerebralDamage;
    }

}

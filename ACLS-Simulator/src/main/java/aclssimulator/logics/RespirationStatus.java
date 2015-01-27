
package aclssimulator.logics;

/**
 *
 * @author okesokes
 */

// WIP
// "Dumb" data container/holder class
// Initialized by class Patient
// Accessed by class SimulateCirculation

public class RespirationStatus {
    private int breathingFrequency;
    private BreathingType breathingType;

    public RespirationStatus(int breathingFrequency, BreathingType breathingType) {
        this.breathingFrequency = breathingFrequency;
        this.breathingType = breathingType;
    }
    
}

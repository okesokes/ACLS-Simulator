
package aclssimulator.logics;

/**
 *
 * @author okesokes
 */

// WIP

// "Dumb" data container/holder class
// Initialized by class Patient
// Accessed by class SimulateRespiration

public class RespirationStatus {
    private int breathingFrequency;
    private BreathingType breathingType;

    public RespirationStatus(int breathingFrequency, BreathingType breathingType) {
        this.breathingFrequency = breathingFrequency;
        this.breathingType = breathingType;
    }

    public int getBreathingFrequency() {
        return breathingFrequency;
    }

    public void setBreathingFrequency(int breathingFrequency) {
        this.breathingFrequency = breathingFrequency;
    }

    public BreathingType getBreathingType() {
        return breathingType;
    }

    public void setBreathingType(BreathingType breathingType) {
        this.breathingType = breathingType;
    }
    
}

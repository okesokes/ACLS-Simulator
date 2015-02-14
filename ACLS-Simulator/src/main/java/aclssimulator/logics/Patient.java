package aclssimulator.logics;

import java.util.*;

/**
 *
 * @author okesokes
 */
// WIP
public class Patient {

    private int age;
    private int weightKg;
    private int heightCm;
    // Body temperature is measured in degrees Celsius (°C)
    private int bodyTemperature;
    private boolean isMale;
    private CirculationStatus circulationStatus;
    private RespirationStatus respirationStatus;
    private CNS_Status cnsStatus;

    public Patient(int age, int weightKg, int heightCm, int bodyTemperature, boolean isMale) {
        this.age = age;
        this.weightKg = weightKg;
        this.heightCm = heightCm;
        this.bodyTemperature = bodyTemperature;
        this.isMale = isMale;
        // Initialize circulation, respiration and state of CNS
        while (!initVitals());
    }

    private boolean initVitals() {
        // Initialize CirculationStatus, RespirationStatus & CNS_Status but don't initialize simulation yet
        // (separate initialization of status and simulation completely)
        try {
            // WIP
            
            /*
            initRespiration();

            initCirculation();

            initCNSState();
            */
            
            // Example of initialization given below
            /*
             // Patient has been in cardiac arrest for ca. 5 minutes during arrival of EMS but given CPR the whole time
             // Initial oxygenation level of CNS (70 out of 100) indicates that CNS hasn't suffered any permanent damage yet
            
             this.cnsStatus = new CNS_Status(70);
            
             // BPM = 0 indicates cardiac arrest (type VF), the latter values indicate blood pressure measured in mmHg during CPR
             // Note that perfusion pressure is about 50 % from normal level (on average) during ideally applied CPR
            
             this.circulationStatus = new CirculationStatus(0, 40, 10, HeartState.VENTRICULAR_FIBRILLATION);
            
             // Patient isn't breathing spontaneously due to cardiac arrest, thus BF = 0, BreathingType = RESPIRATORY.ARREST
            
             this.respirationStatus = new VentilationStatus(0, BreathingType.RESPIRATORY_ARREST);
             */
            System.out.println("Vitals of the patient have been initialized successfully!");
            return true;
        } catch (Exception e) {
            System.out.println("Exception during initialization of status of the patient!");
            return false;
        }
    }

    private void initCirculation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void initRespiration() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void initCNSState() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weightKg;
    }

    public int getHeight() {
        return heightCm;
    }

    public boolean isMale() {
        return isMale;
    }

    public CNS_Status getCnsStatus() {
        return cnsStatus;
    }

    public CirculationStatus getCirculationStatus() {
        return circulationStatus;
    }

    public RespirationStatus getRespirationStatus() {
        return respirationStatus;
    }

    // Measured in degrees Celsius
    public int getBodyTemperature() {
        return this.bodyTemperature;
    }

    // Measured in degrees Celsius
    public void setBodyTemperature(int bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    @Override
    public String toString() {
        // Check patient gender to prepare for printing
        String gender = "";
        if (this.isMale == true) {
            gender = "male";
        } else {
            gender = "female";
        }

        // Print patient info (excl. vitals)
        return "***  PATIENT:  GENDER: " + gender + ", AGE: " + this.age + " yrs, HEIGHT: "
                + this.heightCm + " cm, WEIGHT: " + this.weightKg + " kg, BODY TEMPERATURE: "
                + this.bodyTemperature + "°C  ***";
    }

}

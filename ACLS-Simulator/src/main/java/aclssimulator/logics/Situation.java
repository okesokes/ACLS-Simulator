package aclssimulator.logics;

import aclssimulator.ui.TextUiTemp;
import java.util.Scanner;

/**
 *
 * @author okesokes
 */

// Early WIP

// This class handles the requests related to initialization of the situation
// Might become deprecated in future (possibly temporary solution as development convenience class)

public class Situation {

    private Patient patient;
    private TextUiTemp textUiTemp;

    public Situation(TextUiTemp textUiTemp, Scanner reader) {
        this.textUiTemp = textUiTemp;
    }

    public void requestPatientInitInfo() {
        boolean isMale = this.textUiTemp.requestPatientSex();
        int patientAge = this.textUiTemp.requestPatientAge();
        int patientWeight = this.textUiTemp.requestPatientWeightKg();
        int patientHeight = this.textUiTemp.requestPatientHeightCm();
        int patientBodyTemperature = this.textUiTemp.requestPatientBodyTemperature();
        // Temporary test (functionality & user input & logics & et cetera tests)
        HeartState patientHeartState = this.textUiTemp.requestPatientHeartState();
        // Again temporary check for convenience purposes (this should be handled by actual, unpassable check)
        // If patient is in cardiac arrest, request info about cardiac arrest
        if (patientHeartState != HeartState.SINUS_BRADYCARDIA && patientHeartState != HeartState.SINUS_TACHYCARDIA) {
            this.textUiTemp.requestTimeInCardiacArrest();
            this.textUiTemp.requestCPRTime();
            // ...otherwise request info about breathing of patient
            // (Note that patient can be in cardiac arrest and breathing (agonally) during the first minutes of cardiac arrest!)
        } else {
            this.textUiTemp.requestPatientBreathingFrequency();
            this.textUiTemp.requestPatientBreathingType();
        }

        this.patient = new Patient(patientAge, patientWeight, patientHeight, patientBodyTemperature, isMale);
        System.out.println(this.patient.toString());
    }

}

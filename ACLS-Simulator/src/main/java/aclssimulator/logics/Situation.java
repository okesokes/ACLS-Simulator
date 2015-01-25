/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aclssimulator.logics;

import java.util.Scanner;

/**
 *
 * @author okesokes
 */

// Early WIP

// This class handles the requests related to initialization of the situation

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
        
        this.patient = new Patient(patientAge, patientWeight, patientHeight, patientBodyTemperature, isMale);
        this.patient.toString();
    }
    
}

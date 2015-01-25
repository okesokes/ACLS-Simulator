/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aclssimulator.ui;

import aclssimulator.logics.HeartState;

/**
 *
 * @author okesokes
 */
public class UserInputHandler {
    
    public String toLowerCase(String input) {
        return input.toLowerCase();
    }
    
    public String toUpperCase(String input) {
        return input.toUpperCase();
    }
    
    public HeartState recognizeGivenRhythm(String rhythmAbbreviation) throws Exception {
        String input = rhythmAbbreviation.toUpperCase();
        
        // NSR is not supported yet
        // if (input.matches("NSR")) return HeartState.NORMAL_SINUS_RHYTHM;
        if (input.matches("VF")) return HeartState.VENTRICULAR_FIBRILLATION;
        else if (input.matches("VT")) return HeartState.PULSELESS_VENTRICULAR_TACHYCARDIA;
        else if (input.matches("ST")) return HeartState.SINUS_TACHYCARDIA;
        else if (input.matches("SB")) return HeartState.SINUS_BRADYCARDIA;
        // Consider removing PEA as not descriptive enough
        else if (input.matches("PEA")) return HeartState.PULSELESS_ELECTRICAL_ACTIVITY;
        else if (input.matches("ASY")) return HeartState.ASYSTOLE;
        else throw new Exception("Heart rhythm abbreviation was not recognized, please try again!");
    }
}

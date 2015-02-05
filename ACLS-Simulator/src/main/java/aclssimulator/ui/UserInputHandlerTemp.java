package aclssimulator.ui;

import aclssimulator.logics.BreathingType;
import aclssimulator.logics.HeartState;

/**
 *
 * @author okesokes
 */
// Contains functionality related to user input checks and minor adjustments

public class UserInputHandlerTemp {

    public String toLowerCaseCheck(String input) {
        try {
            return input.toLowerCase();
        } catch (Exception e) {
            return "";
        }
    }

    public String toUpperCaseCheck(String input) {
        try {
            return input.toUpperCase();
        } catch (Exception e) {
            return "";
        }
    }

    public HeartState recognizeGivenRhythm(String rhythmAbbreviation) throws Exception {
        String input = toUpperCaseCheck(rhythmAbbreviation);

        // Consider accessing enum HeartState via CirculationStatus instead of direct access
        // NSR is not supported yet
        // if (input.matches("NSR")) return HeartState.NORMAL_SINUS_RHYTHM;
        if (input.matches("VF")) {
            return HeartState.VENTRICULAR_FIBRILLATION;
        } else if (input.matches("VT")) {
            return HeartState.PULSELESS_VENTRICULAR_TACHYCARDIA;
        } else if (input.matches("ST")) {
            return HeartState.SINUS_TACHYCARDIA;
        } else if (input.matches("SB")) {
            return HeartState.SINUS_BRADYCARDIA;
        } // Consider removing PEA as not descriptive enough
        else if (input.matches("PEA")) {
            return HeartState.PULSELESS_ELECTRICAL_ACTIVITY;
        } else if (input.matches("ASY")) {
            return HeartState.ASYSTOLE;
        } else {
            throw new Exception("Heart rhythm abbreviation was not recognized, please try again!");
        }
    }

    public BreathingType recognizeGivenBreathingType(String breathingType) throws Exception {
        String input = toUpperCaseCheck(breathingType);

        if (input.matches("NORMAL")) {
            return BreathingType.NORMAL_BREATHING;
        } else if (input.matches("AGONAL")) {
            return BreathingType.AGONAL_BREATHING;
        } else if (input.matches("ARREST")) {
            return BreathingType.RESPIRATORY_ARREST;
        } else {
            throw new Exception("The state of respiration was not recognized, please try again!");
        }
    }

    public int parseInt(String userInput) {
        int parsedInt;
        try {
            parsedInt = Integer.parseInt(userInput);
        } catch (Exception e) {
            return -1;
        }

        return parsedInt;
    }

}

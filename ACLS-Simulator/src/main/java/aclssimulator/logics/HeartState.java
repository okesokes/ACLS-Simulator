/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aclssimulator.logics;

/**
 *
 * @author okesokes
 */

// Attention: The statuses are yet to be (double) checked! Use with your own risk!
// They're also lacking hierarchy (i.e. patient with sinus rhythm can't have PEA or asystole, for example)
// There are some statuses lacking yet on purpose and some not on purpose - WIP!

// This class is intended to be accessed directly by the class CirculationStatus only,
// the status of the heart can be retrieved via the CirculationStatus's getter methods


// Early WIP

public enum HeartState {
    SINUS_RHYTHM,
    VENTRICULAR_FIBRILLATION,
    VENTRICULAR_TACHYCARDIA,
    PULSELESS_VENTRICULAR_TACHYCARDIA,
    BRADYCARDIA,
    PEA,
    ASYSTOLE;
}
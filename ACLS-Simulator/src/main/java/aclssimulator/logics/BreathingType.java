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

// List of possible types of breathing of the patient
// Intended to make it more intuitive and realistic for the user to recognize status of the patient
// eg. possible agonal breathing (gasping) during the first moments of sudden cardiac arrest

public enum BreathingType {
    NORMAL_BREATHING,
    AGONAL_BREATHING,
    RESPIRATORY_ARREST;
}

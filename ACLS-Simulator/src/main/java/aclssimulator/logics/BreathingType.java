
package aclssimulator.logics;

/**
 *
 * @author okesokes
 */

// List of possible types of breathing of the patient
// Purpose of this class is to make it more intuitive and realistic for the user to recognize status of the patient
// Eg. possible agonal breathing (gasping) during the first moments of sudden cardiac arrest

public enum BreathingType {
    NORMAL_BREATHING,
    AGONAL_BREATHING,
    RESPIRATORY_ARREST;
}

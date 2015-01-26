/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aclssimulator.logics;

import aclssimulator.logics.HeartState;
import java.util.Scanner;

/**
 *
 * @author okesokes
 */
// Early WIP
public class TextUiTemp {

    private Scanner reader;
    private UserInputHandlerTemp userInputHandler;

    public TextUiTemp(Scanner reader) {
        this.reader = reader;
        this.userInputHandler = new UserInputHandlerTemp();
    }

    public int requestPatientAge() {
        int patientAge = -1;

        while (patientAge < 1 || patientAge > 110) {
            System.out.print("Please type the age of patient (from 1 to 110 yrs): ");
            patientAge = this.userInputHandler.parseInt(this.reader.nextLine());
        }

        System.out.println("Age of patient set!");
        return patientAge;
    }

    public int requestPatientHeightCm() {
        int patientHeightCm = 0;

        while (patientHeightCm < 50 || patientHeightCm > 220) {
            System.out.print("Please type the height of patient in cm (from 50 to 220 cm): ");
            patientHeightCm = this.userInputHandler.parseInt(this.reader.nextLine());
        }

        System.out.println("Height of patient set!");
        return patientHeightCm;
    }

    public int requestPatientWeightKg() {
        int patientWeightKg = 0;

        while (patientWeightKg < 4 || patientWeightKg > 200) {
            System.out.print("Please type the weight of patient in kgs (from 4 to 200 kg): ");
            patientWeightKg = this.userInputHandler.parseInt(this.reader.nextLine());
        }

        System.out.println("Weight of patient set!");
        return patientWeightKg;
    }

    public boolean requestPatientSex() {
        String patientSexString = "";
        boolean isMale = false;

        while (!patientSexString.matches("male") || !patientSexString.matches("female")) {
            System.out.print("Please type the sex of patient ('male' or 'female'): ");
            patientSexString = this.reader.nextLine();
            patientSexString = patientSexString.toLowerCase();
            if (patientSexString.matches("male")) {
                isMale = true;
                break;
            } else if (patientSexString.matches("female")) {
                isMale = false;
                break;
            }
        }

        System.out.println("Patient sex set!");
        return isMale;
    }

    public int requestPatientBodyTemperature() {
        int patientBodyTemperature = -1;

        while (patientBodyTemperature < 15 || patientBodyTemperature > 45) {
            System.out.print("Please type body temperature of the patient (in degrees Celsius, between 15°C and 45°C): ");
            patientBodyTemperature = this.userInputHandler.parseInt(this.reader.nextLine());
        }

        System.out.println("Body temperature of patient set!");
        return patientBodyTemperature;
    }

    // WIP: methods to request vital function states to init vital functions with parameters set by user
    public int requestTimeInCardiacArrest() {
        int timeInCardiacArrest = -1;

        while (timeInCardiacArrest < 0 || timeInCardiacArrest > 60) {
            System.out.print("For how long has the patient been in cardiac arrest (in minutes): ");
            timeInCardiacArrest = this.userInputHandler.parseInt(this.reader.nextLine());
        }

        System.out.println("Time in cardiac arrest set!");
        return timeInCardiacArrest;
    }

    public int requestCPRTime() {
        int CPRTime = -1;

        while (CPRTime < 0 || CPRTime > 45) {
            System.out.print("For how long has the patient been given CPR during the cardiac arrest (in minutes): ");
            CPRTime = this.userInputHandler.parseInt(this.reader.nextLine());
        }

        System.out.println("Time of given CPR set!");
        return CPRTime;
    }

    public HeartState requestPatientHeartState() {
        HeartState patientHeartState = HeartState.VENTRICULAR_FIBRILLATION;
        boolean patientHeartStateSetByUser = false;

        while (!patientHeartStateSetByUser) {
            System.out.print("Please set initial rhythm of heart by typing the abbreviation of the rhythm (VF/VT/ST/SB/PEA/ASY): ");
            String userInput = this.reader.nextLine();

            // Attempt to recognize the rhythm from user input - if this fails, print exception message and request rhythm again from user
            // otherwise save the given heart state, quit loop and return the heart state
            try {
                patientHeartState = this.userInputHandler.recognizeGivenRhythm(userInput);
                patientHeartStateSetByUser = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        
        // Consider adding cardiac rhythm check here - patient in asystole is probably not breathing!
        // Check should probably be handled via application logics class
        
        System.out.println("Cardiac rhythm set!");
        return patientHeartState;
    }

    public int requestPatientBreathingFrequency() {
        int patientBreathingFrequency = -1;

        while (patientBreathingFrequency < 0 || patientBreathingFrequency > 40) {
            System.out.print("Is the patient breathing ('yes'/'no')?: ");
            String patientBreathing = this.userInputHandler.toLowerCase(this.reader.nextLine());
            if (patientBreathing.matches("no")) {
                patientBreathingFrequency = 0;
            } else if (patientBreathing.matches("yes")) {
                System.out.print("Please type the breathing frequency of the patient (0 - 40 1/min - type '0' if patient is not breathing ): ");
                patientBreathingFrequency = this.userInputHandler.parseInt(this.reader.nextLine());
            }
        }

        System.out.println("Breathing frequency set!");
        return patientBreathingFrequency;
    }

}

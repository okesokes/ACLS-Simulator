/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.textUi;

import java.util.Scanner;

/**
 *
 * @author okesokes
 */
public class TextUi {

    private Scanner reader;

    public TextUi(Scanner reader) {
        this.reader = reader;
    }

    public int requestPatientAge() {
        int patientAge = 0;

        while (patientAge < 1 && patientAge > 110) {
            System.out.print("Please type the age of patient (from 1 to 110 yrs): ");
            patientAge = Integer.parseInt(this.reader.nextLine());
        }

        System.out.println("Age of patient set!");

        return patientAge;
    }

    public int requestPatientLengthCm() {
        int patientLengthCm = 0;

        while (patientLengthCm < 50 && patientLengthCm > 220) {
            System.out.print("Please type the length of patient in cm (from 50 to 220 cm): ");
            patientLengthCm = Integer.parseInt(this.reader.nextLine());
        }

        System.out.println("Length of patient set!");

        return patientLengthCm;
    }

    public int requestPatientWeightKg() {
        int patientWeightKg = 0;

        while (patientWeightKg < 4 && patientWeightKg > 200) {
            System.out.print("Please type the weight of patient in kgs (from 4 to 200 kg)");
            patientWeightKg = Integer.parseInt(this.reader.nextLine());
        }

        System.out.println("Weight of patient set!");

        return patientWeightKg;
    }

    public boolean requestPatientSex() {
        String patientSexString = "";
        boolean isMale = false;

        while (!patientSexString.matches("male") || !patientSexString.matches("female")) {
            System.out.print("Please type the sex of patient ('male' or 'female')");
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

    // WIP: methods to request vital function states to init vital functions with given parameters
    
    public int requestTimeInCardiacArrest() {
        int timeInCardiacArrest = -1;

        while (timeInCardiacArrest < 0 && timeInCardiacArrest > 60) {
            System.out.print("For how long has the patient been in cardiac arrest (in minutes)?");
            timeInCardiacArrest = Integer.parseInt(this.reader.nextLine());
        }

        System.out.println("Time in cardiac arrest set!");
        return timeInCardiacArrest;
    }

    public int requestCPRTime() {
        int CPRTime = -1;

        while (CPRTime < 0 && CPRTime > 45) {
            System.out.print("For how long has the patient been given CPR (in minutes)?");
            CPRTime = Integer.parseInt(this.reader.nextLine());
        }

        System.out.println("Time of given CPR set!");
        return CPRTime;
    }

}

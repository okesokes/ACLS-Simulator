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
            patientAge = Integer.parseInt(this.reader.nextLine());
        }
        
        return patientAge;
    }
}

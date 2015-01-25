/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aclssimulator.logics;

import java.util.*;
import aclssimulator.logics.*;

/**
 *
 * @author okesokes
 */

public class main {
   
    public static void main(String[] args) {
        // Init input scanner
        Scanner reader = new Scanner(System.in);
        // Init text-based user interface
        TextUiTemp textUiTemp = new TextUiTemp(reader);
        
        Situation situation = new Situation(textUiTemp, reader);
        
        // 1. request patient parameters
        
        // WIP
        
        // 2. initialize patient
        
        
        
        // 3. request situation and status parameters (optional)
        // 4. initialize situation and patient status
        
        System.out.println("--- END OF PROGRAM EXECUTION ---");
    }

}

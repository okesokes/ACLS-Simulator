
package aclssimulator.logics;

import aclssimulator.ui.TextUiTemp;
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
        
        // Init class Situation to handle the overall initialization of situation
        // (will most likely become deprecated in future)
        Situation situation = new Situation(textUiTemp, reader);
        // 1. request patient parameters
        situation.requestPatientInitInfo();
        
        // WIP
        
        // 2. initialize patient
        
        
        
        // 3. request situation and status parameters (optional)
        // 4. initialize situation and patient status
        
        System.out.println("*-*-*-* END OF PROGRAM EXECUTION *-*-*-*");
    }

}

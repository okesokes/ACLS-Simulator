
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
        // WIP: Invert the flawed logic in TextUi info request methods (negation + && -> ||)
        situation.requestPatientInitInfo();
        
        // 1. request patient parameters
        
        // WIP
        
        // 2. initialize patient
        
        
        
        // 3. request situation and status parameters (optional)
        // 4. initialize situation and patient status
        
        System.out.println("--- END OF PROGRAM EXECUTION ---");
    }

}

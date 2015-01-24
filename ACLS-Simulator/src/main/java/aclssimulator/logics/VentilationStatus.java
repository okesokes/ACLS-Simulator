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

// Early WIP

public class VentilationStatus implements Runnable {
    private int breathingFrequency;

    public VentilationStatus(int breathingFrequency) {
        this.breathingFrequency = breathingFrequency;
    }
    
    // requires threaded execution
    public void simulateVentilationStatus() {
        run();
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

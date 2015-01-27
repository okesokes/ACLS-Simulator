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
// "Smart" class that is responsible for the actual simulation of circulation (incl. feedback loop)
// SimulateCirculation saves the state of circulation to class CirculationStatus
public class SimulateCirculation implements Runnable {

    public SimulateCirculation() {
        // WIP
    }
    
    public void simulateCirculation() {
        run();
    }

    @Override
    public void run() {
        try {

        } catch (Exception e) {
            System.out.println("Exception during simulation of circulation status");
        }
    }
    
    public void attemptRestoringCirculationSimulation() {
        try {
            Thread.sleep(1000);
            System.out.println("...");
            Thread.sleep(1000);
            System.out.println("Attempting to restore the simulation of circulation status...");
            Thread.sleep(1000);
            System.out.println("...");
            run();
        } catch (Exception e) {
            System.out.println("Exception during attempt to restore the simulation of circulation status!");
        }
    }
    
}

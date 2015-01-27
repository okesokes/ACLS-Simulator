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
public class SimulateRespiration implements Runnable {
    
    public SimulateRespiration() {
        // WIP
    }

    public void simulateRespiration() {
        run();
    }

    @Override
    public void run() {
        try {

        } catch (Exception e) {
            System.out.println("Exception during simulation of respiration status");
        }
    }

    public void attemptRestoringRespirationSimulation() {
        try {
            Thread.sleep(1000);
            System.out.println("...");
            Thread.sleep(1000);
            System.out.println("Attempting to restore the simulation of respiration status...");
            Thread.sleep(1000);
            System.out.println("...");
            run();
        } catch (Exception e) {
            System.out.println("Exception during attempt to restore the simulation of respiration status!");
        }
    }

}

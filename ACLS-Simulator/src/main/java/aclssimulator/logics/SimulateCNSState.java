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
public class SimulateCNSState implements Runnable {

    public SimulateCNSState() {
        // WIP
    }

    public void simulateCNSState() {
        run();
    }

    @Override
    public void run() {
        try {

        } catch (Exception e) {
            System.out.println("Exception during simulation of CNS state!");
        }
    }

    public void attemptRestoringCNSStateSimulation() {
        try {
            Thread.sleep(1000);
            System.out.println("...");
            Thread.sleep(1000);
            System.out.println("Attempting to restore the simulation of CNS state...");
            Thread.sleep(1000);
            System.out.println("...");
            run();
        } catch (Exception e) {
            System.out.println("Exception during attempt to restore the simulation of CNS state!");
        }
    }

}

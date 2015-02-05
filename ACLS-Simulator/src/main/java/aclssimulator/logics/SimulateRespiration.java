
package aclssimulator.logics;

/**
 *
 * @author okesokes
 */

// "Smart" class that is responsible for the actual simulation of respiration (incl. feedback loop)
// SimulateRespiration saves the state of respiration to class RespirationStatus

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
            // WIP
        } catch (Exception e) {
            System.out.println("Exception during simulation of respiration status!");
            attemptRestoringRespirationSimulation();
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

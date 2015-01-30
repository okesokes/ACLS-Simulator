package aclssimulator.logics;

/**
 *
 * @author okesokes
 */

// WIP

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
            // determine measurement frequency by Thread.sleep(ms); value
            // add to cumulativeBrainDamage variable incrementally every time
            // when the CNS_OxygenationLevel variable exceeds threshold value
            // -- remember to divide the result by measurement frequency before add operation!
        } catch (Exception e) {
            System.out.println("Exception during simulation of CNS state!");
            attemptRestoringCNSStateSimulation();
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

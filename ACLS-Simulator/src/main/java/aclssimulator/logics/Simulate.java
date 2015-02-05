package aclssimulator.logics;

/**
 *
 * @author okesokes
 */

// Early WIP

// Class Simulate contains main simulation loop that handles the simulation of circulation, respiration and state of CNS

// It can be used to control the speed of simulation (eg.
// to speed up the simulation for development purposes)

public class Simulate implements Runnable {

    private Patient patient;
    private int simulationSpeedFactor;

    public Simulate(Patient patient) {
        this.patient = patient;
        this.simulationSpeedFactor = 100;
    }

    public void setSimulationSpeedFactor(int newSimulationSpeedFactor) throws Exception {
        try {
            // If the new simulation speed factor is not in given limits, throw Exception to the method that called this method...
            if (newSimulationSpeedFactor < 10 || newSimulationSpeedFactor > 6000) {
                throw new Exception("Speed factor of patient simulation should be between "
                        + "10 (extremely slow, 1 s = 1/10 s) and 6000 (extremely fast, 1 s = 60 s)!");
                // ...otherwise accept and set the new simulation speed factor
            } else {
                this.simulationSpeedFactor = newSimulationSpeedFactor;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    private void startRealTimeSimulation() {
        run();
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

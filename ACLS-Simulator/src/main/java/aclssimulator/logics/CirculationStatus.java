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
public class CirculationStatus implements Runnable {

    private int heartbeatsPerMinute;
    private int systoleMmHg;
    private int diastoleMmHg;
    private HeartState heartState;

    public CirculationStatus(int heartbeatsPerMinute, int systoleMmHg, int diastoleMmHg, HeartState heartState) {
        this.heartbeatsPerMinute = heartbeatsPerMinute;
        this.systoleMmHg = systoleMmHg;
        this.diastoleMmHg = diastoleMmHg;
        this.heartState = heartState;
    }

    // requires threaded execution
    // treatment parameters yet to be included
    public void simulateCirculationStatus() {
        run();
    }

    @Override
    public void run() {
        // retrieve situationOnGoing value from main application logics class
        try {
            // while (situationOnGoing) {
            // simulate status of circulation with fixed interval (Thread.sleep(ms);)
            // remember feedback to class CNS_Status to estimate cumulative brain damage
            // pay attention to heartbeatsPerMinute value (if 0, patient is in cardiac arrest)
            // }
        } catch (Exception e) {
            System.out.println("Exception during simulation of circulation status");
        }
    }
}


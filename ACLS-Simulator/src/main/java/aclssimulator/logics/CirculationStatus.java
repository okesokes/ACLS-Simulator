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
public class CirculationStatus {

    public int heartbeatsPerMinute;
    public int systolicMmHg;
    public int diastolicMmHg;
    public HeartState heartState;

    public CirculationStatus(int heartbeatsPerMinute, int systolicMmHg, int diastolicMmHg, HeartState heartState) {
        this.heartbeatsPerMinute = heartbeatsPerMinute;
        this.systolicMmHg = systolicMmHg;
        this.diastolicMmHg = diastolicMmHg;
        this.heartState = heartState;
    }

    // requires threaded execution
    // treatment parameters yet to be included

    public int getSystolicPressure() {
        return this.systolicMmHg;
    }

    public void setSystolicPressure(int newSystolicPressureMmHg) {
        this.systolicMmHg = newSystolicPressureMmHg;
    }

    public int getDiastolicPressure() {
        return this.diastolicMmHg;
    }

    public void setDiastolicPressure(int newDiastolicPressureMmHg) {
        this.diastolicMmHg = newDiastolicPressureMmHg;
    }

    public int getHeartBPM() {
        return this.heartbeatsPerMinute;
    }

    public void setHeartBPM(int newHeartBPM) {
        this.heartbeatsPerMinute = newHeartBPM;
    }

    public HeartState getHeartState() {
        return this.heartState;
    }

    // Note: setHeartState is public in order to change it manually if desired
    public void setHeartState(HeartState newHeartState) {
        this.heartState = newHeartState;
        // react to change of new heart state (should reflect to other variables in this class immediately)
        // link to other status classes (eg. ST -> VF ---> stagnation of blood pressure and 
        // cerebral oxygenation, agonal respiration etc.)
    }

}

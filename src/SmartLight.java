/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FA22-BSE-005
 */
public class SmartLight {
    private String lightID;
    private String status;

    public SmartLight(String lightID) {
        this.lightID = lightID;
        this.status = "OFF"; // Default status is OFF
    }

    public String getLightID() {
        return lightID;
    }

    // Turn on the light
    public void turnOn() {
        status = "ON";
        System.out.println("Light " + lightID + " is turned ON");
    }

    // Turn off the light
    public void turnOff() {
        status = "OFF";
        System.out.println("Light " + lightID + " is turned OFF");
    }

    public String getStatus() {
        return status;
    }
}


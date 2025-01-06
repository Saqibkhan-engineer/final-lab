/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FA22-BSE-005
 */
public abstract class Command {
    protected SmartLight smartLight;

    public Command(SmartLight smartLight) {
        this.smartLight = smartLight;
    }

    // Abstract method for executing the command
    public abstract void execute();
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FA22-BSE-005
 */
public class TurnOffCommand extends Command {
    public TurnOffCommand(SmartLight smartLight) {
        super(smartLight);
    }

    // Execute the command to turn off the light
    @Override
    public void execute() {
        smartLight.turnOff();
    }
}


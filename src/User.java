/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FA22-BSE-005
 */
public class User {
    private String userID;
    private String userName;

    public User(String userID, String userName) {
        this.userID = userID;
        this.userName = userName;
    }

    // Method to control the light
    public void controlLight(Command command) {
        command.execute();
    }

    public String getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }
}

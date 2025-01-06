/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FA22-BSE-005
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LightControlUI extends JFrame {
    private User user;
    private SmartLight smartLight;
    private JTextArea statusArea;

    public LightControlUI(User user, SmartLight smartLight) {
        this.user = user;
        this.smartLight = smartLight;
        setupUI();
    }

    private void setupUI() {
        setTitle("Smart Light Control");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Status Text Area
        statusArea = new JTextArea();
        statusArea.setEditable(false);
        statusArea.setText("Light Status: " + smartLight.getStatus());
        add(new JScrollPane(statusArea), BorderLayout.CENTER);

        // Control Buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton turnOnButton = new JButton("Turn On");
        turnOnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Command turnOnCommand = new TurnOnCommand(smartLight);
                user.controlLight(turnOnCommand);
                updateStatus();
            }
        });

        JButton turnOffButton = new JButton("Turn Off");
        turnOffButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Command turnOffCommand = new TurnOffCommand(smartLight);
                user.controlLight(turnOffCommand);
                updateStatus();
            }
        });

        buttonPanel.add(turnOnButton);
        buttonPanel.add(turnOffButton);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void updateStatus() {
        statusArea.setText("Light Status: " + smartLight.getStatus());
    }

    public static void main(String[] args) {
        User user = new User("U123", "John Doe");
        SmartLight smartLight = new SmartLight("L001");

        LightControlUI lightControlUI = new LightControlUI(user, smartLight);
        lightControlUI.setVisible(true);
    }
}


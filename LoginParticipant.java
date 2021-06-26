package com.java.project;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.*;

public class LoginParticipant extends JFrame  implements ActionListener {

    private JLabel labelUsername = new JLabel("Enter username: ");
    private JLabel labelPassword = new JLabel("Enter password: ");
    private JTextField textUsername = new JTextField(20);
    private JPasswordField fieldPassword = new JPasswordField(20);
    private JButton buttonLogin = new JButton("Login");

    public LoginParticipant() {

        JPanel newPanel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        constraints.gridx = 0;
        constraints.gridy = 0;
        newPanel.add(labelUsername, constraints);

        constraints.gridx = 1;
        newPanel.add(textUsername, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        newPanel.add(labelPassword, constraints);

        constraints.gridx = 1;
        newPanel.add(fieldPassword, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(buttonLogin, constraints);

        newPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Participant Login Panel"));

        add(newPanel);
        buttonLogin.addActionListener(this);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginParticipant().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if( e.getSource()== buttonLogin){

            try {
                File myObj = new File("ParticipantCredentials.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String s = myReader.nextLine();
                    String[] sArray = s.split(",");

                    if (textUsername.getText().equals(sArray[0]) && fieldPassword.getText().equals(sArray[1])) {
                        JOptionPane.showMessageDialog(null,
                                "Login Successful", "Success",
                                JOptionPane.INFORMATION_MESSAGE);

                        getContentPane().setVisible(true);
                        ParticipantRegistration RegFrame = new ParticipantRegistration();
                        RegFrame.setVisible(true);
                        RegFrame.setTitle("Registration | Participant");
                        RegFrame.setVisible(true);
                        RegFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        RegFrame.setLocationRelativeTo(null);

                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Invalid Username / Password Combo", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }

                }
                myReader.close();
            } catch (FileNotFoundException exception) {
                exception.printStackTrace();
            }








        }
    }
}
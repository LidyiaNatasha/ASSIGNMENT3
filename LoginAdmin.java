package com.java.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoginAdmin extends JFrame implements ActionListener {

    private JLabel labelUsername = new JLabel("Enter username: ");
    private JLabel labelPassword = new JLabel("Enter password: ");
    private JTextField textUsername = new JTextField(20);
    private JPasswordField fieldPassword = new JPasswordField(20);
    private JButton buttonLogin = new JButton("Login");

    public LoginAdmin() {

        // create a new panel with GridBagLayout manager
        JPanel newPanel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        // add components to the panel
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


        buttonLogin.addActionListener(this);


        // set border for the panel
        newPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Admin Login Panel"));

        // add the panel to this frame
        add(newPanel);

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginAdmin().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == buttonLogin) {


            try {
                File myObj = new File("AdminCredentials.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String s = myReader.nextLine();
                    String[] sArray = s.split(",");

                    if (textUsername.getText().equals(sArray[0]) && fieldPassword.getText().equals(sArray[1])) {
                        JOptionPane.showMessageDialog(null,
                                "Login Successful", "Success",
                                JOptionPane.INFORMATION_MESSAGE);

                        getContentPane().setVisible(true);
                        CompanyBGGUI CompFrame = new CompanyBGGUI();
                        CompFrame.setVisible(true);
                        CompFrame.setTitle("Admin | Company Info");
                        CompFrame.setSize(700, 200);
                        CompFrame.setVisible(true);
                        CompFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        CompFrame.setLocationRelativeTo(null);

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
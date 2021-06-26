package com.java.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class AdvertisementGUI extends JFrame implements ActionListener {

    static public Advertisement AdDetails;
    private JLabel labelMagzCost = new JLabel("Enter Magazine Cost: ");
    private JLabel labelFlyerCost = new JLabel("Enter Flyer's Cost: ");
    private JLabel labelSocMedCost = new JLabel("Enter Social Media's Cost: ");
    private JTextField textMagzCost = new JTextField(20);
    private JTextField textFlyerCost = new JTextField(20);
    private JTextField textSocMedCost = new JTextField(20);
    private JButton btnAdd = new JButton("Add and Show next frame");

    public AdvertisementGUI() {

        // create a new panel with GridBagLayout manager
        JPanel newPanel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;
        newPanel.add(labelMagzCost, constraints);

        constraints.gridx = 1;
        newPanel.add(textMagzCost, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        newPanel.add(labelFlyerCost, constraints);

        constraints.gridx = 1;
        newPanel.add(textFlyerCost, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        newPanel.add(labelSocMedCost, constraints);

        constraints.gridx = 1;
        newPanel.add(textSocMedCost, constraints);


        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(btnAdd, constraints);


        btnAdd.addActionListener(this);


        // set border for the panel
        newPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Advertisement Panel"));

        // add the panel to this frame
        add(newPanel);

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // set look and feel to the system look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdvertisementGUI().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnAdd) {

            if (textSocMedCost.getText().equals("") || textMagzCost.getText().equals("") || textFlyerCost.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter value to be added", "Empty Value Entered ", JOptionPane.ERROR_MESSAGE);

            } else {
                try {
                    Double.parseDouble(textSocMedCost.getText());
                    Double.parseDouble(textMagzCost.getText());
                    Double.parseDouble(textFlyerCost.getText());

                    try {
                        File file = new File("AdvertisementFile.txt");
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                        FileWriter fw = new FileWriter(file.getAbsoluteFile());
                        BufferedWriter bw = new BufferedWriter(fw);

                        bw.write("Flyer =" + Double.parseDouble(textFlyerCost.getText()) + ", Magazine =" + Double.parseDouble(textMagzCost.getText()) + ", Social Media =" + Double.parseDouble(textSocMedCost.getText()));

                        AdDetails = new Advertisement();
                        AdDetails.setFlyers(Double.parseDouble(textFlyerCost.getText()));
                        AdDetails.setMagazine(Double.parseDouble(textMagzCost.getText()));
                        AdDetails.setSocMed(Double.parseDouble(textSocMedCost.getText()));

                        System.out.println(AdDetails.getMagazine());
                        System.out.println(AdDetails.getFlyers());
                        System.out.println(AdDetails.getSocMed());

                        bw.close();
                        fw.close();
                        JOptionPane.showMessageDialog(null, "Data Saved", "Advertisement", JOptionPane.INFORMATION_MESSAGE);

                        getContentPane().setVisible(true);
                        SalesGUI SalesFrame = new SalesGUI();
                        SalesFrame.setVisible(true);
                        SalesFrame.setTitle("Admin | Sales");
                        SalesFrame.setVisible(true);
                        SalesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        SalesFrame.setLocationRelativeTo(null);

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

                } catch (Exception ex) {

                    JOptionPane.showMessageDialog(null, "Enter number values only", "Invalid Value Entered ", JOptionPane.ERROR_MESSAGE);


                }

            }


        }
    }
}
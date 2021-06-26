package com.java.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import static com.java.project.AdvertisementGUI.AdDetails;
import static com.java.project.FacilitatorGUI.FacilitatorList;

public class SalesGUI extends JFrame implements ActionListener {

    static public Finance FinanceDetails;
    final private JLabel labelMerchSales = new JLabel("Enter Merchandise Sales : ");
    private JLabel labelCampSales = new JLabel("Enter Camp Sales: ");
    private JTextField texMerchSales = new JTextField(20);
    private JTextField textCampSales = new JTextField(20);
    private JButton btnAdd = new JButton("Add and Show next frame");

    public SalesGUI() {

        // create a new panel with GridBagLayout manager
        JPanel newPanel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;
        newPanel.add(labelMerchSales, constraints);

        constraints.gridx = 1;
        newPanel.add(texMerchSales, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        newPanel.add(labelCampSales, constraints);

        constraints.gridx = 1;
        newPanel.add(textCampSales, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(btnAdd, constraints);


        btnAdd.addActionListener(this);


        // set border for the panel
        newPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Sales Panel"));

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
                new SalesGUI().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnAdd) {


            if (texMerchSales.getText().equals("") || textCampSales.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter value to be added", "Empty Value Entered ", JOptionPane.ERROR_MESSAGE);

            } else {
                try {
                    Double.parseDouble(texMerchSales.getText());
                    Double.parseDouble(textCampSales.getText());

                    try {
                        File file = new File("SalesFile.txt");
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                        FileWriter fw = new FileWriter(file.getAbsoluteFile());
                        BufferedWriter bw = new BufferedWriter(fw);

                        bw.write("Camp Sales =" + Double.parseDouble(textCampSales.getText()) + ", Merchandise Sales =" + Double.parseDouble(texMerchSales.getText()));

                        double totalMonthlySalary = 0;
                        double totalAdCost = AdDetails.getFlyers() + AdDetails.getSocMed() + AdDetails.getMagazine();

                        for (int i = 0; i < FacilitatorList.size(); i++) {
                            Facilitator FaciObjToCalc = FacilitatorList.get(i);
                            totalMonthlySalary = totalMonthlySalary + FaciObjToCalc.getSalary();

                        }
                        FinanceDetails = new Finance(0, 0, totalAdCost, totalMonthlySalary);
                        FinanceDetails.setSalesDepositAmount(Double.parseDouble(textCampSales.getText()) + Double.parseDouble(texMerchSales.getText()));

                        bw.close();
                        fw.close();
                        JOptionPane.showMessageDialog(null, "Data Saved", "Sales", JOptionPane.INFORMATION_MESSAGE);

                        getContentPane().setVisible(true);
                        FinanceGUI FinFrame = new FinanceGUI();
                        FinFrame.setVisible(true);
                        FinFrame.setTitle("Admin | Finance");
                        FinFrame.setVisible(true);
                        FinFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
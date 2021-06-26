package com.java.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import static com.java.project.SalesGUI.FinanceDetails;

public class FinanceGUI extends JFrame implements ActionListener {

    final private JLabel labelLastMonthBalance = new JLabel("Enter Last Month Balance : ");
    private JLabel labelMiscCost = new JLabel("Enter Amount of Miscellaneous Cost: ");
    private JTextField texLastMonthBalance = new JTextField(20);
    private JTextField textMiscCost = new JTextField(20);

    private JButton btnAdd = new JButton("Add");

    public FinanceGUI() {

        // create a new panel with GridBagLayout manager
        JPanel newPanel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;
        newPanel.add(labelLastMonthBalance, constraints);

        constraints.gridx = 1;
        newPanel.add(texLastMonthBalance, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        newPanel.add(labelMiscCost, constraints);

        constraints.gridx = 1;
        newPanel.add(textMiscCost, constraints);


        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(btnAdd, constraints);


        btnAdd.addActionListener(this);


        // set border for the panel
        newPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Login Panel"));

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
                new FinanceGUI().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnAdd) {

            if (textMiscCost.getText().equals("") || texLastMonthBalance.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter value to be added", "Empty Value Entered ", JOptionPane.ERROR_MESSAGE);

            } else {

                try {
                    Double.parseDouble(textMiscCost.getText());
                    Double.parseDouble(texLastMonthBalance.getText());

                    try {
                        File file = new File("FinanceFile.txt");
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                        FileWriter fw = new FileWriter(file.getAbsoluteFile());
                        BufferedWriter bw = new BufferedWriter(fw);

                        bw.write("Last Month Balance =" + Double.parseDouble(texLastMonthBalance.getText()) + ", Miscellaneous Cost =" + Double.parseDouble(textMiscCost.getText()));

                        FinanceDetails.setLastMonthBalance(Double.parseDouble(texLastMonthBalance.getText()));
                        FinanceDetails.setMiscellaneousCost(Double.parseDouble(textMiscCost.getText()));

                        bw.close();
                        fw.close();

                        JOptionPane.showMessageDialog(null, "Net Profit = RM " + FinanceDetails.calculateMonthlyRevenue(), "Monthly Report",
                                JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
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

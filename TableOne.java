package com.java.project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TableOne extends JFrame {

    private JPanel contentPane;
    private JTable table;
    private JTable model;
    private JTextField name;
    private JTextField surname;
    private JTextField icNo;
    private JTextField address;
    private JTextField matric;
    private JTextField telephone;
    private JFrame frame;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TableOne frame = new TableOne();
                    frame.setVisible(true);
                } catch (Exception arg0) {
                    arg0.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public TableOne() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 966, 584);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(222, 184, 135));
        panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
        panel.setBounds(10, 10, 932, 537);
        contentPane.add(panel);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
        panel_1.setBackground(new Color(222, 184, 135));
        panel_1.setBounds(34, 105, 294, 334);
        panel.add(panel_1);

        JLabel lblNewLabel = new JLabel("Name");
        lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 24));
        lblNewLabel.setBounds(10, 21, 81, 30);
        panel_1.add(lblNewLabel);

        name = new JTextField();
        name.setFont(new Font("Sitka Text", Font.PLAIN, 22));
        name.setBounds(121, 22, 156, 30);
        panel_1.add(name);
        name.setColumns(10);

        JLabel lblSurname = new JLabel("Surname");
        lblSurname.setFont(new Font("Sitka Text", Font.PLAIN, 24));
        lblSurname.setBounds(10, 69, 101, 30);
        panel_1.add(lblSurname);

        surname = new JTextField();
        surname.setFont(new Font("Sitka Text", Font.PLAIN, 22));
        surname.setColumns(10);
        surname.setBounds(121, 70, 156, 30);
        panel_1.add(surname);

        JLabel lblIcNo = new JLabel("IC No");
        lblIcNo.setFont(new Font("Sitka Text", Font.PLAIN, 24));
        lblIcNo.setBounds(10, 170, 101, 30);
        panel_1.add(lblIcNo);

        icNo = new JTextField();
        icNo.setFont(new Font("Sitka Text", Font.PLAIN, 22));
        icNo.setColumns(10);
        icNo.setBounds(121, 171, 156, 30);
        panel_1.add(icNo);

        address = new JTextField();
        address.setFont(new Font("Sitka Text", Font.PLAIN, 22));
        address.setColumns(10);
        address.setBounds(121, 123, 156, 30);
        panel_1.add(address);

        JLabel lblAddress = new JLabel("Address");
        lblAddress.setFont(new Font("Sitka Text", Font.PLAIN, 24));
        lblAddress.setBounds(10, 122, 101, 30);
        panel_1.add(lblAddress);

        matric = new JTextField();
        matric.setFont(new Font("Sitka Text", Font.PLAIN, 24));
        matric.setColumns(10);
        matric.setBounds(121, 211, 156, 30);
        panel_1.add(matric);

        JLabel lblMatric = new JLabel("Matric");
        lblMatric.setFont(new Font("Sitka Text", Font.PLAIN, 24));
        lblMatric.setBounds(10, 210, 101, 30);
        panel_1.add(lblMatric);

        telephone = new JTextField();
        telephone.setFont(new Font("Sitka Text", Font.PLAIN, 22));
        telephone.setColumns(10);
        telephone.setBounds(121, 251, 156, 30);
        panel_1.add(telephone);

        JLabel lblTelephone = new JLabel("Telephone");
        lblTelephone.setFont(new Font("Sitka Text", Font.PLAIN, 22));
        lblTelephone.setBounds(10, 254, 123, 30);
        panel_1.add(lblTelephone);

        JLabel lblGender = new JLabel("Gender");
        lblGender.setFont(new Font("Sitka Text", Font.PLAIN, 22));
        lblGender.setBounds(10, 294, 123, 30);
        panel_1.add(lblGender);

        JComboBox Gender = new JComboBox();
        Gender.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
        Gender.setModel(new DefaultComboBoxModel(new String[] {"Female", "Male"}));
        Gender.setBounds(121, 298, 156, 21);
        panel_1.add(Gender);

        JPanel panel_1_2 = new JPanel();
        panel_1_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
        panel_1_2.setBackground(new Color(222, 184, 135));
        panel_1_2.setBounds(350, 105, 553, 334);
        panel.add(panel_1_2);
        panel_1_2.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 10, 533, 269);
        panel_1_2.add(scrollPane);

        table = new JTable();
        table.setFont(new Font("Tahoma", Font.BOLD, 10));
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                int i = table.getSelectedRow();
                if(i>=0) {
                    name.setText(model.getValueAt(i,0).toString());
                    surname.setText(model.getValueAt(i,1).toString());
                    icNo.setText(model.getValueAt(i,2).toString());
                    address.setText(model.getValueAt(i,3).toString());
                    matric.setText(model.getValueAt(i,4).toString());
                    telephone.setText(model.getValueAt(i,5).toString());
                    Gender.setSelectedItem(model.getValueAt(i,6).toString());
                    JOptionPane.showMessageDialog(null, "Update Successfully");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Please select a row first!");
                }

            }
        });
        table.setModel(new DefaultTableModel(
                new Object[][] {
                        {null, null, null, null, null, null, null},
                },
                new String[] {
                        "Name", "Surname", "Address", "IC No", "Matric", "Telephone ", "Gender"
                }
        ));
        scrollPane.setViewportView(table);

        JButton btnUpload = new JButton("Upload");
        btnUpload.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    File file = new File("D:\\LeeJieHui279096\\Programming_A202(I)\\STIA1123\\Exercises\\GUI Registration System\\src\\registration_system\\AddDropFile.txt");
                    if(!file.exists()) {
                        file.createNewFile();
                    }
                    FileWriter fw = new FileWriter(file.getAbsoluteFile());
                    BufferedWriter bw = new BufferedWriter(fw);

                    for (int i=0; i<table.getRowCount(); i++) {
                        for (int j=0; j<table.getColumnCount(); j++) {
                            bw.write(table.getModel().getValueAt(i, j) + "  ");
                        }
                        bw.write("\n________\n");
                    }
                    bw.close();
                    fw.close();
                    JOptionPane.showMessageDialog(null, "Data Exported");
                }
                catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btnUpload.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnUpload.setBounds(216, 289, 129, 35);
        panel_1_2.add(btnUpload);

        JPanel panel_1_1_1 = new JPanel();
        panel_1_1_1.setLayout(null);
        panel_1_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
        panel_1_1_1.setBackground(new Color(222, 184, 135));
        panel_1_1_1.setBounds(34, 20, 869, 70);
        panel.add(panel_1_1_1);

        JLabel lblNewLabel_1 = new JLabel("Sum With Us Registration System");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
        lblNewLabel_1.setBounds(175, 10, 585, 50);
        panel_1_1_1.add(lblNewLabel_1);

        JPanel panel_1_1_1_1 = new JPanel();
        panel_1_1_1_1.setLayout(null);
        panel_1_1_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
        panel_1_1_1_1.setBackground(new Color(222, 184, 135));
        panel_1_1_1_1.setBounds(34, 449, 869, 70);
        panel.add(panel_1_1_1_1);

        JButton btnAddRecord = new JButton("Add Record");
        btnAddRecord.addActionListener(new ActionListener() {
                                           public void actionPerformed(ActionEvent e) {
                                               DefaultTableModel model = (DefaultTableModel) table.getModel();
                                               model.addRow(new Object[]{
                                                       name.getText(),
                                                       surname.getText(),
                                                       icNo.getText(),
                                                       address.getText(),
                                                       matric.getText(),
                                                       telephone.getText(),
                                                       Gender.getSelectedItem(),
                                               });

                                               if (table.getSelectedRow() == -1) {
                                                   if (table.getRowCount() == 0) {
                                                       JOptionPane.showMessageDialog(null, "Partipant Information Update confirmed", "Sum With Us Management System",
                                                               JOptionPane.OK_OPTION);
                                                   }
                                               }
                                           }
                                       }
        );
        btnAddRecord.setBounds(10, 18, 171, 35);
        panel_1_1_1_1.add(btnAddRecord);
        btnAddRecord.setFont(new Font("Sitka Text", Font.PLAIN, 25));

        JButton btnReset = new JButton("Reset");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                name.setText("");
                surname.setText("");
                icNo.setText("");
                address.setText("");
                matric.setText("");
                telephone.setText("");
                Gender.setSelectedItem("Make a selection");
            }
        });
        btnReset.setBounds(334, 18, 108, 35);
        panel_1_1_1_1.add(btnReset);
        btnReset.setFont(new Font("Sitka Text", Font.PLAIN, 25));

        JButton btnDelete = new JButton("Delete");
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel)table.getModel();
                if(table.getSelectedRow()==-1) {
                    if(table.getRowCount()==0) {
                        JOptionPane.showMessageDialog(null,"No data to delete",
                                "Sum With Us Management System", JOptionPane.OK_OPTION);
                    }else {
                        JOptionPane.showMessageDialog(null,"Select a row to delete",
                                "Sum With Us Management System", JOptionPane.OK_OPTION);
                    }
                }else {
                    model.removeRow(table.getSelectedRow());
                }
            }
        });
        btnDelete.setBounds(452, 18, 129, 35);
        panel_1_1_1_1.add(btnDelete);
        btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 25));

        JButton btnPrint = new JButton("Print");
        btnPrint.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    table.print();
                } catch (java.awt.print.PrinterException e) {
                    System.err.format("No printer found", e.getMessage());
                }
            }
        });
        btnPrint.setBounds(591, 18, 129, 35);
        panel_1_1_1_1.add(btnPrint);
        btnPrint.setFont(new Font("Tahoma", Font.PLAIN, 25));

        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame = new JFrame();
                if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Sum With Us Registration System",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                    System.exit(0);
                }
            }
        });
        btnExit.setBounds(730, 18, 129, 35);
        panel_1_1_1_1.add(btnExit);
        btnExit.setFont(new Font("Tahoma", Font.PLAIN, 25));

        JButton btnUpdate = new JButton("Update");
        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                DefaultTableModel model = (DefaultTableModel)table.getModel();
                int i = table.getSelectedRow();
                if(i>=0) //if single row is selected than update
                {
                    model.setValueAt(name.getText(),i,0);
                    model.setValueAt(surname.getText(),i,1);
                    model.setValueAt(icNo.getText(),i,2);
                    model.setValueAt(address.getText(),i,3);
                    model.setValueAt(matric.getText(),i,4);
                    model.setValueAt(telephone.getText(),i,5);
                    model.setValueAt(Gender.getSelectedItem(),i,6);
                    JOptionPane.showMessageDialog(null, "Update Successfully");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Please Select a Row First!");
                }
            }
        });
        btnUpdate.setBounds(191, 18, 133, 35);
        panel_1_1_1_1.add(btnUpdate);
        btnUpdate.setFont(new Font("Sitka Text", Font.PLAIN, 25));
    }
}

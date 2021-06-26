package com.java.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreenGUI extends JFrame implements ActionListener {

   JButton admin;
   JButton participant;


    public static void main(String[] args) {
        MainScreenGUI frame = new MainScreenGUI();
        frame.setTitle("Choose User");
        frame.setSize(600, 180);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

    }


    /**
     * Create the frame.
     */

    public MainScreenGUI() throws HeadlessException {


        JPanel p1 = new JPanel();   // Declare Panel
        p1.setLayout(new GridLayout(2,4));
        p1.add( new JLabel ("                                                      Please indicate either you are admin or participant ") )     ;



        JPanel p2 = new JPanel();   // Declare Panel
        p1.setLayout(new GridLayout(1,2));
        p2.add(admin= new JButton("Admin"));
        p2.add(participant= new JButton("Participant"));

        admin.addActionListener(this);
        participant.addActionListener(this);


        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ( e.getSource() == admin ) {

            getContentPane().setVisible(true);
            LoginAdmin AdminFrame = new LoginAdmin();
            AdminFrame.setVisible(true);
            AdminFrame.setTitle("Login | Admin");
            AdminFrame.setVisible(true);
            AdminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            AdminFrame.setLocationRelativeTo(null);

        }else {

            getContentPane().setVisible(true);
            LoginParticipant ParticipantFrame = new LoginParticipant();
            ParticipantFrame.setVisible(true);
            ParticipantFrame.setTitle("Login | Participant");
            ParticipantFrame.setVisible(true);
            ParticipantFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ParticipantFrame.setLocationRelativeTo(null);

        }
    }
}

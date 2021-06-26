
package com.java.project;

        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

        import static com.sun.glass.ui.Cursor.setVisible;

public class PrintRegistrationSlip extends JFrame implements ActionListener {

    private JTextArea resadd;
    private Container c;
    private JButton nextBtn=new JButton("Next");




    public static void main(String[] args) {
        PrintRegistrationSlip frame = new PrintRegistrationSlip();
        frame.setVisible(true);
        frame.setTitle(("Registration Slip"));
        frame.setBounds(300, 90, 500, 300);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public PrintRegistrationSlip() {


        Facilitator compInfo = new Facilitator();
        compInfo.getCompInfo();


        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(300, 200);
        resadd.setLocation(100, 20);
        resadd.setLineWrap(true);
        resadd.setEditable(false);
        resadd.setText(compInfo.getCompInfo()) ;

        add(resadd,BorderLayout.CENTER);
        add(nextBtn,BorderLayout.SOUTH);

        nextBtn.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == nextBtn){

            getContentPane().setVisible(true);
            FacilitatorGUI FaciFrame = new FacilitatorGUI();
            FaciFrame.setVisible(true);
            FaciFrame.setTitle("Admin | Facilitator Registration");
            FaciFrame.setVisible(true);
            FaciFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            FaciFrame.setLocationRelativeTo(null);

        }


    }
}

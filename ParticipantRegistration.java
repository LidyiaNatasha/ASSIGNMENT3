

import javax.swing.*;

import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class ParticipantRegistration extends JFrame {


    static public ArrayList<Registration> ParticipantsList = new ArrayList<>();

    private JPanel contentPane;
    private JTable table;
    private JTable model;
    private JTextField name;
    private JTextField age;
    private JTextField email;
    private JTextField contactNo;
    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ParticipantRegistration frame = new ParticipantRegistration();
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
    public ParticipantRegistration() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 966, 584);
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenu AboutUs = new JMenu("About Us");
        AboutUs.setFont(new Font("Segoe UI", Font.BOLD, 18));
        menuBar.add(AboutUs);
        
        JMenuItem EducationDayCamps = new JMenuItem("Education Day Camps");
        EducationDayCamps.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		EducationDayCamps frame = new EducationDayCamps();
				frame.setVisible(true);
        	}
        });
        EducationDayCamps.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        AboutUs.add(EducationDayCamps);
        
        JMenu mnNewMenu = new JMenu("Advertisement");
        mnNewMenu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Advertisement frame = new Advertisement();
				frame.setVisible(true);
        	}
        });
        mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 18));
        menuBar.add(mnNewMenu);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(95, 158, 160));
        panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
        panel.setBounds(0, 0, 942, 547);
        contentPane.add(panel);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
        panel_1.setBackground(new Color(95, 158, 160));
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

        JLabel lblAge = new JLabel("Age");
        lblAge.setFont(new Font("Sitka Text", Font.PLAIN, 24));
        lblAge.setBounds(10, 69, 101, 30);
        panel_1.add(lblAge);

        age = new JTextField();
        age.setFont(new Font("Sitka Text", Font.PLAIN, 22));
        age.setColumns(10);
        age.setBounds(121, 70, 156, 30);
        panel_1.add(age);


        JLabel lblContactNo = new JLabel("Contact No");
        lblContactNo.setFont(new Font("Sitka Text", Font.PLAIN, 24));
        lblContactNo.setBounds(10, 122, 120, 30);
        panel_1.add(lblContactNo);

        contactNo = new JTextField();
        contactNo.setFont(new Font("Sitka Text", Font.PLAIN, 22));
        contactNo.setColumns(10);
        contactNo.setBounds(121, 123, 156, 30);
        panel_1.add(contactNo);


        JLabel lblEmail = new JLabel("Email");
        lblEmail.setFont(new Font("Sitka Text", Font.PLAIN, 24));
        lblEmail.setBounds(10, 170, 101, 30);
        panel_1.add(lblEmail);

        email = new JTextField();
        email.setFont(new Font("Sitka Text", Font.PLAIN, 22));
        email.setColumns(10);
        email.setBounds(121, 171, 156, 30);
        panel_1.add(email);

        JLabel lblGender = new JLabel("Gender");
        lblGender.setFont(new Font("Sitka Text", Font.PLAIN, 22));
        lblGender.setBounds(10, 210, 101, 30);
        panel_1.add(lblGender);

        JComboBox Gender = new JComboBox();
        Gender.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
        Gender.setModel(new DefaultComboBoxModel(new String[]{"Female", "Male"}));
        Gender.setBounds(121, 211, 156, 30);
        panel_1.add(Gender);


        JComboBox Camp = new JComboBox();
        Camp.setFont(new Font("Sitka Text", Font.PLAIN, 22));
        Camp.setModel(new DefaultComboBoxModel(new String[]{"Introduction To Programming", "Object Oriented Programming","Graphic Users Interface"}));
        Camp.setBounds(121, 251, 156, 30);
        panel_1.add(Camp);

        JLabel lblCamp = new JLabel("Camp");
        lblCamp.setFont(new Font("Sitka Text", Font.PLAIN, 22));
        lblCamp.setBounds(10, 254, 123, 30);
        panel_1.add(lblCamp);

        JPanel panel_1_2 = new JPanel();
        panel_1_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
        panel_1_2.setBackground(new Color(95, 158, 160));
        panel_1_2.setBounds(350, 105, 553, 334);
        panel.add(panel_1_2);
        panel_1_2.setLayout(null);


        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 10, 533, 269);
        panel_1_2.add(scrollPane);

        TableModel tableModel = new DefaultTableModel(new String[]{"Name", "Age", "Email", "Contact No", "Gender", "Camp"}, 0);

        table = new JTable(tableModel);
        table.setFont(new Font("Tahoma", Font.BOLD, 10));
        scrollPane.setViewportView(table);


        JPanel panel_1_1_1 = new JPanel();
        panel_1_1_1.setLayout(null);
        panel_1_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
        panel_1_1_1.setBackground(new Color(95, 158, 160));
        panel_1_1_1.setBounds(34, 20, 869, 70);
        panel.add(panel_1_1_1);

        JLabel lblNewLabel_1 = new JLabel("Participant's Registration");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
        lblNewLabel_1.setBounds(238, 10, 417, 50);
        panel_1_1_1.add(lblNewLabel_1);

        JPanel panel_1_1_1_1 = new JPanel();
        panel_1_1_1_1.setLayout(null);
        panel_1_1_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
        panel_1_1_1_1.setBackground(new Color(95, 158, 160));
        panel_1_1_1_1.setBounds(34, 449, 869, 70);
        panel.add(panel_1_1_1_1);

        JButton btnUpload = new JButton("Upload");
        btnUpload.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    File file = new File("ParticipantRegistration.txt");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    FileWriter fw = new FileWriter(file.getAbsoluteFile());
                    BufferedWriter bw = new BufferedWriter(fw);

                    for (int i = 0; i < table.getRowCount(); i++) {
                        for (int j = 0; j < table.getColumnCount(); j++) {
                            bw.write(table.getModel().getValueAt(i, j) + " ");
                        }
                        bw.write("\n");
                    }
                    bw.close();
                    fw.close();

                    JOptionPane.showMessageDialog(null, "Uploaded");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        });
        btnUpload.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnUpload.setBounds(216, 289, 129, 35);
        panel_1_2.add(btnUpload);


        JButton btnRegister = new JButton("REGISTER");
        btnRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) table.getModel();

                if (name.getText().equals("") || age.getText().equals("") || email.getText().equals("") || contactNo.getText().equals("") || Gender.getSelectedItem().equals("")) {

                    JOptionPane.showMessageDialog(null, "Please enter value to be registered", "Empty Value Entered ", JOptionPane.ERROR_MESSAGE);

                } else {

                    try {
                        Integer.parseInt(age.getText());
                        Integer.parseInt(contactNo.getText());

                        model.addRow(new Object[]{
                                name.getText(),
                                age.getText(),
                                email.getText(),
                                contactNo.getText(),
                                Gender.getSelectedItem(),
                                Camp.getSelectedItem()

                        });

                        int selectedIndex = Camp.getSelectedIndex();
                        String[] campDesc = {"For beginners to master to concept", "For intermediates to advance their skill", "For artist , who would like to play with codes"};
                        double[] price = {50.00, 60.00, 100.00};

                        Registration Participants = new Registration();
                        Participants.setName(name.getText());
                        Participants.setAge(Integer.parseInt(age.getText()));
                        Participants.setEmail(email.getText());
                        Participants.setContactNo(Integer.parseInt(contactNo.getText()));
                        Participants.setGender(String.valueOf(Gender.getSelectedItem()));
                        Participants.setCampName(String.valueOf(Camp.getSelectedItem()));
                        Participants.setCampDescription(campDesc[selectedIndex]);
                        Participants.setCampPrice(price[selectedIndex]);
                        ParticipantsList.add(Participants);

                        JOptionPane.showMessageDialog(null, "Registered");


                    } catch (Exception exc) {

                        JOptionPane.showMessageDialog(null, "Enter number values only", "Invalid Value Entered ", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        btnRegister.setBounds(31, 18, 150, 35);
        panel_1_1_1_1.add(btnRegister);
        btnRegister.setFont(new Font("Sitka Text", Font.PLAIN, 23));


        JButton btnReset = new JButton("RESET");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                name.setText("");
                age.setText("");
                email.setText("");
                contactNo.setText("");

            }
        });
        btnReset.setBounds(334, 18, 108, 35);
        panel_1_1_1_1.add(btnReset);
        btnReset.setFont(new Font("Sitka Text", Font.PLAIN, 23));

        JButton btnDelete = new JButton("DELETE");
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                if (table.getSelectedRow() == -1) {
                    if (table.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(null, "No data to delete",
                                "Edu Day Company", JOptionPane.OK_OPTION);
                    } else {
                        JOptionPane.showMessageDialog(null, "Select a row to delete",
                                "Edu Day Company", JOptionPane.OK_OPTION);
                    }
                } else {
                    model.removeRow(table.getSelectedRow());
                    ParticipantsList.remove(table.getSelectedRow());
                }
            }
        });
        btnDelete.setBounds(452, 18, 129, 35);
        panel_1_1_1_1.add(btnDelete);
        btnDelete.setFont(new Font("Sitka Text", Font.PLAIN, 25));


        JButton btnUpdate = new JButton("UPDATE");
        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                int i = table.getSelectedRow();
                if (i >= 0) //if single row is selected than update
                {
                    Registration participantToUpdate = ParticipantsList.get(table.getSelectedRow());
                    participantToUpdate.setName(model.getValueAt(table.getSelectedRow(), 0).toString());
                    participantToUpdate.setAge(Integer.parseInt(model.getValueAt(table.getSelectedRow(), 1).toString()));
                    participantToUpdate.setEmail(model.getValueAt(table.getSelectedRow(), 2).toString());
                    participantToUpdate.setContactNo(Integer.parseInt(model.getValueAt(table.getSelectedRow(), 3).toString()));
                    participantToUpdate.setGender(model.getValueAt(table.getSelectedRow(), 4).toString());
                    participantToUpdate.setCampName(model.getValueAt(table.getSelectedRow(), 5).toString());

                    JOptionPane.showMessageDialog(null, "Update Successfully");
                } else {
                    JOptionPane.showMessageDialog(null, "Please Select a Row First!");
                }
            }
        });
        btnUpdate.setBounds(191, 18, 133, 35);
        panel_1_1_1_1.add(btnUpdate);
        btnUpdate.setFont(new Font("Sitka Text", Font.PLAIN, 24));


        JButton btnPrint = new JButton("PRINT SLIP");
        btnPrint.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {


                if (ParticipantsList.size() == 0) {

                    JOptionPane.showConfirmDialog(frame, "No participants was registered", "No Registration", JOptionPane.ERROR_MESSAGE);
                } else {
                    for (int i = 0; i < ParticipantsList.size(); i++) {

                        Registration SlipInfo = ParticipantsList.get(i);

                        JOptionPane.showConfirmDialog(frame, SlipInfo.getSlip(), "Registration Slip", JOptionPane.PLAIN_MESSAGE);

                    }

                }


            }
        });
        btnPrint.setBounds(591, 18, 157, 35);
        panel_1_1_1_1.add(btnPrint);
        btnPrint.setFont(new Font("Sitka Text", Font.PLAIN, 22));


        JButton btnExit = new JButton("EXIT");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame = new JFrame();
                if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Edu Day Company",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                    System.exit(0);
                }
            }
        });
        btnExit.setBounds(760, 18, 100, 35);
        panel_1_1_1_1.add(btnExit);
        btnExit.setFont(new Font("Sitka Text", Font.PLAIN, 25));


    }
}

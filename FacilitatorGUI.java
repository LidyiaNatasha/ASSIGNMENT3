

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

public class FacilitatorGUI extends JFrame {

    static public ArrayList<Facilitator> FacilitatorList = new ArrayList<>();
    private JPanel contentPane;
    private JTable table;
    private JTable model;
    private JTextField name;
    private JTextField surname;
    private JTextField id;
    private JTextField address;
    private JTextField facilitatingCamp;
    private JTextField salary;
    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FacilitatorGUI frame = new FacilitatorGUI();
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);

                } catch (Exception arg0) {
                    arg0.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public FacilitatorGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 966, 584);
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenu AboutUs = new JMenu("About Us");
        AboutUs.setFont(new Font("Segoe UI", Font.BOLD, 18));
        menuBar.add(AboutUs);
        
        JMenu EducationDayCamps = new JMenu("Education Day Camps");
        EducationDayCamps.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        EducationDayCamps.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		EducationDayCamps frame = new EducationDayCamps();
				frame.setVisible(true);
        	}
        });
        AboutUs.add(EducationDayCamps);
        
        JMenu Financial = new JMenu("Financial");
        Financial.setFont(new Font("Segoe UI", Font.BOLD, 18));
        menuBar.add(Financial);
        
        JMenuItem Finance = new JMenuItem("Finance");
        Finance.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        Finance.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Finance frame = new Finance();
				frame.setVisible(true);
        	}
        });
        Financial.add(Finance);
        
        JMenuItem Sales = new JMenuItem("Sales");
        Sales.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        Sales.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Sales frame = new Sales();
				frame.setVisible(true);
        	}
        });
        Financial.add(Sales);
        
        JMenuItem Advertisement = new JMenuItem("Advertisement");
        Advertisement.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        Advertisement.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Advertisement frame = new Advertisement();
				frame.setVisible(true);
        	}
        });
        Financial.add(Advertisement);
        
        JMenu Facilitator = new JMenu("Facilitator");
        Facilitator.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 FacilitatorGUI frame = new FacilitatorGUI();
                 frame.setVisible(true);
                 frame.setLocationRelativeTo(null);
        	}
        });
        Facilitator.setFont(new Font("Segoe UI", Font.BOLD, 18));
        menuBar.add(Facilitator);
        
        JMenu Participant = new JMenu("Participant");
        Participant.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ParticipantRegistration frame = new ParticipantRegistration();
                frame.setVisible(true);
        	}
        });
        Participant.setFont(new Font("Segoe UI", Font.BOLD, 18));
        menuBar.add(Participant);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(95, 158, 160));
        panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
        panel.setBounds(10, 10, 932, 537);
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

        JLabel lblSurname = new JLabel("Surname");
        lblSurname.setFont(new Font("Sitka Text", Font.PLAIN, 24));
        lblSurname.setBounds(10, 69, 110, 30);
        panel_1.add(lblSurname);

        surname = new JTextField();
        surname.setFont(new Font("Sitka Text", Font.PLAIN, 22));
        surname.setColumns(10);
        surname.setBounds(121, 70, 156, 30);
        panel_1.add(surname);

        JLabel lblIcNo = new JLabel("ID No");
        lblIcNo.setFont(new Font("Sitka Text", Font.PLAIN, 24));
        lblIcNo.setBounds(10, 170, 101, 30);
        panel_1.add(lblIcNo);

        id = new JTextField();
        id.setFont(new Font("Sitka Text", Font.PLAIN, 22));
        id.setColumns(10);
        id.setBounds(121, 171, 156, 30);
        panel_1.add(id);

        address = new JTextField();
        address.setFont(new Font("Sitka Text", Font.PLAIN, 22));
        address.setColumns(10);
        address.setBounds(121, 123, 156, 30);
        panel_1.add(address);

        JLabel lblAddress = new JLabel("Address");
        lblAddress.setFont(new Font("Sitka Text", Font.PLAIN, 24));
        lblAddress.setBounds(10, 122, 101, 30);
        panel_1.add(lblAddress);

        facilitatingCamp = new JTextField();
        facilitatingCamp.setFont(new Font("Sitka Text", Font.PLAIN, 24));
        facilitatingCamp.setColumns(10);
        facilitatingCamp.setBounds(121, 211, 156, 30);
        panel_1.add(facilitatingCamp);

        JLabel lblFacilitatingCamp = new JLabel("Camp Ins.");
        lblFacilitatingCamp.setFont(new Font("Sitka Text", Font.PLAIN, 24));
        lblFacilitatingCamp.setBounds(10, 210, 120, 30);
        panel_1.add(lblFacilitatingCamp);

        salary = new JTextField();
        salary.setFont(new Font("Sitka Text", Font.PLAIN, 22));
        salary.setColumns(10);
        salary.setBounds(121, 251, 156, 30);
        panel_1.add(salary);

        JLabel lblSalary = new JLabel("Salary");
        lblSalary.setFont(new Font("Sitka Text", Font.PLAIN, 22));
        lblSalary.setBounds(10, 254, 123, 30);
        panel_1.add(lblSalary);

        JLabel lblGender = new JLabel("Gender");
        lblGender.setFont(new Font("Sitka Text", Font.PLAIN, 22));
        lblGender.setBounds(10, 294, 123, 30);
        panel_1.add(lblGender);

        JComboBox Gender = new JComboBox();
        Gender.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
        Gender.setModel(new DefaultComboBoxModel(new String[]{"Female", "Male"}));
        Gender.setBounds(121, 298, 156, 21);
        panel_1.add(Gender);

        JPanel panel_1_2 = new JPanel();
        panel_1_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
        panel_1_2.setBackground(new Color(95, 158, 160));
        panel_1_2.setBounds(350, 105, 553, 334);
        panel.add(panel_1_2);
        panel_1_2.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 10, 533, 269);
        panel_1_2.add(scrollPane);

        TableModel tableModel = new DefaultTableModel(new String[]{"Name", "Surname", "Address", "ID No", "Facilitating Camp", "Salary ", "Gender"}, 0);

        table = new JTable(tableModel);
        table.setFont(new Font("Tahoma", Font.BOLD, 10));
        scrollPane.setViewportView(table);


        JPanel panel_1_1_1 = new JPanel();
        panel_1_1_1.setLayout(null);
        panel_1_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
        panel_1_1_1.setBackground(new Color(95, 158, 160));
        panel_1_1_1.setBounds(34, 20, 869, 70);
        panel.add(panel_1_1_1);

        JLabel lblNewLabel_1 = new JLabel("Facilitator Registration");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
        lblNewLabel_1.setBounds(260, 10, 386, 50);
        panel_1_1_1.add(lblNewLabel_1);

        JPanel panel_1_1_1_1 = new JPanel();
        panel_1_1_1_1.setLayout(null);
        panel_1_1_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
        panel_1_1_1_1.setBackground(new Color(95, 158, 160));
        panel_1_1_1_1.setBounds(34, 449, 869, 70);
        panel.add(panel_1_1_1_1);

        JButton btnAdd = new JButton("Add Record");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                DefaultTableModel model = (DefaultTableModel) table.getModel();

                if (id.getText().equals("") || name.getText().equals("") || salary.getText().equals("") || address.getText().equals("") || Gender.getSelectedItem().equals("")) {

                    JOptionPane.showMessageDialog(null, "Please enter value to be registered", "Empty Value Entered ", JOptionPane.ERROR_MESSAGE);

                } else {

                    try {
                        Integer.parseInt(id.getText());
                        Double.parseDouble(salary.getText());

                        model.addRow(new Object[]{
                                name.getText(),
                                surname.getText(),
                                id.getText(),
                                address.getText(),
                                facilitatingCamp.getText(),
                                salary.getText(),
                                Gender.getSelectedItem(),
                        });

                        Facilitator faci = new Facilitator(Integer.parseInt(id.getText()), name.getText(), String.valueOf(Gender.getSelectedItem()),
                                address.getText(), facilitatingCamp.getText(), Double.parseDouble(salary.getText()));
                        FacilitatorList.add(faci);

                        if (table.getSelectedRow() == -1) {
                            if (table.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, "Facilitator Information Added", "Edu Camp Day System",
                                        JOptionPane.OK_OPTION);
                            }
                        }

                    } catch (Exception exc) {

                        JOptionPane.showMessageDialog(null, "Enter number values only", "Invalid Value Entered ", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        btnAdd.setBounds(10, 18, 171, 35);
        panel_1_1_1_1.add(btnAdd);
        btnAdd.setFont(new Font("Sitka Text", Font.PLAIN, 25));


        JButton btnUpload = new JButton("Upload");
        btnUpload.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    File file = new File("FacilitatorRegistration.txt");
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


        JButton btnNext = new JButton("Next");
        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                getContentPane().setVisible(true);
                Advertisement AdFrame = new Advertisement();
                AdFrame.setVisible(true);
                AdFrame.setTitle("Admin | Advertisement");
                AdFrame.setVisible(true);
                AdFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });
        btnNext.setBounds(730, 18, 129, 35);
        panel_1_1_1_1.add(btnNext);
        btnNext.setFont(new Font("Tahoma", Font.PLAIN, 25));


        JButton btnReset = new JButton("Reset");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                name.setText("");
                surname.setText("");
                id.setText("");
                address.setText("");
                facilitatingCamp.setText("");
                salary.setText("");
                Gender.setSelectedItem("Make a selection");
            }
        });
        btnReset.setBounds(334, 18, 108, 35);
        panel_1_1_1_1.add(btnReset);
        btnReset.setFont(new Font("Sitka Text", Font.PLAIN, 25));

        JButton btnDelete = new JButton("Delete");
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
                    FacilitatorList.remove(table.getSelectedRow());
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


        JButton btnUpdate = new JButton("Update");
        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                int i = table.getSelectedRow();
                if (i >= 0) //if single row is selected than update
                {
                    Facilitator faciToUpdate = FacilitatorList.get(table.getSelectedRow());
                    faciToUpdate.setName(model.getValueAt(table.getSelectedRow(), 0).toString());
                    faciToUpdate.setId( Integer.parseInt(model.getValueAt(table.getSelectedRow(), 2).toString()));
                    faciToUpdate.setAddress(model.getValueAt(table.getSelectedRow(), 3).toString());
                    faciToUpdate.setCamp(model.getValueAt(table.getSelectedRow(), 4).toString());
                    faciToUpdate.setSalary(Double.parseDouble(model.getValueAt(table.getSelectedRow(), 5).toString()));
                    faciToUpdate.setGender(model.getValueAt(table.getSelectedRow(), 6).toString());

                    JOptionPane.showMessageDialog(null, "Update Successfully");
                } else {
                    JOptionPane.showMessageDialog(null, "Please Select a Row First!");
                }
            }
        });
        btnUpdate.setBounds(191, 18, 133, 35);
        panel_1_1_1_1.add(btnUpdate);
        btnUpdate.setFont(new Font("Sitka Text", Font.PLAIN, 25));

    }
}

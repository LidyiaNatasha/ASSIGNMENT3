import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Advertisement extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTable table;
	private JTextField textField4;
	private JComboBox comboBox;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Advertisement frame = new Advertisement();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Advertisement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1105, 774);
		
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
		
		JMenu Financial = new JMenu("Financial");
		Financial.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(Financial);
		
		JMenuItem Finance = new JMenuItem("Finance");
		Finance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance frame = new Finance();
				frame.setVisible(true);
			}
		});
		Finance.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		Financial.add(Finance);
		
		JMenuItem Sales = new JMenuItem("Sales");
		Sales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sales frame = new Sales();
				frame.setVisible(true);
			}
		});
		Sales.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		Financial.add(Sales);
		
		JMenuItem Advertisement = new JMenuItem("Advertisement");
		Advertisement.setFont(new Font("Segoe UI", Font.PLAIN, 15));
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
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 0, 255)));
		panel.setBounds(0, 0, 1081, 737);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 0, 255)));
		panel_1.setBackground(new Color(95, 158, 160));
		panel_1.setBounds(35, 21, 1000, 86);
		panel.add(panel_1);
		
		JLabel ADVERTISEMENT = new JLabel("ADVERTISEMENT");
		ADVERTISEMENT.setFont(new Font("Sitka Text", Font.BOLD, 50));
		ADVERTISEMENT.setBounds(272, 10, 461, 66);
		panel_1.add(ADVERTISEMENT);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 0, 255)));
		panel_1_1.setBackground(new Color(95, 158, 160));
		panel_1_1.setBounds(35, 627, 1000, 86);
		panel.add(panel_1_1);
		
		JButton ADD = new JButton("ADD");
		ADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();

	    		model.addRow(new Object[]{
	    				comboBox.getSelectedItem(),
	    				textField1.getText(),
	    				textField2.getText(),
	    				textField3.getText(),
	    				textField4.getText(),
	    				
	    
	    		});
	    		if (table.getSelectedRow() == -1) {
	    			if (table.getRowCount() == 0) {
	    				JOptionPane.showMessageDialog(null, "Update confirmed", "Finance System",
	    						JOptionPane.OK_OPTION);
	    			}
	    		}
			}
		});
		ADD.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		ADD.setBounds(10, 21, 136, 41);
		panel_1_1.add(ADD);
		
		JButton RESET = new JButton("RESET");
		RESET.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.setSelectedItem("");
				textField1.setText("");
				textField2.setText("");
				textField3.setText("");
				textField4.setText("");
			
			}
		});
		RESET.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		RESET.setBounds(169, 21, 136, 41);
		panel_1_1.add(RESET);
		
		JButton DELETE = new JButton("DELETE");
		DELETE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Facilitator System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Facilitator", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		DELETE.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		DELETE.setBounds(332, 21, 136, 41);
		panel_1_1.add(DELETE);
		
		JButton PRINTSLIP = new JButton("PRINTSLIP");
		PRINTSLIP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    table.print();
                } catch (java.awt.print.PrinterException e1) {
                    System.err.format("No printer found", e1.getMessage());
                }

			}
		});
		PRINTSLIP.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		PRINTSLIP.setBounds(494, 21, 156, 41);
		panel_1_1.add(PRINTSLIP);
		
		JButton EXIT = new JButton("EXIT");
		EXIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Advertisement System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		EXIT.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		EXIT.setBounds(840, 21, 136, 41);
		panel_1_1.add(EXIT);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 0, 255)));
		panel_1_1_1.setBackground(new Color(95, 158, 160));
		panel_1_1_1.setBounds(31, 138, 443, 463);
		panel.add(panel_1_1_1);
		
		JLabel MagaziseCost = new JLabel("Magazine Cost");
		MagaziseCost.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		MagaziseCost.setBounds(25, 89, 167, 42);
		panel_1_1_1.add(MagaziseCost);
		
		textField1 = new JTextField();
		textField1.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		textField1.setBounds(223, 89, 188, 42);
		panel_1_1_1.add(textField1);
		textField1.setColumns(10);
		
		JLabel FlyersCost = new JLabel("Flyer's Cost");
		FlyersCost.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		FlyersCost.setBounds(25, 158, 167, 42);
		panel_1_1_1.add(FlyersCost);
		
		JLabel SocialMediaCost = new JLabel("Social Media's Cost");
		SocialMediaCost.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		SocialMediaCost.setBounds(25, 225, 188, 42);
		panel_1_1_1.add(SocialMediaCost);
		
		textField2 = new JTextField();
		textField2.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		textField2.setColumns(10);
		textField2.setBounds(223, 158, 188, 42);
		panel_1_1_1.add(textField2);
		
		textField3 = new JTextField();
		textField3.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		textField3.setColumns(10);
		textField3.setBounds(223, 225, 188, 42);
		panel_1_1_1.add(textField3);
		
		JLabel Month = new JLabel("Month");
		Month.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		Month.setBounds(25, 23, 167, 42);
		panel_1_1_1.add(Month);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Month", "January", "February", "March", "April", "May", "Jun", "July", "August", "September", "October", "November", "December"}));
		comboBox.setFont(new Font("Sitka Text", Font.PLAIN, 21));
		comboBox.setBounds(223, 23, 187, 42);
		panel_1_1_1.add(comboBox);
		
		JLabel Total = new JLabel("Total");
		Total.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		Total.setBounds(25, 289, 188, 42);
		panel_1_1_1.add(Total);
		
		textField4 = new JTextField();
		textField4.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		textField4.setColumns(10);
		textField4.setBounds(223, 289, 188, 42);
		panel_1_1_1.add(textField4);
		
		JButton UPLOAD = new JButton("UPLOAD");
		UPLOAD.setBounds(66, 388, 136, 41);
		panel_1_1_1.add(UPLOAD);
		UPLOAD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File ("C:\\Users\\User\\eclipse-workspace\\Finance\\src\\finance.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
							}
						bw.write("\n____\n");
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
		UPLOAD.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		
		JButton TOTAL = new JButton("TOTAL");
		TOTAL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2, num3, ans;
				
				try {
					num1 = Integer.parseInt(textField1.getText());
					num2 = Integer.parseInt(textField2.getText());
					num3 = Integer.parseInt(textField3.getText());
					
					
					
					ans = num1 + num2 + num3;
					textField4.setText(Double.toString(ans));
					
    			} catch(Exception e1) {
    				JOptionPane.showMessageDialog(null, "Invalid Number.");
    			}
			}
		});
		TOTAL.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		TOTAL.setBounds(245, 388, 136, 41);
		panel_1_1_1.add(TOTAL);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 0, 255)));
		panel_1_1_1_1.setBackground(new Color(95, 158, 160));
		panel_1_1_1_1.setBounds(484, 138, 550, 463);
		panel.add(panel_1_1_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 530, 443);
		panel_1_1_1_1.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"Month", "Magazine Cost (RM)", "Flyer's Cost (RM)", "Social Media's Cost (RM)", "Total (RM)"
			}
		));
		scrollPane.setViewportView(table);
	}
}

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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Sales extends JFrame {

	private JPanel contentPane;
	private JTextField textField2;
	private JTextField textField1;
	private JTable table;
	private JTable model;
	private JComboBox comboBoxMonth;
	private JButton Print;
	private JFrame frame;
	private JTextField textField3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sales frame = new Sales();
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
	public Sales() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1102, 777);
		
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
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Sales");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		Financial.add(mntmNewMenuItem);
		
		JMenuItem Advertisement = new JMenuItem("Advertisement");
		Advertisement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Advertisement frame = new Advertisement();
				frame.setVisible(true);
			}
		});
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
		panel.setBounds(0, 0, 1078, 730);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 0, 255)));
		panel_1.setBackground(new Color(95, 158, 160));
		panel_1.setBounds(34, 27, 1005, 77);
		panel.add(panel_1);
		
		JLabel Sales = new JLabel("Sales");
		Sales.setFont(new Font("Sitka Text", Font.PLAIN, 50));
		Sales.setBounds(420, 10, 174, 57);
		panel_1.add(Sales);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 0, 255)));
		panel_1_1.setBackground(new Color(95, 158, 160));
		panel_1_1.setBounds(34, 618, 1005, 84);
		panel.add(panel_1_1);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					comboBoxMonth.setSelectedItem("");
					textField1.setText("");
					textField2.setText("");
					textField3.setText("");
					
				
					
			}
		});
		btnReset.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		btnReset.setBounds(191, 23, 151, 40);
		panel_1_1.add(btnReset);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 {
		                try {
		                    table.print();
		                } catch (java.awt.print.PrinterException e1) {
		                    System.err.format("No printer found", e1.getMessage());
		                }
}
			}
		});
		btnPrint.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		btnPrint.setBounds(365, 23, 151, 40);
		panel_1_1.add(btnPrint);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Customer System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Customer System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}

			}
		});
		btnDelete.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		btnDelete.setBounds(542, 23, 151, 40);
		panel_1_1.add(btnDelete);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Customer System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Customer System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}

			}
		});
		btnExit.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		btnExit.setBounds(833, 23, 151, 40);
		panel_1_1.add(btnExit);
		
		JButton ADD = new JButton("ADD");
		ADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();

	    		model.addRow(new Object[]{
	    				comboBoxMonth.getSelectedItem(),
	    				textField1.getText(),
	    				textField2.getText(),
	    				textField3.getText(),
	    				
	    				
	    
	    		});
	    		if (table.getSelectedRow() == -1) {
	    			if (table.getRowCount() == 0) {
	    				JOptionPane.showMessageDialog(null, "Update confirmed", "Sales System",
	    						JOptionPane.OK_OPTION);
	    			}
	    		}
			}
		});
		ADD.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		ADD.setBounds(29, 23, 142, 40);
		panel_1_1.add(ADD);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 0, 255)));
		panel_1_2.setBackground(new Color(95, 158, 160));
		panel_1_2.setBounds(34, 123, 428, 485);
		panel.add(panel_1_2);
		
		JLabel MarchandiseSales = new JLabel("Marchandise Sales : RM");
		MarchandiseSales.setFont(new Font("Sitka Text", Font.PLAIN, 19));
		MarchandiseSales.setBounds(25, 127, 218, 40);
		panel_1_2.add(MarchandiseSales);
		
		JLabel CampSales = new JLabel("Camp Sales : RM");
		CampSales.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		CampSales.setBounds(25, 225, 218, 40);
		panel_1_2.add(CampSales);
		
		textField2 = new JTextField();
		textField2.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		textField2.setBounds(242, 225, 162, 40);
		panel_1_2.add(textField2);
		textField2.setColumns(10);
		
		textField1 = new JTextField();
		textField1.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		textField1.setColumns(10);
		textField1.setBounds(242, 127, 162, 40);
		panel_1_2.add(textField1);
		
		JLabel Month = new JLabel("Month");
		Month.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		Month.setBounds(25, 47, 137, 40);
		panel_1_2.add(Month);
		
		comboBoxMonth = new JComboBox();
		comboBoxMonth.setToolTipText("comboBox");
		comboBoxMonth.setModel(new DefaultComboBoxModel(new String[] {"Select Month", "January", "February", "March", "April ", "May", "June", "July", "Ogos", "September", "October", "November", "December"}));
		comboBoxMonth.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		comboBoxMonth.setBounds(241, 47, 163, 40);
		panel_1_2.add(comboBoxMonth);
		
		JButton UPLOAD = new JButton("UPLOAD");
		UPLOAD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File ("C:\\Users\\User\\eclipse-workspace\\Finance\\finance.txt");
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
		UPLOAD.setBounds(52, 407, 151, 40);
		panel_1_2.add(UPLOAD);
		
		JButton TOTAL = new JButton("TOTAL");
		TOTAL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2, ans;
				
				try {
					num1 = Integer.parseInt(textField1.getText());
					num2 = Integer.parseInt(textField2.getText());
					
					
					
					ans = num1 + num2;
					textField3.setText(Double.toString(ans));
					
    			} catch(Exception e1) {
    				JOptionPane.showMessageDialog(null, "Invalid Number.");
    			}
			}
		});
		TOTAL.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		TOTAL.setBounds(231, 407, 151, 40);
		panel_1_2.add(TOTAL);
		
		JLabel Total = new JLabel("Total");
		Total.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		Total.setBounds(25, 308, 218, 40);
		panel_1_2.add(Total);
		
		textField3 = new JTextField();
		textField3.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		textField3.setColumns(10);
		textField3.setBounds(242, 308, 162, 40);
		panel_1_2.add(textField3);
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 0, 255)));
		panel_1_2_1.setBackground(new Color(95, 158, 160));
		panel_1_2_1.setBounds(472, 123, 567, 485);
		panel.add(panel_1_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 547, 465);
		panel_1_2_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"Month", "Merchandise Sales (RM)", "Camp Sales (RM)", "Total (RM)"
			}
		));
		table.setFont(new Font("Sitka Text", Font.PLAIN, 16));
		scrollPane.setViewportView(table);
	}
}

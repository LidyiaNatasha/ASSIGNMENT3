import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
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
import javax.swing.SwingConstants;

public class Finance extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JTable table;
	private JTextField textField3;
	private JComboBox comboBox;
	private JButton Print;
	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance frame = new Finance();
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
	public Finance() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1091, 768);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu AboutUs = new JMenu("About Us");
		AboutUs.setFont(new Font("Dialog", Font.BOLD, 18));
		menuBar.add(AboutUs);
		
		JMenuItem EducationDayCamps = new JMenuItem("Education Day Camps");
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
		Participant.setFont(new Font("Segoe UI", Font.BOLD, 18));
		Participant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FacilitatorGUI frame = new FacilitatorGUI();
				frame.setVisible(true);
			}
		});
		menuBar.add(Participant);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 0, 255)));
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(0, 0, 1067, 721);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 0, 255)));
		panel_1.setBackground(new Color(95, 158, 160));
		panel_1.setBounds(30, 25, 1002, 80);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Finance");
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 53));
		lblNewLabel.setBounds(377, 10, 243, 60);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 0, 255)));
		panel_1_1.setBackground(new Color(95, 158, 160));
		panel_1_1.setBounds(34, 599, 998, 94);
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
		ADD.setBounds(24, 22, 137, 44);
		panel_1_1.add(ADD);
		
		JButton Reset = new JButton("RESET");
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.setSelectedItem("");
				textField1.setText("");
				textField2.setText("");
				textField3.setText("");
			
				
			}
		});
		Reset.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		Reset.setBounds(186, 22, 137, 44);
		panel_1_1.add(Reset);
		
		 Print = new JButton("PRINT"); 
		
		 	
						Print.addActionListener(new ActionListener() {
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
		Print.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		Print.setBounds(346, 22, 137, 44);
		panel_1_1.add(Print);
		
		JButton Exit = new JButton("EXIT");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Finance System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		Exit.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		Exit.setBounds(830, 22, 137, 44);
		panel_1_1.add(Exit);
		
		JButton Delete = new JButton("DELETE");
		Delete.addActionListener(new ActionListener() {
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
		Delete.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		Delete.setBounds(505, 22, 137, 44);
		panel_1_1.add(Delete);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 0, 255)));
		panel_1_2.setBackground(new Color(95, 158, 160));
		panel_1_2.setBounds(30, 126, 405, 463);
		panel.add(panel_1_2);
		
		JLabel Month = new JLabel("Month");
		Month.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		Month.setBounds(22, 46, 123, 37);
		panel_1_2.add(Month);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select month", "January", "February", "March", "April", "May", "June", "July", "Ogos", "September", "October", "November", "Dicember"}));
		comboBox.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		comboBox.setBounds(204, 45, 164, 37);
		panel_1_2.add(comboBox);
		
		JLabel MerchandiseSales = new JLabel("Merchandise Sales:RM ");
		MerchandiseSales.setFont(new Font("Sitka Text", Font.PLAIN, 17));
		MerchandiseSales.setBounds(22, 131, 200, 37);
		panel_1_2.add(MerchandiseSales);
		
		textField1 = new JTextField();
		textField1.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		textField1.setBounds(209, 130, 159, 37);
		panel_1_2.add(textField1);
		textField1.setColumns(10);
		
		JLabel CampSales = new JLabel("Camp Sales : RM");
		CampSales.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		CampSales.setBounds(22, 208, 177, 37);
		panel_1_2.add(CampSales);
		
		textField2 = new JTextField();
		textField2.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		textField2.setColumns(10);
		textField2.setBounds(209, 208, 159, 37);
		panel_1_2.add(textField2);
		
		JButton btnNewButton = new JButton("UPLOAD");
		btnNewButton.addActionListener(new ActionListener() {
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
		btnNewButton.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		btnNewButton.setBounds(43, 375, 137, 44);
		panel_1_2.add(btnNewButton);
		
		JLabel NetProfit = new JLabel("Net Profit : RM");
		NetProfit.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		NetProfit.setBounds(22, 285, 177, 37);
		panel_1_2.add(NetProfit);
		
		textField3 = new JTextField();
		textField3.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		textField3.setColumns(10);
		textField3.setBounds(209, 285, 159, 37);
		panel_1_2.add(textField3);
		
		JButton Total = new JButton("TOTAL");
		Total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2, ans;
				
				try {
					num1 = Integer.parseInt(textField1.getText());
					num2 = Integer.parseInt(textField2.getText());
					
					
					
					ans = num1 - num2;
					textField3.setText(Double.toString(ans));
					
    			} catch(Exception e1) {
    				JOptionPane.showMessageDialog(null, "Invalid Number.");
    			}
			}
		});
		Total.setBounds(228, 375, 137, 44);
		panel_1_2.add(Total);
		Total.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 0, 255)));
		panel_1_2_1.setBackground(new Color(95, 158, 160));
		panel_1_2_1.setBounds(445, 126, 587, 463);
		panel.add(panel_1_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 567, 443);
		panel_1_2_1.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Sitka Text", Font.BOLD, 18));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"Month", "Merchandise Sales (RM)", "Camps Sales (RM)", "Net Profit (RM)"
			}
		));
		scrollPane.setViewportView(table);
	}
}

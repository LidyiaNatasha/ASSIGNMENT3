import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Participant extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FacilitatorGUI frame = new FacilitatorGUI();
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
	public Participant() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1098, 779);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 139)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBounds(39, 27, 994, 87);
		contentPane_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 139)));
		contentPane_1.setBackground(new Color(95, 158, 160));
		contentPane.add(contentPane_1);
		contentPane_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PARTICIPANT REGISTRATION");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 50));
		lblNewLabel.setBounds(91, 10, 789, 67);
		contentPane_1.add(lblNewLabel);
		
		JPanel contentPane_3 = new JPanel();
		contentPane_3.setBounds(34, 610, 999, 97);
		contentPane_3.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 139)));
		contentPane_3.setBackground(new Color(95, 158, 160));
		contentPane.add(contentPane_3);
		contentPane_3.setLayout(null);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.setFont(new Font("Sitka Text", Font.PLAIN, 19));
		btnNewButton.setBounds(20, 26, 155, 45);
		contentPane_3.add(btnNewButton);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setFont(new Font("Sitka Text", Font.PLAIN, 19));
		btnUpdate.setBounds(185, 26, 155, 45);
		contentPane_3.add(btnUpdate);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Sitka Text", Font.PLAIN, 19));
		btnReset.setBounds(350, 26, 155, 45);
		contentPane_3.add(btnReset);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setFont(new Font("Sitka Text", Font.PLAIN, 19));
		btnDelete.setBounds(515, 26, 155, 45);
		contentPane_3.add(btnDelete);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setFont(new Font("Sitka Text", Font.PLAIN, 19));
		btnPrint.setBounds(680, 26, 155, 45);
		contentPane_3.add(btnPrint);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.setFont(new Font("Sitka Text", Font.PLAIN, 19));
		btnNext.setBounds(845, 26, 132, 45);
		contentPane_3.add(btnNext);
		
		JPanel contentPane_4 = new JPanel();
		contentPane_4.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 139)));
		contentPane_4.setBackground(new Color(95, 158, 160));
		contentPane_4.setBounds(377, 124, 656, 464);
		contentPane.add(contentPane_4);
		contentPane_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 636, 444);
		contentPane_4.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"Name", "Age", "Contact No", "Email", "Gender", "Camp"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel contentPane_4_1 = new JPanel();
		contentPane_4_1.setLayout(null);
		contentPane_4_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 139)));
		contentPane_4_1.setBackground(new Color(95, 158, 160));
		contentPane_4_1.setBounds(35, 124, 332, 464);
		contentPane.add(contentPane_4_1);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 22));
		lblNewLabel_1.setBounds(24, 29, 112, 22);
		contentPane_4_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Age");
		lblNewLabel_1_1.setFont(new Font("Sitka Text", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(24, 85, 112, 22);
		contentPane_4_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Contact No");
		lblNewLabel_1_2.setFont(new Font("Sitka Text", Font.BOLD, 22));
		lblNewLabel_1_2.setBounds(24, 148, 112, 22);
		contentPane_4_1.add(lblNewLabel_1_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		textField.setBounds(133, 21, 166, 37);
		contentPane_4_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_3 = new JLabel("Email");
		lblNewLabel_1_3.setFont(new Font("Sitka Text", Font.BOLD, 22));
		lblNewLabel_1_3.setBounds(24, 219, 112, 22);
		contentPane_4_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Gender");
		lblNewLabel_1_4.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(24, 286, 130, 22);
		contentPane_4_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_6 = new JLabel("Camp");
		lblNewLabel_1_6.setFont(new Font("Sitka Text", Font.BOLD, 22));
		lblNewLabel_1_6.setBounds(24, 347, 112, 22);
		contentPane_4_1.add(lblNewLabel_1_6);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(133, 78, 166, 37);
		contentPane_4_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(133, 141, 166, 37);
		contentPane_4_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(133, 212, 166, 37);
		contentPane_4_1.add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female"}));
		comboBox.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		comboBox.setBounds(133, 281, 166, 32);
		contentPane_4_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select Camps", "Introduction To Programming", "Object Oriented Programming", "Graphical User Interface"}));
		comboBox_1.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		comboBox_1.setBounds(133, 342, 166, 32);
		contentPane_4_1.add(comboBox_1);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.setFont(new Font("Sitka Text", Font.PLAIN, 19));
		btnUpload.setBounds(89, 409, 155, 45);
		contentPane_4_1.add(btnUpload);
	}
}

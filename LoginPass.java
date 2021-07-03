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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class LoginPass extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField useridtextField;
	private JTextField passwordtextField;
	private JLabel passwordLabel;
	private JLabel companyLabel;
	private JLabel userIdLabel;
	private JPanel panel;
	private JPanel panel1;
	private JPanel panel2;
	private JButton LoginBUTTON;
	private JLabel logLabel;
	private JLabel passLabel;
	private JLabel okLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPass frame = new LoginPass();
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
	public LoginPass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 878, 714);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(95, 158, 160));
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 128)));
		panel.setBounds(0, 10, 864, 657);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 128)));
		panel_1.setBackground(new Color(95, 158, 160));
		panel_1.setBounds(97, 36, 693, 81);
		panel.add(panel_1);
		
		JLabel companyLabel = new JLabel("7DS COMPANY");
		companyLabel.setFont(new Font("Sitka Text", Font.BOLD, 50));
		companyLabel.setBounds(161, 10, 522, 61);
		panel_1.add(companyLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 128)));
		panel_2.setBackground(new Color(95, 158, 160));
		panel_2.setBounds(44, 211, 782, 351);
		panel.add(panel_2);
		
		JLabel userIdLabel = new JLabel("USER ID :");
		userIdLabel.setFont(new Font("Sitka Text", Font.PLAIN, 35));
		userIdLabel.setBounds(67, 47, 262, 85);
		panel_2.add(userIdLabel);
		
		useridtextField = new JTextField();
		useridtextField.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		useridtextField.setBounds(320, 59, 262, 62);
		panel_2.add(useridtextField);
		useridtextField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD :");
		lblNewLabel_1_1.setFont(new Font("Sitka Text", Font.PLAIN, 35));
		lblNewLabel_1_1.setBounds(54, 131, 262, 85);
		panel_2.add(lblNewLabel_1_1);
		
		passwordtextField = new JTextField();
		passwordtextField.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		passwordtextField.setColumns(10);
		passwordtextField.setBounds(320, 142, 262, 62);
		panel_2.add(passwordtextField);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		btnNewButton.setBounds(334, 148, 150, 54);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LOGIN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
						
						if(useridtextField.getText().equals("Lidyia") && passwordtextField.getText().equals("12345")) {
							JOptionPane.showMessageDialog(null, "Login Succesful");
							
							FacilitatorGUI frame = new FacilitatorGUI();
							frame.setVisible(true);
							
						}else
							JOptionPane.showMessageDialog(null, "Please enter the right user id and password");
						
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Please enter the right user id and password");
					}
				}
			});
		btnNewButton_1.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		btnNewButton_1.setBounds(291, 269, 193, 54);
		panel_2.add(btnNewButton_1);
	}
}

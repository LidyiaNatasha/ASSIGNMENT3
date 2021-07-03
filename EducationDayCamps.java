import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EducationDayCamps extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EducationDayCamps frame = new EducationDayCamps();
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
	public EducationDayCamps() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 773);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(95, 158, 160));
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 0, 255)));
		panel.setBounds(0, 0, 1076, 726);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 0, 255)));
		panel_1.setBackground(new Color(95, 158, 160));
		panel_1.setBounds(33, 26, 1004, 83);
		panel.add(panel_1);
		
		JLabel WELCOME = new JLabel("WELCOME TO EDUCATION DAY CAMPS");
		WELCOME.setFont(new Font("Sitka Text", Font.BOLD, 48));
		WELCOME.setBounds(27, 10, 945, 63);
		panel_1.add(WELCOME);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 0, 255)));
		panel_1_1.setBackground(new Color(95, 158, 160));
		panel_1_1.setBounds(33, 146, 497, 436);
		panel.add(panel_1_1);
		
		JLabel COMPANY = new JLabel("7DS COMPANY");
		COMPANY.setFont(new Font("Trebuchet MS", Font.BOLD, 63));
		COMPANY.setBounds(27, 23, 460, 74);
		panel_1_1.add(COMPANY);
		
		JLabel CONTACTS = new JLabel("CONTACT NO : 0377356970");
		CONTACTS.setFont(new Font("Sitka Text", Font.ITALIC, 22));
		CONTACTS.setBounds(27, 125, 433, 53);
		panel_1_1.add(CONTACTS);
		
		JLabel EMAIL = new JLabel("EMAIL : 7DS1234@gmail.com");
		EMAIL.setFont(new Font("Sitka Text", Font.ITALIC, 22));
		EMAIL.setBounds(27, 188, 433, 53);
		panel_1_1.add(EMAIL);
		
		JLabel LOCATION = new JLabel("NO. 32 BANGUNAN WANGSA, JOHOR BAHRU");
		LOCATION.setFont(new Font("Sitka Text", Font.ITALIC, 20));
		LOCATION.setBounds(27, 256, 433, 53);
		panel_1_1.add(LOCATION);
		
		JLabel TAGLINE = new JLabel("FOR BETTER CODING");
		TAGLINE.setFont(new Font("Sitka Text", Font.ITALIC, 22));
		TAGLINE.setBounds(27, 337, 433, 53);
		panel_1_1.add(TAGLINE);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 0, 255)));
		panel_1_1_1.setBackground(new Color(95, 158, 160));
		panel_1_1_1.setBounds(561, 146, 476, 436);
		panel.add(panel_1_1_1);
		
		JLabel SUBJECT1 = new JLabel("INTODUCTION TO PROGRAMMING");
		SUBJECT1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 24));
		SUBJECT1.setBounds(20, 75, 433, 53);
		panel_1_1_1.add(SUBJECT1);
		
		JLabel SUBJECT2 = new JLabel("OBJECT ORIENTED PROGRAMMING");
		SUBJECT2.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 24));
		SUBJECT2.setBounds(20, 195, 433, 53);
		panel_1_1_1.add(SUBJECT2);
		
		JLabel SUBJECT3 = new JLabel("GRAPHICAL USER INTERFACE");
		SUBJECT3.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 24));
		SUBJECT3.setBounds(20, 321, 433, 53);
		panel_1_1_1.add(SUBJECT3);
		
		JButton BACK = new JButton("BACK");
		BACK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		BACK.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		BACK.setBounds(33, 644, 170, 51);
		panel.add(BACK);
		
		JButton ADMIN = new JButton("ADMIN");
		ADMIN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPass frame = new LoginPass();
				frame.setVisible(true);
			}
		});
		ADMIN.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		ADMIN.setBounds(454, 644, 170, 51);
		panel.add(ADMIN);
		
		JButton PARTICIPANT = new JButton("PARTICIPANT");
		PARTICIPANT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Advertisement frame = new Advertisement();
				frame.setVisible(true);
				Sales frame3 = new Sales();
				frame3.setVisible(true);
				Participant frame1= new Participant();
				frame1.setVisible(true);
			}
		});
		PARTICIPANT.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		PARTICIPANT.setBounds(841, 644, 196, 51);
		panel.add(PARTICIPANT);
	}

}

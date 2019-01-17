package leetCode;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LengsOfLongest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LengsOfLongest frame = new LengsOfLongest();
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
	public LengsOfLongest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 687, 312);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInputString = new JLabel("input string");
		lblInputString.setBounds(77, 51, 102, 15);
		contentPane.add(lblInputString);
		
		textField = new JTextField();
		textField.setBounds(156, 48, 139, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(156, 96, 102, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblOutput = new JLabel("output");
		lblOutput.setBounds(111, 101, 54, 15);
		contentPane.add(lblOutput);
		
		JLabel lblLengsoflongest = new JLabel("lengsOfLongest");
		lblLengsoflongest.setBounds(198, 10, 121, 28);
		contentPane.add(lblLengsoflongest);
		
		JButton button = new JButton("È·¶¨");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				length();
			}
		});
		button.setBounds(86, 186, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("ÍË³ö");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new LeetCode().setVisible(true);
			}
		});
		button_1.setBounds(355, 186, 93, 23);
		contentPane.add(button_1);
	}
	public void length() {
		String string=textField.getText().substring(0, 1);
		for(int i=0;i<textField.getText().length();i++) {
			String str=textField.getText().substring(i, i+1);
			for(int j=i+1;j<textField.getText().length();j++) {
				char current=textField.getText().charAt(j);
				boolean target=false;
				for(int a=0;a<str.length();a++) {
					if(current==str.charAt(a)) {
						target=true;
						break;
					}
				}
				if(target==true) {
					break;
				}
				if(target==false) {
					str=str+current;
				}
			}
			if(str.length()>string.length()) {
				string=str;
			}
		}
		textField_1.setText(string+"  "+string.length());
	}
}

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
import java.util.LinkedList;

public class AddTwoNums extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddTwoNums frame = new AddTwoNums();
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
	public AddTwoNums() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 309);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirstNumber = new JLabel("first number");
		lblFirstNumber.setBounds(24, 64, 108, 15);
		contentPane.add(lblFirstNumber);
		
		textField = new JTextField();
		textField.setBounds(99, 61, 100, 18);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSecondNumber = new JLabel("second number");
		lblSecondNumber.setBounds(342, 64, 108, 15);
		contentPane.add(lblSecondNumber);
		
		textField_1 = new JTextField();
		textField_1.setBounds(424, 61, 108, 18);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAddTwoNums = new JLabel("add two nums");
		lblAddTwoNums.setBounds(133, 127, 199, 20);
		contentPane.add(lblAddTwoNums);
		
		textField_2 = new JTextField();
		textField_2.setBounds(220, 127, 130, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton button = new JButton("È·¶¨");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				addTwonums();
			}
		});
		button.setBounds(95, 193, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("ÍË³ö");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new LeetCode().setVisible(true);
			}
		});
		button_1.setBounds(391, 193, 93, 23);
		contentPane.add(button_1);
	}
	
	public void addTwonums() {
		LinkedList<Integer> list=new LinkedList<>();
		String[] str1=textField.getText().split(" ");
		String[] str2=textField_1.getText().split(" ");
		for(int i=0;i<Math.max(str1.length, str2.length);i++) {
            if(i<str1.length&&i<str2.length) {
            	list.add(Integer.parseInt(str1[i])+Integer.parseInt(str2[i]));
            }
            if(i>=str1.length) {
            	list.add(Integer.parseInt(str2[i]));
            }
            if(i>=str2.length) {
            	list.add(Integer.parseInt(str1[i]));
            }
		}
		textField_2.setText(String.valueOf(list));
	}
}

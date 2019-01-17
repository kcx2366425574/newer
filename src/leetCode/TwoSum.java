package leetCode;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TwoSum extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton button_1;
	private JLabel lblTwosum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TwoSum frame = new TwoSum();
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
	public TwoSum() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblArrays = new JLabel("arrays");
		lblArrays.setBounds(26, 68, 54, 15);
		contentPane.add(lblArrays);
		
		textField = new JTextField();
		textField.setBounds(74, 65, 213, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTarget = new JLabel("target");
		lblTarget.setBounds(400, 68, 54, 15);
		contentPane.add(lblTarget);
		
		textField_1 = new JTextField();
		textField_1.setBounds(450, 65, 66, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblOutputIndex = new JLabel("output index");
		lblOutputIndex.setBounds(135, 147, 102, 15);
		contentPane.add(lblOutputIndex);
		
		textField_2 = new JTextField();
		textField_2.setBounds(221, 144, 66, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton button = new JButton("ÍË³ö");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new LeetCode().setVisible(true);
			}
		});
		button.setBounds(465, 236, 93, 23);
		contentPane.add(button);
		
		button_1 = new JButton("È·¶¨");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sum();
			}
		});
		button_1.setBounds(228, 236, 93, 23);
		contentPane.add(button_1);
		
		lblTwosum = new JLabel("twoSum");
		lblTwosum.setBounds(289, 10, 54, 15);
		contentPane.add(lblTwosum);
	}
	public void sum() {
		String[] strArray=textField.getText().split(" ");
		int target=Integer.parseInt(textField_1.getText());
		int[] array=new int[strArray.length];
		for(int i=0;i<strArray.length;i++) {
			array[i]=Integer.parseInt(strArray[i]);
		}
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]+array[j]==target) {
					textField_2.setText(i+", "+j);
				}
			}
		}
	}
}

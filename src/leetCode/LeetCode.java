package leetCode;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LeetCode extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeetCode frame = new LeetCode();
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
	public LeetCode() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 742, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLeetcode = new JLabel("Welcome to my leetCode");
		lblLeetcode.setBounds(274, 20, 150, 39);
		contentPane.add(lblLeetcode);
		
		JButton btnTwosum = new JButton("twoSum");
		btnTwosum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new TwoSum().setVisible(true);
			}
		});
		btnTwosum.setBounds(66, 74, 136, 23);
		contentPane.add(btnTwosum);
		
		JButton btnAddtwonums = new JButton("addTwonums");
		btnAddtwonums.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new AddTwoNums().setVisible(true);
			}
		});
		btnAddtwonums.setBounds(66, 120, 136, 23);
		contentPane.add(btnAddtwonums);
		
		JButton btnLengthoflongest = new JButton("lengthOflongest");
		btnLengthoflongest.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new LengsOfLongest().setVisible(true);
			}
		});
		btnLengthoflongest.setBounds(66, 170, 136, 23);
		contentPane.add(btnLengthoflongest);
		
		JButton btnZigzag = new JButton("Zigzag");
		btnZigzag.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Zigzag().setVisible(true);
			}
		});
		btnZigzag.setBounds(66, 219, 136, 28);
		contentPane.add(btnZigzag);
	}
}

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

public class Zigzag extends JFrame {

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
					Zigzag frame = new Zigzag();
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
	public Zigzag() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInputstring = new JLabel("inputString");
		lblInputstring.setBounds(51, 154, 95, 20);
		contentPane.add(lblInputstring);
		
		textField = new JTextField();
		textField.setBounds(152, 154, 337, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblOutstring = new JLabel("outputString");
		lblOutstring.setBounds(51, 237, 95, 20);
		contentPane.add(lblOutstring);
		
		textField_1 = new JTextField();
		textField_1.setBounds(152, 237, 337, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblZigzag = new JLabel("Zigzag");
		lblZigzag.setBounds(192, 49, 54, 15);
		contentPane.add(lblZigzag);
		
		JButton button = new JButton("ÍË³ö");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new LeetCode().setVisible(true);
			}
		});
		button.setBounds(430, 327, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("È·¶¨");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				zigzagoutput();
			}
		});
		button_1.setBounds(125, 327, 93, 23);
		contentPane.add(button_1);
	}
	public void zigzagoutput() {
		String input=textField.getText();
		String[] current=input.split(" ");
		String text=current[0];
		int n=Integer.valueOf(current[1]);
		if(n==1) textField_1.setText(text);
		else {
		boolean visit=false;
		int cur=0;
		StringBuilder[] sBuilders=new StringBuilder[n];
		for(int i=0;i<n;i++) {
			sBuilders[i]=new StringBuilder("");
		}
		for(int i=1;i<=text.length();i++) {
			char c=text.charAt(i-1);
			sBuilders[cur].append(c);
			if(i%(n-1)==1) visit=!visit;
			if(visit==true) cur++;
			if(visit==false) cur--;
		}
		String output ="";
		for(int i=0;i<n;i++) {
			output+=sBuilders[i];
		}
		textField_1.setText(output);
		//PAYPALISHIRING
	}
  }
}

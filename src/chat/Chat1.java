package chat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;

public class Chat1 extends JFrame {

	//properties
	static String username1 = "aviel";  
	private JPanel contentPane;
	
	private static javax.swing.JTextArea display1;
	private javax.swing.JButton send1;
	public static javax.swing.JTextArea text1;
	private javax.swing.JButton clear1;
	private JLabel lblNewLabel;

	
	public static javax.swing.JTextArea getDisplay2() {
		return display1;
	}

	public static void setDisplay1(javax.swing.JTextArea display1) {
		System.out.println("ehre");
		Chat1.display1 = display1;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chat1 frame = new Chat1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Chat1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 799, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea text1 = new JTextArea();
		text1.setText("Type a message...");
		text1.setBounds(30, 355, 394, 75);
		contentPane.add(text1);
		
		JTextArea display1 = new JTextArea();
		display1.setBounds(30, 65, 678, 279);
		contentPane.add(display1);
		setDisplay1(display1);
		
		JButton clear1 = new JButton("Clear");
		clear1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		clear1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			//clear the chat from screen
				display1.setText("");
			}
		});
		clear1.setBounds(574, 11, 133, 43);
		contentPane.add(clear1);
		
		JButton send1 = new JButton("Send");
		send1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		send1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = text1.getText();
				if(s.equals(""))
					return;
				display1.append(username1 + ": " + s + "\n");
				Chat2.sendMessage2(s);
				text1.setText("");
			}
		});
		send1.setBounds(545, 369, 162, 61);
		contentPane.add(send1);
				
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(30, 22, 188, 21);
		lblNewLabel.setText("You are: " + username1);
		contentPane.add(lblNewLabel);
		
	}

	public static void sendMessage1(String str)
	{
		String s = str;	//get the message from text area in chat2
		if(s.equals(""))
			return;
		display1.append(Chat2.username2 + ": " + s + "\n");
	}


}

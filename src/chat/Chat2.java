package chat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;

public class Chat2 extends JFrame {

	//properties
	static String username2; 
	private JPanel contentPane;
	
	private static javax.swing.JTextArea display2;
	private javax.swing.JButton send2;
	public static javax.swing.JTextArea text2;
	private javax.swing.JButton clear2;
	private JLabel lblNewLabel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chat2 frame = new Chat2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Chat2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 799, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		text2 = new JTextArea();
		text2.setText("Type a message...");
		text2.setBounds(30, 355, 394, 75);
		contentPane.add(text2);
		
		display2 = new JTextArea();
		display2.setBounds(30, 65, 678, 279);
		contentPane.add(display2);
		
	    clear2 = new JButton("Clear");
	    clear2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		clear2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		//clear the chat from screen
				display2.setText("");
			}
		});
		clear2.setBounds(574, 11, 133, 43);
		contentPane.add(clear2);
		
		send2 = new JButton("Send");
		send2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		send2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = text2.getText();
				if(s.equals(""))
					return;
				display2.append(username2 + ": " + s + "\n");
				Chat1.sendMessage1(s);
				text2.setText("");
			}
		});
		send2.setBounds(545, 369, 162, 61);
		contentPane.add(send2);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(30, 28, 175, 26);
		lblNewLabel.setText("You are: " + username2);
		contentPane.add(lblNewLabel);
	}

	public static void sendMessage2(String str)
	{
		String s = str;	//get the message from text area in chat2
		if(s.equals(""))
			return;
		display2.append(Chat1.username1 + ": " + s + "\n");
	}
}

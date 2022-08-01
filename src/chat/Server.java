package chat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Server extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Server frame = new Server();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Server() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
		});
		
		textField_1.setBounds(113, 95, 344, 44);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
		});
		textField_2.setColumns(10);
		textField_2.setBounds(113, 238, 344, 44);
		contentPane.add(textField_2);
		
		JButton btnJoinChat = new JButton("Join Chat");
		btnJoinChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
		});
		btnJoinChat.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnJoinChat.setBounds(229, 311, 121, 59);
		contentPane.add(btnJoinChat);
		
		JLabel label2 = new JLabel("2nd username");
		label2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label2.setBounds(229, 180, 142, 36);
		contentPane.add(label2);
		
		JLabel label1 = new JLabel("1st username");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label1.setBounds(229, 48, 142, 36);
		contentPane.add(label1);
	}

	private void createRoom()
	{
		String p1 = textField_1.getText(), p2 = textField_2.getText();
		
		if(p1.equals("") || p2.equals(""))
		{
			JOptionPane.showMessageDialog(null, "Please enter a valid username");
			return;
		}
		
		Chat1.username1 = textField_1.getText();
		Chat2.username2 = textField_2.getText();
		ChatRoom.createRoom();

	}

}

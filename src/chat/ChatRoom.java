package chat;

public class ChatRoom {
	
	static Chat1 chat1;
	static Chat2 chat2;
	static Server server;
	
	public ChatRoom()
	{
		server = new Server();
		server.setLocationRelativeTo(null);
		server.setVisible(true);
	}
	
	public static void createRoom()
	{
		chat1 = new Chat1();
		chat2 = new Chat2();
		chat1.setLocation(1000, 300);
		chat2.setLocation(100, 300);
		chat1.setVisible(true);
		chat2.setVisible(true);
		chat1.setResizable(false);
		chat2.setResizable(false);
		server.setVisible(false);
	}
	
	public static void main(String[] args) {
		ChatRoom chatRoom = new ChatRoom();
	}

}

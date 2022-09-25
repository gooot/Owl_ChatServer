import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServerThread extends Thread{
	
	public static String HOSTIP = null;
	public static int PORT = 5050;
	
	public void run(){
		
		ServerSocket serverSocket;
		
		try {
			
			serverSocket = new ServerSocket();
			serverSocket.bind();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}

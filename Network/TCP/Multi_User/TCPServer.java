package networkprogramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class Connection extends Thread{
	DataInputStream inputStream;
	DataOutputStream outputStream;
	Socket clientSocket;
	
	public Connection(Socket aClientSocket) {
		try {
			this.clientSocket = aClientSocket;
			inputStream = new DataInputStream(clientSocket.getInputStream());
			outputStream = new DataOutputStream(clientSocket.getOutputStream());
			this.start();
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("IO: " + e.getMessage());
		}
	}
	
	public void run() {
		try {
			String dataString = inputStream.readUTF();
			outputStream.writeUTF(dataString);
		}catch (EOFException e) {
			// TODO: handle exception
			System.out.println("EOF: " + e.getMessage());
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("IO: " + e.getMessage());
		}finally {
			try {
				clientSocket.close();
			}catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}

public class TCPServer {
	public static void main(String[] args) {
		try {
			int serverPort = 7896;
			@SuppressWarnings("resource")
			ServerSocket listenSocket = new ServerSocket(serverPort);
			while(true) {
				Socket clientSocket = listenSocket.accept();
				@SuppressWarnings("unused")
				Connection connection = new Connection(clientSocket);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IO: " + e.getMessage());
		}
	}
}

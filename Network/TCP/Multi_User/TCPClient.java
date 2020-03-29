package networkprogramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			int serverPort = 7896;
			socket = new Socket(args[1], serverPort);
			DataInputStream inputStream = new DataInputStream(socket.getInputStream());
			DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
			outputStream.writeUTF(args[0]);
			String data = inputStream.readUTF();
			System.out.println("Received: " + data);
		} catch (UnknownHostException e) {
			// TODO: handle exception
			System.out.println("Socket: " + e.getMessage());
		}catch (EOFException e) {
			// TODO: handle exception
			System.out.println("EOF: " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IO: " + e.getMessage());
		} finally {
			if(socket != null) {
				try {
					socket.close();
				}catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}
}

package networkprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPClient {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(8888);
			// If it is not accepted, it will be blocked.
			Socket socket = serverSocket.accept();
			// Get the information from client
			InputStream inputStream = socket.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			BufferedReader bReader = new BufferedReader(inputStreamReader);
			String infoString = null;
			while((infoString = bReader.readLine()) != null) {
				System.out.println("Information from client " + infoString);
			}
			socket.shutdownInput();
			bReader.close();
			inputStreamReader.close();
			inputStream.close();
			socket.close();
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}

package networkprogramming;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
	public static void main(String[] args) {
		DatagramSocket aSocket = null;
		try {
			aSocket = new DatagramSocket(6789);
			byte[] buffer = new byte[1000];
			while(true) {
				DatagramPacket requestDatagramPacket = new DatagramPacket(buffer, buffer.length);
				aSocket.receive(requestDatagramPacket);
				DatagramPacket reply = new DatagramPacket(
						requestDatagramPacket.getData(),
						requestDatagramPacket.getLength(),
						requestDatagramPacket.getAddress(),
						requestDatagramPacket.getPort()
				);
				aSocket.send(reply);
			} 
		} catch (SocketException e) {
			// TODO: handle exception
			System.out.println("Socket: " + e.getMessage());
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("IO: " + e.getMessage());
		} finally {
			if(aSocket != null) {
				aSocket.close();
			}
		}
	}
}

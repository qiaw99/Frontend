package networkprogramming;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClient {
	public static void main(String[] args) {
		DatagramSocket aSocket = null;
		try {
			// args[0] -> message
			// args[1] -> DNS hostname
			aSocket = new DatagramSocket();
			byte[] m = args[0].getBytes();
			InetAddress aHostAddress = InetAddress.getByName(args[1]);
			int serverPort = 6789;
			DatagramPacket requestDatagramPacket = new DatagramPacket(m, args[0].length(), aHostAddress, serverPort);
			aSocket.send(requestDatagramPacket);
			byte[] buffer = new byte[1000];
			DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
			aSocket.receive(reply);
			System.out.println("Reply: " + new String(reply.getData()));
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

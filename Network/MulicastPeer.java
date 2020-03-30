package networkprogramming;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

public class MulicastPeer {
	public static void main(String[] args) {
		// args give message contens & destination multicast group
		MulticastSocket socket = null;
		try {
			InetAddress groupAddress = InetAddress.getByName(args[1]);
			socket = new MulticastSocket(6789);
			socket.joinGroup(groupAddress);
			byte[] m = args[0].getBytes();
			DatagramPacket messageOutDatagramPacket = new DatagramPacket(m, m.length, groupAddress, 6789);
			socket.send(messageOutDatagramPacket);
			byte[] buffer = new byte[1000];
			for(int i = 0; i < 3; i ++) {
				DatagramPacket messageInPacket = new DatagramPacket(buffer, buffer.length);
				socket.receive(messageInPacket);
				System.out.println("Received: " + new String(messageInPacket.getData()));
			}
			socket.leaveGroup(groupAddress);
		} catch (SocketException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			// TODO: handle finally clause
			if(socket != null) {
				socket.close();
			}
		}
	}
}

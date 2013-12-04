package com.shitouer.net;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class MySocket {
	public void ping(String host, int port) throws Exception {
		Socket s = null;
		try {
			// s = new Socket(host, port);
			s = new Socket();
			SocketAddress endpoint = new InetSocketAddress(host, port);
			s.connect(endpoint, 1000); // timeout 1000ms
		} catch (Exception e) {
			throw e;
		} finally {
			if (s != null)
				s.close();
		}
	}
}

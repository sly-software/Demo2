package com.networkJavaProgramming;

import java.net.InetSocketAddress;

public class InetDemo {

	public static void main(String[] args) {
		// Get the IP address of the  Yahoo web server
		try {
			// InetAddress yahooAddress = InetAddress.getByName("www.yahoo.com");
			// InetAddress loopbackAddress = InetAddress.getByName(null);
			//InetAddress myComputerAddress = InetAddress.getLocalHost();
			
			// InetSocketAddressTest
			InetSocketAddress addrs1 = new InetSocketAddress("::1", 12889);
			System.out.println(addrs1.getAddress());
			System.out.println(addrs1.getHostName());
			System.out.println(addrs1.getPort());
			System.out.println(addrs1.isUnresolved());
			System.out.println();
			
			InetSocketAddress addrs2 = InetSocketAddress.createUnresolved("::1", 12881);
			System.out.println(addrs2.getAddress());
			System.out.println(addrs2.getHostName());
			System.out.println(addrs2.getPort());
			System.out.println(addrs2.isUnresolved());
			System.out.println();
		} 
		catch (Exception e) {
			// TODO: handle exception
		}
			
		

	}

		
}

package program2;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class tcpserver {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			ServerSocket s=new ServerSocket(1800);
			System.out.println("Server is ready for clients");
			Socket client=s.accept();
			
			DataInputStream din=new DataInputStream(client.getInputStream());
			PrintStream pw=new PrintStream(client.getOutputStream());
			
			
			System.out.println("Client :"+din.readLine());
			
			pw.println("Welcome to the clients");
			
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

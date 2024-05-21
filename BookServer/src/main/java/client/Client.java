package client;

import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Scanner;


public class Client {
	public static void main(String[] args) {
		try (Socket socket = new Socket("", 6541);
				Scanner sc = new Scanner(System.in);) {
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
			int choice = 0;
			
			while (true) {
				System.out.println("""
						
						""");
				choice = sc.nextInt();
				out.writeInt(choice);
				out.flush();
				switch (choice) {
					case 1:{
						
					}
				}
			}
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
}

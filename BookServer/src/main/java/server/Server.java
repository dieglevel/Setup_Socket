package server;

import java.io.DataInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import dao.Exam_Dao;
import dao_Implement.Exam_Implement;
import jakarta.persistence.Persistence;

public class Server {
	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(6541);) {
			System.out.println("Server started at port " + server.getLocalPort());
			while (true) {
				Socket client = server.accept();
				System.out.println("Client connected");
				System.out.println("Client IP: " + client.getInetAddress().getHostName());
				System.out.println("Client Port: " + client.getPort());
				Thread t = new Thread(new ClientHandle(client));
				t.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class ClientHandle implements Runnable {
	private Socket socket;
	private Exam_Dao example;
	
	public ClientHandle(Socket client) {
		super();
		this.socket = client;
		this.example = new Exam_Implement(Persistence.createEntityManagerFactory(""));
	}
	
    @Override
    public void run() {
    	try {
    		DataInputStream dis = new DataInputStream(socket.getInputStream());
    		ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
    		int choice = 0;
    		
    		while (true) {
    			choice = dis.readInt();
    			switch (choice) {
					case 1:{
						
					}
    			}
    		}
    	}
		catch (Exception e) {
			e.printStackTrace();
		}
    }
}

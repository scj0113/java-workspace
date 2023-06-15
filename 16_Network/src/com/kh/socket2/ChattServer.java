package com.kh.socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattServer {

	
	// 클라이언트가 보낸 메세지를 받아서 다시 클라이언트에게 받은 메세지를 보낸다.
	
	
	public static void main(String[] args) {

		
		try {
			// 1. Server Socket
			ServerSocket server = new ServerSocket(60000);
			
			// 2. 클라이언트가 서버에 접속하면 accept로 받아서 Socket 리턴
			Socket s = server.accept();
			
			// 3. 소켓으로부터 스트림 리턴
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			
			PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
			
			
			String line = null;	
			while((line = br.readLine()) != null) {
				System.out.println("["+s.getInetAddress() + "] 가 보낸 메세지 : "+line);
				pw.println(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		try {
//			ServerSocket server = new ServerSocket(60000);
//			System.out.println("Server Ready......");
//
//			Socket s = server.accept();
//			System.out.println("Client Socket... Returning...");
//
//			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//
//			String line1 = null;
//			while ((line1 = br.readLine()) != null) {
//				
//				
//		
//				PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
//
//				while ((line1 = br.readLine()) != null) {
//					pw.println(line1);
//					
//				
//				}
//
//			}
//			br.close();
//
//		} catch (IOException e) {
//			System.out.println("서버와의 연결이 끊겼습니다.");
//		}
//
//	}

}
}
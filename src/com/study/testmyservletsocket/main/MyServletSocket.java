package com.study.testmyservletsocket.main;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class MyServletSocket {

	public static void main(String[] args) {
		//1-65535
//		try {
//			
//			ServerSocket serverSocket = new ServerSocket(12345);
//			//block
//			Socket socket = serverSocket.accept();
//			//��������
//			JOptionPane.showMessageDialog(null,"�пͻ������ӵ�������12345�˿�");
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		new ServletListener().start();

	}

}

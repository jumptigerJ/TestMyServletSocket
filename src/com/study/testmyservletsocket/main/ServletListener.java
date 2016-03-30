package com.study.testmyservletsocket.main;

import java.awt.HeadlessException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ServletListener extends Thread {
	@Override
	public void run() {
		try {
			ServerSocket serverSocket = new ServerSocket(12345);
			while(true){
				//block
				Socket socket = serverSocket.accept();
				//建立连接
				JOptionPane.showMessageDialog(null,"有客户端连接到本机的12345端口");
				//将socket传给新的线程
				ChatSocket cs = new ChatSocket(socket);
				cs.start();
				ChatManager.getChatManager().add(cs);
			}
			
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

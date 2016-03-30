package com.study.testmyservletsocket.main;

import java.util.Vector;

public class ChatManager{
	//由于一个聊天服务器只能有一个聊天manager,所以这里采用单例化处理，所以要把这个类单例化，单例化的第一步就是让这个类的构造方法变成private类型
	private static final ChatManager cm = new ChatManager();
	public static ChatManager getChatManager(){
		return cm;
	}
	
	Vector<ChatSocket> vector = new Vector<ChatSocket>();
	
	public void add(ChatSocket cs){
		vector.add(cs);
	}
	
	public void publish(ChatSocket cs,String out){
		for (int i = 0; i < vector.size(); i++) {
			ChatSocket csChatSocket = vector.get(i);
			if(!cs.equals(csChatSocket)){
				csChatSocket.out(out);
			}
		}
	}
	

}

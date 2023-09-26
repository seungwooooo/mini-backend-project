package com.talk.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.talk.dao.ChatDao;
import com.talk.vo.Chat;

@Service
public class ChatService {

	@Autowired
	private ChatDao dao;

	public List<Chat> list_chat(HashMap<String,Object> parameters)throws Exception {
		List<Chat> list = new ArrayList<Chat>();
		try { 
			list = dao.list_chat(parameters);

		} catch(Exception e) {
	        throw e;
	    }
		return list;
	}
	
	@Transactional(rollbackFor = Exception.class)
	public void insert_chat(Chat msg) throws Exception {
		try 
		{
			if(msg == null){
				throw new Exception("채팅방 추가 에러 발생입니다.");  
			}
			
			dao.insert_chat(msg);

		} catch(Exception e) {
			throw e;
		}
	}
}

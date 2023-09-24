package com.talk.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.talk.dao.ChatMessageDao;
import com.talk.vo.ChatMessage;

@Service
public class ChatMessageService {

	@Autowired
	private ChatMessageDao dao;
	
	public List<ChatMessage> list_chatmsg(HashMap<String,Object> parameters)throws Exception {
		List<ChatMessage> list = new ArrayList<ChatMessage>();
		try { 
			list = dao.list_chatmsg(parameters);

		} catch(Exception e) {
	        throw e;
	    }
		return list;
	}
	
	@Transactional(rollbackFor = Exception.class)
	public void insert_message(ChatMessage msg) throws Exception {
		try 
		{
			if(msg != null){
				dao.insert_message(msg);
			}

		} catch(Exception e) {
			throw e;
		}
	}
}

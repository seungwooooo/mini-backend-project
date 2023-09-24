package com.talk.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.talk.dao.ChatDao;
import com.talk.vo.Chat;
import com.talk.vo.Member;

@Service
public class ChatService {

	@Autowired
	private ChatDao dao;
//	
//	@Transactional(rollbackFor = Exception.class)
//	public void insert_chat(Chat chat) throws Exception {
//		try 
//		{
//			if(chat != null && ){
//				inset_chat(chat);
//			}
//
//		} catch(Exception e) {
//			throw e;
//		}
//		
//		return user;
//	}
}

package com.talk.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.talk.vo.ChatMessage;

@Repository
public class ChatMessageDao {

	@Autowired
	private SqlSession sqlSession;
	
	public int insert_message(ChatMessage parameters) throws Exception{
		return sqlSession.insert(this.getClass().getName() + ".insert_message", parameters);
		
	}
	
	public List<ChatMessage> list_chatmsg(HashMap<String, Object> parameters) throws Exception{
		return sqlSession.selectList(this.getClass().getName() + ".list_chatmsg", parameters);
	}
}

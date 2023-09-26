package com.talk.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.talk.vo.Chat;
import com.talk.vo.ChatMessage;

@Repository
public class ChatDao {

	@Autowired
	private SqlSession sqlSession;
	
	public int insert_chat(Chat parameters) {
		return sqlSession.insert(this.getClass().getName() + ".insert_chat", parameters);
	}
	
	public List<Chat> list_chat(HashMap<String, Object> parameters) throws Exception{
		return sqlSession.selectList(this.getClass().getName() + ".list_chat", parameters);
	}
}

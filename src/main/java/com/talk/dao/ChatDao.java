package com.talk.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.talk.vo.Chat;

@Repository
public class ChatDao {

	@Autowired
	private SqlSession sqlSession;
	
	public int insert_chat(Chat parameters) {
		return sqlSession.insert(this.getClass().getName() + ".insert_chat", parameters);
		
	}
}

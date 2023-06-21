package com.talk.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.talk.vo.User;

@Repository
public class UserDao {

	@Autowired
	private SqlSession sqlSession;
	
	public User find_User(HashMap<String, Object> parameters) {
		return sqlSession.selectOne(this.getClass().getName() + ".find_User", parameters);
	}
}

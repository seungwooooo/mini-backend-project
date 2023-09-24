package com.talk.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.talk.vo.Member;

@Repository
public class MemberDao {

	@Autowired
	private SqlSession sqlSession;
	
	public Member find_Member(HashMap<String, Object> parameters) {
		return sqlSession.selectOne(this.getClass().getName() + ".find_Member", parameters);
	}
}

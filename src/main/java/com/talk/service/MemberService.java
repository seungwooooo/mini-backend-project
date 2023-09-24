package com.talk.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talk.dao.MemberDao;
import com.talk.vo.Member;

@Service
public class MemberService {

	@Autowired
	private MemberDao dao;
	
	public Member find_Member(HashMap<String,Object> parameters) throws Exception {
		Member user = new Member();
		try 
		{	
			user = dao.find_Member(parameters);
			
		} catch(Exception e) {
			throw e;
		}
		
		return user;
	}
}

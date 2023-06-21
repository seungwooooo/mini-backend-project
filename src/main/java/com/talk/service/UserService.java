package com.talk.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talk.dao.UserDao;
import com.talk.vo.User;

@Service
public class UserService { //���� : �����Ͻ� ���� ����

	//@Autowired�� ������ �޼��尡 �ڵ����� ȣ��ǰ�, �ν��Ͻ��� �ڵ����� ���Ե˴ϴ�. 
	@Autowired
	private UserDao dao;
	
	public User find_User(
			String id, 
			String password
	) throws Exception {
		User user = new User();
		try 
		{
			HashMap<String, Object> parameters = new HashMap<String, Object>();
			
			parameters.put("P_ID", id);
			parameters.put("P_PASSWORD", password);
			
			user = dao.find_User(parameters);
			
		} catch(Exception e) {
			throw e;
		}
		
		return user;
	}
}

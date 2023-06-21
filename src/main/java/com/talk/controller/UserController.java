package com.talk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.talk.service.UserService;
import com.talk.vo.User;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String userlogin(
			@RequestParam("id") String id, 
			@RequestParam("password") String password
	) throws Exception {
		//계정 찾기
		User user = userService.find_User(id, password);
		
		if(user == null) {
			return "fail";
		}
		return "sucess";
	}


}

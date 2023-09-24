package com.talk.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.talk.service.ChatMessageService;
import com.talk.service.MemberService;
import com.talk.vo.ChatMessage;
import com.talk.vo.JsonResult;
import com.talk.vo.Member;

import lombok.RequiredArgsConstructor;



@RequiredArgsConstructor
@RequestMapping("/user")
@RestController
public class UserController {
	
	@Autowired
	private MemberService memberService;

	@Autowired
	private ChatMessageService msgService;
	//로그인은 interceptor에서 처리
	@RequestMapping("/login")
	public String userlogin(
			@RequestParam("id") String id, 
			@RequestParam("password") String password
	) throws Exception {
		HashMap<String, Object> parameters = new HashMap<String,Object>();
		
		parameters.put("P_ID", id);
		parameters.put("P_PASSWORD", password);
		
		Member user = memberService.find_Member(parameters);
		
		if(user == null) {
			return "fail";
		}
		return "sucess";
	}
	
	@RequestMapping("/list_chatmsg")
	public List<ChatMessage> list_chatmsg(
			@RequestParam("chat_no") String chat_no
	) throws Exception {
		HashMap<String, Object> parameters = new HashMap<String, Object>();		
		
		parameters.put("P_CHAT_NO", chat_no);

		List<ChatMessage> c_msg = msgService.list_chatmsg(parameters);

		return c_msg;
	}
	
	@PostMapping("/insert_message")
	public void insert_message(
			@RequestBody ChatMessage msg
	) throws Exception {
		msgService.insert_message(msg);

	}


//	@RequestMapping("/logout")
//	public JsonResult userlogout(@RequestBody HashMap<String, String> map) {
//		System.out.println("C: userlogout ");
//		int status = 1;
//		
//		System.out.println(	map.get("token"));
//		
//		Long no = Long.parseLong((String)map.get("token"));
//		
//		memberService.UpdateUserState(no, status);
//		
//		return JsonResult.success("ok");
//	}
	
//	@PostMapping("/join")
//	public void join(@RequestBody Member user) {
//		String[] userNo = user.getUserNo().split("-"); // 사용자가 입력한 코드
//		boolean emailCheck = userService.findByEmail(user.getEmail());
//		System.out.println("email 중복체크" + emailCheck);
//		if(emailCheck == false) {
//			return;
//		}
//		
//		if(userNo.length == 4) {
//			user.setRole("CP");
//		} else {
//			user.setRole("CS");
//		}
//		
//		userService.joinUser(user);
//		userService.setCode(userNo);
//		
//	}
}

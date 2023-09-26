package com.talk.vo;

import java.util.Date;

public class ChatMessage {
	
	private String msg_sq;
	
	private String chat_no;
	
	private String sender;
	
	private String read_cnt;
	
	private String message;
	
	private Date regdate;

	public String getMsg_sq() {
		return msg_sq;
	}

	public void setMsg_sq(String msg_sq) {
		this.msg_sq = msg_sq;
	}

	public String getChat_no() {
		return chat_no;
	}

	public void setChat_no(String chat_no) {
		this.chat_no = chat_no;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getRead_cnt() {
		return read_cnt;
	}

	public void setRead_cnt(String read_cnt) {
		this.read_cnt = read_cnt;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

}

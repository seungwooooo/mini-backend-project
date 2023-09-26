package com.talk.vo;

import java.util.Date;

public class Chat {
	
	private String chat_no;
	
	private String chat_title;
	
	private Date regdate;

	public String getChat_no() {
		return chat_no;
	}

	public void setChat_no(String chat_no) {
		this.chat_no = chat_no;
	}

	public String getChat_title() {
		return chat_title;
	}

	public void setChat_title(String chat_title) {
		this.chat_title = chat_title;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}


}

package com.ca.bms.common.dto;

import java.io.Serializable;

/**
 * @author：刘志龙
 * @since：2014年12月7日 上午10:18:24
 * @version:1.0
 */
public class UserDTO implements Serializable {
	private static final long serialVersionUID = -5656005282788282913L;
	private String username;
	private String nickname;
	private String phoneNum;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
}

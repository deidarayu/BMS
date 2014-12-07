package com.ca.bms.msg.dto;

import java.io.Serializable;

import com.ca.bms.dto.UserDTO;

/**
 * @author：刘志龙
 * @since：2014年12月7日 上午9:57:02
 * @version:1.0
 */
public class ReturnMsgUserDTO implements Serializable {

	private static final long serialVersionUID = 7464060837581324768L;
	private UserDTO userdata;

	public UserDTO getUserdata() {
		return userdata;
	}

	public void setUserdata(UserDTO userdata) {
		this.userdata = userdata;
	}
}

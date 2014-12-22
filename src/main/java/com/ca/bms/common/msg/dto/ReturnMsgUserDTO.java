package com.ca.bms.common.msg.dto;

import java.io.Serializable;

import com.ca.bms.common.dto.UserDTO;

/**
 * @author：刘志龙
 * @since：2014年12月7日 上午9:57:02
 * @version:1.0
 */
public class ReturnMsgUserDTO implements Serializable {

	private static final long serialVersionUID = 7464060837581324768L;
	private String returnmsg;
	private String usertoken;
	private UserDTO userdata;

	public UserDTO getUserdata() {
		return userdata;
	}

	public void setUserdata(UserDTO userdata) {
		this.userdata = userdata;
	}

	public String getUsertoken() {
		return usertoken;
	}

	public void setUsertoken(String usertoken) {
		this.usertoken = usertoken;
	}

	public String getReturnmsg() {
		return returnmsg;
	}

	public void setReturnmsg(String returnmsg) {
		this.returnmsg = returnmsg;
	}
}

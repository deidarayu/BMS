package com.ca.bms.common.msg.dto;

import java.io.Serializable;

/**
 * @author：刘志龙
 * @since：2014年12月7日 上午9:56:37
 * @version:1.0
 */
public class ReturnMsgDTO implements Serializable {

	private static final long serialVersionUID = 8719995762982973332L;
	private String returnmsg;

	public String getReturnmsg() {
		return returnmsg;
	}

	public void setReturnmsg(String returnmsg) {
		this.returnmsg = returnmsg;
	}
}

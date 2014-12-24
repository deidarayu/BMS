package com.ca.bms.common.msg.dto;

import java.util.List;

import com.ca.bms.common.dto.AlertMsgDTO;

public class ReturnMsgAlertDTO {
	private String returnmsg;
	private List<AlertMsgDTO> data;
	public String getReturnmsg() {
		return returnmsg;
	}
	public void setReturnmsg(String returnmsg) {
		this.returnmsg = returnmsg;
	}
	public List<AlertMsgDTO> getData() {
		return data;
	}
	public void setData(List<AlertMsgDTO> data) {
		this.data = data;
	}

}

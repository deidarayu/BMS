package me.zhilong.bms.common.msg.dto;

import java.io.Serializable;

import me.zhilong.bms.common.dto.SensorDataDTO;

/**
 * @author：刘志龙
 * @since：2014年12月7日 上午9:57:35
 * @version:1.0
 */
public class ReturnMsgDataDTO implements Serializable {
	private static final long serialVersionUID = -1333125836893743130L;
	private String returnmsg;
	private SensorDataDTO data;

	public String getReturnmsg() {
		return returnmsg;
	}

	public void setReturnmsg(String returnmsg) {
		this.returnmsg = returnmsg;
	}

	public SensorDataDTO getData() {
		return data;
	}

	public void setData(SensorDataDTO data) {
		this.data = data;
	}
}

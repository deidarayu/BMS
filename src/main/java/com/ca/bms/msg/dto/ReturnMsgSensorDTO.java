package com.ca.bms.msg.dto;

import java.io.Serializable;

import com.ca.bms.dto.SensorDTO;

/**
 * @author：刘志龙
 * @since：2014年12月7日 上午9:57:23
 * @version:1.0
 */
public class ReturnMsgSensorDTO implements Serializable {
	private static final long serialVersionUID = -2676732843544285640L;
	private String returnmsg;
	private SensorDTO sensorDTO;

	public String getReturnmsg() {
		return returnmsg;
	}

	public void setReturnmsg(String returnmsg) {
		this.returnmsg = returnmsg;
	}

	public SensorDTO getSensorDTO() {
		return sensorDTO;
	}

	public void setSensorDTO(SensorDTO sensorDTO) {
		this.sensorDTO = sensorDTO;
	}
}

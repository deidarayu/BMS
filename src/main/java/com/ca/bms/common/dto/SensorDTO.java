package com.ca.bms.common.dto;

import java.io.Serializable;

/**
 * @author：刘志龙
 * @since：2014年12月7日 上午10:18:35
 * @version:1.0
 */
public class SensorDTO implements Serializable {
	private static final long serialVersionUID = -5797827542673533039L;
	private String serialNum;
	private String sensorType;
	private String sensoraddr;

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public String getSensorType() {
		return sensorType;
	}

	public void setSensorType(String sensorType) {
		this.sensorType = sensorType;
	}

	public String getSensoraddr() {
		return sensoraddr;
	}

	public void setSensoraddr(String sensoraddr) {
		this.sensoraddr = sensoraddr;
	}
}

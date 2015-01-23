package me.zhilong.bms.common.msg.dto;

import java.io.Serializable;
import java.util.List;

import me.zhilong.bms.common.dto.SensorDTO;

/**
 * @author：刘志龙
 * @since：2014年12月7日 上午9:57:23
 * @version:1.0
 */
public class ReturnMsgSensorDTO implements Serializable {
	private static final long serialVersionUID = -2676732843544285640L;
	private String returnmsg;
	private List<SensorDTO> sensor;

	public String getReturnmsg() {
		return returnmsg;
	}

	public void setReturnmsg(String returnmsg) {
		this.returnmsg = returnmsg;
	}

	public List<SensorDTO> getSensor() {
		return sensor;
	}

	public void setSensor(List<SensorDTO> sensor) {
		this.sensor = sensor;
	}
}

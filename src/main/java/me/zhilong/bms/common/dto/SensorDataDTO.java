package me.zhilong.bms.common.dto;

import java.io.Serializable;

/**
 * @author：刘志龙
 * @since：2014年12月7日 上午10:18:44
 * @version:1.0
 */
public class SensorDataDTO implements Serializable {

	private static final long serialVersionUID = 4101192189743906634L;
	private String createTime;
	private String modifyTime;
	private double temperature;
	private double humidity;
	private double co;
	private double smoke;
	private String serialNum;

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public double getCo() {
		return co;
	}

	public void setCo(double co) {
		this.co = co;
	}

	public double getSmoke() {
		return smoke;
	}

	public void setSmoke(double smoke) {
		this.smoke = smoke;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public String getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
}

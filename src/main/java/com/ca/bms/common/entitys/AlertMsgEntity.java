package com.ca.bms.common.entitys;

import java.io.Serializable;

/**
 * 警报消息实体
 * @author：刘志龙
 * @since：2014年12月24日 下午16:48:23
 * @version:1.0
 */
public class AlertMsgEntity implements Serializable {
	private static final long serialVersionUID = 293138883335609772L;
	private Long id;
	private String createTime;
	private String modifyTime;
	private int version;
	private String serialNum;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}
	@Override
	public String toString() {
		return "AlertMsgEntity [id=" + id + ", createTime=" + createTime
				+ ", modifyTime=" + modifyTime + ", version=" + version
				+ ", serialNum=" + serialNum + "]";
	}
}

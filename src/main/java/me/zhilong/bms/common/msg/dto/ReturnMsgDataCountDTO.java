/*
 * Copyright 2015 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package me.zhilong.bms.common.msg.dto;

import java.io.Serializable;
import java.util.List;

import me.zhilong.bms.common.dto.DataCountDTO;

/**
 * 类ReturnMsgDataCountDTO.java的实现描述：用于反解析api模块接口中传递的数据
 * 
 * @author 正纬 2015年4月6日 下午7:13:30
 */
public class ReturnMsgDataCountDTO implements Serializable {

    private static final long  serialVersionUID = 7971489146240916319L;
    private String             returnmsg;
    private List<DataCountDTO> data;

    /**
     * @return the returnmsg
     */
    public String getReturnmsg() {
        return returnmsg;
    }

    /**
     * @param returnmsg the returnmsg to set
     */
    public void setReturnmsg(String returnmsg) {
        this.returnmsg = returnmsg;
    }

    /**
     * @return the data
     */
    public List<DataCountDTO> getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(List<DataCountDTO> data) {
        this.data = data;
    }

}

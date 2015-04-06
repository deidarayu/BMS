/*
 * Copyright 2015 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package me.zhilong.bms.common.dto;

import java.io.Serializable;

/**
 * 类DataCountDTO.java的实现描述：用于传输数据计数
 * 
 * @author 正纬 2015年4月6日 下午3:58:35
 */
public class DataCountDTO implements Serializable {

    private static final long serialVersionUID = 1899971274103549215L;
    private String            serialNum;
    private int               count;

    /**
     * @return the serialNum
     */
    public String getSerialNum() {
        return serialNum;
    }

    /**
     * @param serialNum the serialNum to set
     */
    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }

}

package com.tta.tool.model;

import java.io.Serializable;

/**
 * 用于包装控制类处理后返回的结果信息
 * 作为spring mvc的结果封装类，需要增加成员变量的get set方法，否则会报
 * No converter found for return value of type异常
 */
public class JsonData implements Serializable {
    /**
     * 序列化
     */
    private static final long serialVersionUID = 1L;
    //状态码，0成功、-1失败、1处理中
    private String code;
    private Object data;
    private String msg;

    public JsonData(String code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    /**
     * 成功处理，无参数
     * @return
     */
    public static JsonData successDeal() {
        return new JsonData("0", null, "");
    }

    /**
     * 处理成功，返回传入的data对象的Json结果对象
     * @param data
     * @return
     */
    public static JsonData successDeal(Object data) {
        return new JsonData("0", data, "");
    }

    /**
     * 错误处理，无参数
     * @return
     */
    public static JsonData failDeal() {
        return new JsonData("-1", null, null);
    }

    @Override
    public String toString() {
        return "JsonData[code = "+code+", data = "+data+", msg = "+msg+"]";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

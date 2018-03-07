package com.feng.structurewebpj;

/**
 * Package Name: com.wtyt.youyun.data.protocol
 *
 * @author ysr
 * @Email yfeng1023@gmail.com
 * @Description: 能用响应对象
 * @status:响应状态码
 * @message:响应文字消息
 * @data:具体响应业务对象
 * @Create Date: 2018年03月05日 19:30
 */

public class BaseResp<T> {
    int status;
    String message;
    T data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

package com.he.attenddemo.helper;

import lombok.Data;

@Data
public class MessageResult {
    private Integer code;
    private String msg;
    private Integer count;
    private Object data;

    public MessageResult(Integer code, String msg, Integer count, Object data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public MessageResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public MessageResult() {
    }
}

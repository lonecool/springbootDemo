package com.example.wyh.common;

public enum HttpCode {

    SUCCESS(200,"成功"),
    FAIL(500,"服务器出问题了"),
    ERROR(404,"访问地址错误");

    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

     HttpCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}

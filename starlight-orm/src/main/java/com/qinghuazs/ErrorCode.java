package com.qinghuazs;

import com.baomidou.mybatisplus.extension.api.IErrorCode;

public enum  ErrorCode implements IErrorCode {
    FAIL(-1, "请求失败");

    private long code;
    private String msg;

    ErrorCode(long code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public long getCode() {
        return 0;
    }

    public String getMsg() {
        return null;
    }
}

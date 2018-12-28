package com.qinghuazs.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WebResponse {

    private String code;
    private String msg;
    private Object data;

    public static WebResponse success() {
        return WebResponse.builder().code("0").msg("请求成功").build();
    }

    public static WebResponse success(Object data) {
        return WebResponse.builder().code("0").msg("请求成功").data(data).build();
    }

    public static WebResponse success(String msg, Object data) {
        return WebResponse.builder().code("0").msg(msg).data(data).build();
    }

    public static WebResponse fail() {
        return WebResponse.builder().code("-1").msg("请求失败").build();
    }

    public static WebResponse fail(Object data) {
        return WebResponse.builder().code("-1").msg("请求失败").data(data).build();
    }

    public static WebResponse fail(String msg, Object data) {
        return WebResponse.builder().code("-1").msg(msg).data(data).build();
    }

    public static WebResponse fail(String code, String msg) {
        return WebResponse.builder().code(code).msg(msg).build();
    }
}

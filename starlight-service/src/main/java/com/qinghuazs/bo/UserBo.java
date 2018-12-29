package com.qinghuazs.bo;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class UserBo {

    private long id;
    @NotNull(message = "用户名不能为空") @Length(min = 2, max = 64)
    private String username;
    private String password;
    private String realname;
    private String userCode;
    private String seatPhone;
    private String telephone;
    private String smPhone;
    @Email
    private String innerEmail;
    @Email
    private String outterEmail;
    @Email(message = "邮箱格式不正确")
    private String email;
}

package com.qinghuazs.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class User extends Model<User> {

    private long id;
    private String username;
    private String password;
    private String realname;
    private String userCode;
    private String seatPhone;
    private String telephone;
    private String smPhone;
    private String innerEmail;
    private String outterEmail;
    private String email;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}

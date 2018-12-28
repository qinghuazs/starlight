package com.qinghuazs.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class User extends Model<User> {

    private Integer id;
    private String username;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}

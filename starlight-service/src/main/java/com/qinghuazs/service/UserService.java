package com.qinghuazs.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qinghuazs.bo.UserBo;
import com.qinghuazs.entity.User;

import java.util.List;

public interface UserService extends IService<User> {

    /**
     * 保存用户信息
     * @param userBo
     * @return
     */
    User saveUser(UserBo userBo);

    /**
     * 获取所有用户信息
     * @return
     */
    List<User> getAllUser();

}

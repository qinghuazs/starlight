package com.qinghuazs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qinghuazs.bo.UserBo;
import com.qinghuazs.entity.User;
import com.qinghuazs.mapper.UserMapper;
import com.qinghuazs.orika.Orika;
import com.qinghuazs.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Transactional
    public User saveUser(UserBo userBo) {
        User user = Orika.map(userBo, User.class);
        this.save(user);
        return user;
    }
}

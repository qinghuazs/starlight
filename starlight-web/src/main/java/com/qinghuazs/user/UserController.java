package com.qinghuazs.user;

import com.qinghuazs.bo.UserBo;
import com.qinghuazs.response.WebResponse;
import com.qinghuazs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "save")
    public WebResponse saveUser(@RequestBody UserBo user) {
        return WebResponse.success(userService.saveUser(user));
    }
}

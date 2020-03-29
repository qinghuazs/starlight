package com.qinghuazs.user;

import com.qinghuazs.bo.UserBo;
import com.qinghuazs.response.WebResponse;
import com.qinghuazs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "save")
    public WebResponse saveUser(@RequestBody @Valid UserBo user) {
        return WebResponse.success(userService.saveUser(user));
    }

    @GetMapping("/")
    public WebResponse getUsers() {
        return WebResponse.success(userService.getAllUser());
    }
}

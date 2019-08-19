package com.cyx.springboot.controller;

import com.alibaba.fastjson.JSONObject;
import com.cyx.springboot.annotation.CheckToken;
import com.cyx.springboot.annotation.LoginToken;
import com.cyx.springboot.dto.User;
import com.cyx.springboot.jwt.JwtUtil;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class UserController {
    //登录
    @PostMapping("/login")
    @LoginToken
    public Object login(@RequestBody @Valid User user) {

        JSONObject jsonObject = new JSONObject();
        User userForBase =new User();
        userForBase.setId(2);
        userForBase.setUserName("李四");
        userForBase.setPassword("abcdef");
        if (userForBase == null) {
            jsonObject.put("message", "登录失败,用户不存在");
            return jsonObject;
        } else {
            if (!userForBase.getPassword().equals(user.getPassword())) {
                jsonObject.put("message", "登录失败,密码错误");
                return jsonObject;
            } else {
                String token = JwtUtil.createJWT(6000000, userForBase);
                jsonObject.put("token", token);
                jsonObject.put("user", userForBase);
                return jsonObject;
            }
        }
    }

    //查看个人信息
    @CheckToken
    @GetMapping("/getMessage")
    public String getMessage() {
        return "你已通过验证";
    }
}

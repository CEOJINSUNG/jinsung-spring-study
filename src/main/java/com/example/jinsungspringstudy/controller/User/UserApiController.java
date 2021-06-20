package com.example.jinsungspringstudy.controller.User;

import com.example.jinsungspringstudy.domain.User.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserApiController {

    @GetMapping("/data")
    public void userLogin() {
        User user = new User();
        System.out.println(user.toString());
    }

}

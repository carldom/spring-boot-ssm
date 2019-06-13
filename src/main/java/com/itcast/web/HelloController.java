package com.itcast.web;

import com.itcast.pojo.User;
import com.itcast.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;

/**
 * @author Carl
 * @date 2019/6/12 0012 - 下午 3:44
 */
@Slf4j
@RestController
@RequestMapping("user")
public class HelloController {

//    @Autowired
//    private DataSource dataSource;

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public User hello(@PathVariable("id")Long id){
        return userService.queryById(id);


//        System.out.println("hello method is running");
//        return "hello,spring boot";
    }
}

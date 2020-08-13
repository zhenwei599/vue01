package com.baizhi.controller;

import com.baizhi.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
@CrossOrigin //允许跨域请求
public class UserController {
    int a =10; 
    int b=20;

    @GetMapping("/user/findOne")
    public Map<String,Object> findOne(String id){
        log.info("当前前接受的参数为:"+id    );
        log.info("进入controller");
        HashMap<String, Object> map = new HashMap<>();
        map.put("status",true);
        map.put("msg","你好");
//        throw new RuntimeException("出错");
        System.out.println("在IDEA中添加一行代码");
        return map;
    }
    @PostMapping("/user/save")
    public Map<String,Object> save(@RequestBody User user){
        HashMap<String, Object> map = new HashMap<>();
        log.info("接受的参数为："+user);

        return map ;

    }


}

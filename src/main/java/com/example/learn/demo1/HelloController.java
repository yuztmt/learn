package com.example.learn.demo1;

import com.example.learn.api.Man;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("测试")
public class HelloController {
    @RequestMapping("/index")
    public String HelloWorld(){
        return "HelloWorld!!";
    }


    public String getMan(){
        Man man = new Man();
        String name = man.getName();
        return name;
    }


}

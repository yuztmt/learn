package com.example.learn.swagger2;

import com.example.learn.api.User;
import com.example.learn.api.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Api("swaggerDemoController测试api")
public class SwaggerDemoController {

    private static final Logger logger= LoggerFactory.getLogger(SwaggerDemoController.class);

    @ApiOperation(value = "根据id查询用户", notes = "查询用户信息")
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public User getUser(){
        return new User(1, "one","yu","a123");
    }
}

package com.example.learn.swagger2;

import com.example.learn.api.User;
import com.example.learn.api.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Api("swaggerDemoController测试api")
public class SwaggerDemoController {

    @Autowired
    private UserService userService;

    private static final Logger logger= LoggerFactory.getLogger(SwaggerDemoController.class);

    @ApiOperation(value = "根据id查询用户", notes = "查询用户信息")
    @ApiImplicitParam(name = "id",value = "用户id",required = true)
    @RequestMapping(value = "/getuser",method = RequestMethod.GET)
    public User getUser(@PathVariable String id){
        return userService.getUser(id);
    }
}

package com.example.learn.demo2;

import com.example.learn.api.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
@Api(value = "api测试", description = "api测试 -test")
public class TestAmmeterTollsController {
    static Map<String, User> users = Collections.synchronizedMap(new HashMap<String, User>());
    //1.post
    @ApiOperation(value = "创建对象", notes = "根据User对象创建用户")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postUser(User user, @RequestParam(defaultValue = "false") boolean flag, String version) {
        System.out.println("添加用户"+user.toString());
        return "ok";
    }

    //2.get
    @ApiOperation(value = "获取列表",notes = "返回List<?>类型信息的JSON")
    @RequestMapping(value = {"/list"}, method=RequestMethod.GET)
    public List<User> getUserList() {
        List<User> users = new ArrayList<>();
        for (int q=1;q<10;q++) {
            User user = new User();
            user.setBaseId(q);
            users.add(user);
        }
        return users;
    }

    //3.get/{id}
    @ApiOperation(value = "获取详细信息", notes = "根据id来获取详细信息")
    //描述容器
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String",paramType = "path")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable String id) {
        User user = new User();
        System.out.println("获取id为"+id+"用户");
        user.setBaseId(Integer.valueOf(id));
        return user;
    }
    //4.delete
    @ApiOperation(value = "删除用户", notes = "根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String", paramType = "path")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable String id) {
        System.out.printf("删除id为：%s为用户",id);
        System.out.println();
        return "ok";
    }


}

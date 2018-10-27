package cn.ibilidi.controller;

import cn.ibilidi.global.GlobalConstants;
import cn.ibilidi.model.User;
import cn.ibilidi.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(description = "用户相关接口")
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @ApiOperation(value = "注册用户")
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public Map<String,Object> registerUser(@RequestBody User user){
        Map<String,Object> res=new HashMap<>();
        if ( userService.insertUser(user)!=0){
            res.put(GlobalConstants.MESSAGE,"succss");
        }else {
            res.put(GlobalConstants.MESSAGE,"fail");
        }
        return res;
    }

    @ApiOperation(value = "更新用户信息")
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Map<String,Object> updateUserInfo(@RequestBody User user){
        Map<String,Object> res=new HashMap<>();
        if ( userService.updateUser(user)!=0){
            res.put(GlobalConstants.MESSAGE,"succss");
        }else {
            res.put(GlobalConstants.MESSAGE,"fail");
        }
        return res;
    }

    @ApiOperation(value = "根据openid获得用户信息")
    @RequestMapping(value = "/getuserbyopenid",method = RequestMethod.GET)
    public  Map<String,Object> getUserByOpenid(@RequestParam String openid){
        Map<String,Object> res=new HashMap<>();
        User user=userService.finduserbyopenid(openid);
        res.put(GlobalConstants.DATA,user);
        res.put(GlobalConstants.MESSAGE,"success");
        return res;
    }

    @ApiOperation(value = "根据学号获得用户信息")
    @RequestMapping(value = "/getuserbyxh",method = RequestMethod.GET)
    public  Map<String,Object> getUserByXh(@RequestParam String xh){
        Map<String,Object> res=new HashMap<>();
        User user=userService.finduserbyxh(xh);
        res.put(GlobalConstants.DATA,user);
        res.put(GlobalConstants.MESSAGE,"success");
        return res;
    }
}

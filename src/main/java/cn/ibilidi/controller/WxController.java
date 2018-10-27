package cn.ibilidi.controller;

import cn.ibilidi.service.IWxService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Api(description = "微信小程序相关接口")
@RestController
@RequestMapping(value = "/wx")
public class WxController {
    @Autowired
    private IWxService wxService;

    @ApiOperation(value = "获得用户openid")
    @RequestMapping(value="/login",method = RequestMethod.GET)
    public Map<String,Object> wxLogin(@RequestParam String code){
        return wxService.getWxOpenid(code);
    }

    @ApiOperation(value = "获取access_token")
    @RequestMapping(value = "/gettoken",method = RequestMethod.GET)
    public Map<String,Object> getToken(){
        return wxService.getWxToken();
    }
}

package cn.ibilidi.controller;

import cn.ibilidi.model.Template;
import cn.ibilidi.service.IBookService;
import cn.ibilidi.service.IMessageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(description = "发送小程序模板消息相关接口")
@RestController
@RequestMapping(value = "/message")
public class MessageController {
    @Autowired
    private IBookService bookService;

    @Autowired
    private IMessageService messageService;

    @ApiOperation(value = "发送模板消息")
    @RequestMapping(value = "/sendmessage",method = RequestMethod.POST)
    public Map<String,Object> sendMessage(@RequestBody Template template, @RequestParam String template_id, @RequestParam String openid){
        messageService.sendFormMessage(template,template_id,openid);
        Map<String,Object> res=new HashMap<>();
        return res;
    }
}

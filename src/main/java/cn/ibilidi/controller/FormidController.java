package cn.ibilidi.controller;

import cn.ibilidi.model.Formid;
import cn.ibilidi.service.IFormidService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(description = "存取formid相关接口")
@RestController
@RequestMapping(value = "/formid")
public class FormidController {
    @Autowired
    private IFormidService formidService;

    @ApiOperation(value = "增加formid")
    @RequestMapping(value = "/addformids",method = RequestMethod.POST)
    int addFormids(@RequestBody List<Formid> formids){
        return formidService.addFormids(formids);
    }
}

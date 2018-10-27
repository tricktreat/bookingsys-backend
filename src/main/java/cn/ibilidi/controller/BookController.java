package cn.ibilidi.controller;

import cn.ibilidi.global.GlobalConstants;
import cn.ibilidi.model.BookItem;
import cn.ibilidi.service.IBookService;
import cn.ibilidi.service.IMessageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Api(description = "预约、审批服务相关接口")
@RestController
@RequestMapping(value = "/book")
public class BookController {
    @Autowired
    private IBookService bookService;

    @Autowired
    private IMessageService messageService;

    @ApiOperation(value = "增加预约记录")
    @RequestMapping(value = "/addbook",method = RequestMethod.POST)
    public Map<String,Object> addBook(@RequestBody BookItem bookItem){
        HashMap<String,Object> res=new HashMap<>();
        try {
            res.put(GlobalConstants.DATA,bookService.addBook(bookItem));
            res.put(GlobalConstants.MESSAGE,"success");
        }catch (Exception e)
        {
            res.put(GlobalConstants.MESSAGE,"fail");
        }
        return res;
    }

    @ApiOperation(value = "获得指定日期后的预约记录")
    @RequestMapping(value = "/getbooks",method = RequestMethod.GET)
    public Map<String,Object> getBooksAfterSj(@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date sj) {
        HashMap<String, Object> res = new HashMap<>();
        res.put(GlobalConstants.MESSAGE, "success");
        res.put(GlobalConstants.DATA,bookService.getBookitemsAfterSj(sj));
        return res;
    }

    @ApiOperation(value = "获得指定日期的教室预约详情")
    @RequestMapping(value = "/getbookdetails",method = RequestMethod.GET)
    public  Map<String,Object> getBookdetailsByDate(@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date date){
        HashMap<String, Object> res = new HashMap<>();
        res.put(GlobalConstants.MESSAGE, "success");
        res.put(GlobalConstants.DATA,bookService.getBookdetailsByDate(date));
        return res;
    }

    @ApiOperation(value = "审批指定bookid的预约")
    @RequestMapping(value = "/changebookstatus",method = RequestMethod.GET)
    public Map<String,Object> changeBookState(@RequestParam int status,@RequestParam String bookid){
        HashMap<String, Object> res = new HashMap<>();
        res.put(GlobalConstants.MESSAGE, "success");
        res.put(GlobalConstants.DATA,bookService.updateBook(status,bookid));
        return res;
    }

    @ApiOperation(value = "取消指定bookid的预约")
    @RequestMapping(value = "/cancelbook",method = RequestMethod.GET)
    public Map<String,Object> cancelBook(@RequestParam String bookid){
        HashMap<String, Object> res = new HashMap<>();
        res.put(GlobalConstants.MESSAGE, "success");
        res.put(GlobalConstants.DATA,bookService.cancelBook(bookid));
        return res;
    }
}

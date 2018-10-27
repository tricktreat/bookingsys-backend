package cn.ibilidi.serviceimp;

import cn.ibilidi.global.GlobalConstants;
import cn.ibilidi.model.Formid;
import cn.ibilidi.model.Message;
import cn.ibilidi.model.Template;
import cn.ibilidi.service.IFormidService;
import cn.ibilidi.service.IMessageService;
import cn.ibilidi.service.IWxService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MessageServiceImp implements IMessageService {
    @Autowired
    private IFormidService formidService;

    @Autowired
    private IWxService wxService;


    String requsetPOST(String url, String data){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers=new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);

        HttpEntity<String> entity = new HttpEntity<String>(data,headers);
        ResponseEntity<String> response = restTemplate.postForEntity(url, entity, String.class);
        System.out.println(response.getBody());
        return response.getBody();
    }

    @Override
    public void sendFormMessage(Template template, String template_id) {
        String TEMPLATE_ID=template_id;
        List<Formid> formids=formidService.getFormids();
        String url= GlobalConstants.WX_TEMPLETE_URL+wxService.getWxToken().get("access_token");

        Message message=new Message();
        for (Formid formid:formids) {
            message.setForm_id(formid.getFormid());
            message.setPage("/pages/index/index");
            message.setTouser(formid.getOpenid());
            message.setTemplate_id(TEMPLATE_ID);
            //message.setEmphasis_keyword("keyword1.DATA");
            message.setData(template);
            String data= JSON.toJSONString(message);
            requsetPOST(url,data);
        }
    }
}

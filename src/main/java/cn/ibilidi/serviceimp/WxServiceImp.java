package cn.ibilidi.serviceimp;

import cn.ibilidi.global.GlobalConstants;
import cn.ibilidi.service.IWxService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class WxServiceImp implements IWxService {

    JsonNode RequsetGET(String url){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(url , String.class);

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = null;
        try {
            root = mapper.readTree(response.getBody());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return root;
    }

    @Override
    public Map<String, Object> getWxOpenid(String code) {

        JsonNode root=RequsetGET(GlobalConstants.WX_LOGIN_URL+code);
        Map<String,Object> m=new HashMap<>();
        m.put("openid",root.path("openid").asText());
        m.put("session_key",root.path("session_key").asText());
        Map<String,Object> res=new HashMap<>();
        res.put(GlobalConstants.DATA,m);
        res.put(GlobalConstants.MESSAGE,"success");
        return res;
    }

    @Override
    public Map<String, Object> getWxToken() {
        JsonNode root=RequsetGET(GlobalConstants.WX_TOKEN_URL);
        Map<String,Object> m=new HashMap<>();
        m.put("access_token",root.path("access_token").asText());
        m.put("expire_in",root.path("expire_in").asText());

        return m;
    }
}

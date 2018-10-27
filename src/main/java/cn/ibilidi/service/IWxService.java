package cn.ibilidi.service;

import java.util.Map;

public interface IWxService {
    Map<String,Object> getWxOpenid(String code);
    Map<String,Object> getWxToken();
}

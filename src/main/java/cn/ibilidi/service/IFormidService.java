package cn.ibilidi.service;

import cn.ibilidi.model.Formid;

import java.util.Date;
import java.util.List;

public interface IFormidService {
    int addFormids(List<Formid> formids);
    Formid getFormid(String openid, Date expire);
    List<Formid> getFormids();

}

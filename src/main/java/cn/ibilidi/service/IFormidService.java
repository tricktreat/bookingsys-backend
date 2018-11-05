package cn.ibilidi.service;

import cn.ibilidi.model.Formid;

import java.util.List;

public interface IFormidService {
    int addFormids(List<Formid> formids);
    List<Formid>  getFormid(String openid);
    List<Formid> getFormids();

}

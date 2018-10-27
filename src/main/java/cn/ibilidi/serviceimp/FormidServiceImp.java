package cn.ibilidi.serviceimp;

import cn.ibilidi.mapper.FormidMapper;
import cn.ibilidi.mapper.ManagerMapper;
import cn.ibilidi.model.Formid;
import cn.ibilidi.model.Manager;
import cn.ibilidi.service.IFormidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class FormidServiceImp implements IFormidService {
    @Autowired
    private FormidMapper formidMapper;

    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public int addFormids(List<Formid> formids) {
        int count=0;
        for (Formid formid:formids) {
            count+=formidMapper.insert(formid);
        }
        return count;
    }

    @Override
    public Formid getFormid(String openid, Date expire) {
        return formidMapper.getformid(openid,expire);
    }

    @Override
    public List<Formid> getFormids() {
        List<Manager> managers=managerMapper.getmanagers();
        List<Formid> formids=new ArrayList<>();
        for (Manager m:managers) {
            String openid=m.getOpenid();
            Date now=new Date();
            formids.add(formidMapper.getformid(openid,now));
            formidMapper.update(openid,now);
        }
        return formids;
    }


}

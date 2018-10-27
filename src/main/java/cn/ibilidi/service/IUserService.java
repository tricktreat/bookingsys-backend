package cn.ibilidi.service;

import cn.ibilidi.model.User;

public interface IUserService {
    int insertUser(User user);
    int updateUser(User user);
    User finduserbyopenid(String openid);
    User finduserbyxh(String xh);
}

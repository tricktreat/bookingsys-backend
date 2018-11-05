package cn.ibilidi.serviceimp;

import cn.ibilidi.mapper.UserMapper;
import cn.ibilidi.model.User;
import cn.ibilidi.service.IUserService;
import com.vdurmont.emoji.EmojiParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements IUserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public int insertUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int updateUser(User user) {

        String nc=user.getNc();
        user.setNc(EmojiParser.removeAllEmojis(nc));
        return userMapper.update(user);
    }

    @Override
    public User finduserbyopenid(String openid) {
        return userMapper.finduserbyopenid(openid);
    }

    @Override
    public User finduserbyxh(String xh) {
        return userMapper.finduserbyxh(xh);
    }
}

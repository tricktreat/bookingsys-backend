package cn.ibilidi.mapper;

import cn.ibilidi.model.User;

import java.util.List;

import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    @Insert("insert into users(openid,xm,xh,sjh,zy,headurl,nc) values(#{openid},#{xm},#{xh},#{sjh},#{zy},#{headurl},#{nc})")
    int insert(User user);

    @Update("update users set nc=#{nc},headurl=#{headurl},xm=#{xm},zy=#{zy},sjh=#{sjh},xh=#{xh} where openid=#{openid}")
    int update(User user);

    @Select("select * from users where openid=#{openid} limit 1")
    User finduserbyopenid(@Param(value = "openid") String openid);

    @Select("select * from users where xh=#{xh}")
    User finduserbyxh(@Param(value = "xh") String xh);


}
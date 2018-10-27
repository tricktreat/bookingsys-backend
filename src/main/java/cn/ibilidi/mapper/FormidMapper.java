package cn.ibilidi.mapper;

import cn.ibilidi.model.Formid;
import org.apache.ibatis.annotations.*;

import java.util.Date;

@Mapper
public interface FormidMapper {
    @Insert("insert into formids(openid,formid,expire) values(#{openid},#{formid},#{expire})")
    int insert(Formid formId);

    @Select("select * from formids where openid=#{openid} and expire>#{now} and used=0 limit 1")
    Formid getformid(@Param(value = "openid") String openid,@Param(value = "now") Date now);

    @Update("update formids set used=1 where used=0 and openid=#{openid} and expire>#{now} limit 1")
    int update(@Param(value = "openid") String openid,@Param(value = "now") Date now);
}

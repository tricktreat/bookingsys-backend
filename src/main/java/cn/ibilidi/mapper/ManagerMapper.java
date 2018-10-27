package cn.ibilidi.mapper;

import cn.ibilidi.model.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ManagerMapper {
    @Select("select * from managers")
    List<Manager> getmanagers();
}

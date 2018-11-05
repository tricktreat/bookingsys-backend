package cn.ibilidi.mapper;

import cn.ibilidi.model.BookItem;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

@Mapper
public interface BookItemMapper {
    @Insert("insert into bookrequests(bookid,openid,status,yysj,comment,tools) values(#{bookid},#{openid},#{status},#{yysj},#{comment},#{tools})")
    int insert(BookItem bookItem);

    @Select("select * from bookrequests where yysj>=#{sj}")
    @Results({
            @Result(property = "openid",column = "openid"),
            @Result(property = "bookid",column = "bookid"),
            @Result(property = "bookdetaillist",column = "bookid",many = @Many(select = "cn.ibilidi.mapper.BookDetailMapper.getBookdetailsByBookid")),
            @Result(property = "user",column = "openid",one = @One(select = "cn.ibilidi.mapper.UserMapper.finduserbyopenid"))

    })
    List<BookItem> getBookItems(@Param(value = "sj")Date sj);

    @Update("update bookrequests set status=#{status} where bookid=#{bookid}")
    int update(@Param(value="status") int status,@Param(value = "bookid")String bookid);

    @Delete("delete from bookrequests where bookid=#{bookid}")
    int delete(@Param(value="bookid") String bookid);
}

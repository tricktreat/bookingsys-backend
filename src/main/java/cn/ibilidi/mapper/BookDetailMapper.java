package cn.ibilidi.mapper;

import cn.ibilidi.model.BookDetail;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

@Mapper
public interface BookDetailMapper {
    @Insert("insert into bookdetails(bookid,date,sjindex,status) values(#{bookid},#{date},#{sjindex},#{status})")
    int insert(BookDetail bookDetail);

    @Select("select * from bookdetails where bookid=#{bookid}")
    List<BookDetail> getBookdetailsByBookid(@Param(value="bookid") String bookid);

    @Select("select * from bookdetails where date=#{date}")
    List<BookDetail> getBookdetailsByDate(@Param(value="date") Date date);

    @Update("update bookdetails set status=#{status} where bookid=#{bookid}")
    int update(@Param(value = "status") int status,@Param(value="bookid") String bookid);

    @Delete("delete from bookdetails where bookid=#{bookid}")
    int delete(@Param(value="bookid") String bookid);
}

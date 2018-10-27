package cn.ibilidi.service;


import cn.ibilidi.model.BookDetail;
import cn.ibilidi.model.BookItem;

import java.util.Date;
import java.util.List;

public interface IBookService {
    int addBook(BookItem bookItem);
    List<BookItem> getBookitemsAfterSj(Date sj);
    List<BookDetail> getBookdetailsByDate(Date date);
    int updateBook(int status,String bookid);
    int cancelBook(String bookid);
}
